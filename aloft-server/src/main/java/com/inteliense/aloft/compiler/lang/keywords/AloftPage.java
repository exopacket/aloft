package com.inteliense.aloft.compiler.lang.keywords;

import com.inteliense.aloft.application.config.AppConfig;
import com.inteliense.aloft.compiler.lang.base.AssertsLanguage;
import com.inteliense.aloft.compiler.lang.base.BuildsHtml;
import com.inteliense.aloft.compiler.lang.base.BuildsJava;
import com.inteliense.aloft.compiler.lang.keywords.elements.types.TextAloftElement;
import com.inteliense.aloft.compiler.lang.keywords.listeners.base.AloftListener;
import com.inteliense.aloft.compiler.lang.supporting.FunctionDecipher;
import com.inteliense.aloft.compiler.lang.supporting.MountPoint;
import com.inteliense.aloft.compiler.lang.supporting.MountableComponent;
import com.inteliense.aloft.server.html.elements.HtmlElement;
import com.inteliense.aloft.server.html.elements.types.Body;
import com.inteliense.aloft.server.html.elements.types.Head;
import com.inteliense.aloft.server.html.elements.types.Page;

import java.util.ArrayList;

public class AloftPage implements BuildsJava, AssertsLanguage, BuildsHtml {

    private String path = null;
    private String favicon = null;
    private String title = null;
    private ArrayList<Meta> meta = new ArrayList<>();
    private ArrayList<MountableComponent> mountables = new ArrayList<>();
    private MountPoint mount;

    public AloftPage(String path, AppConfig appConfig) {
        this.path = path;
    }
    
    public AloftPage(String path, String favicon, String title) {
        this.path = path;
        this.favicon = favicon;
        this.title = title;
    }
    
    public void setPath(String path) {
        this.path = path;
    }
    
    public void setFavicon(String favicon) {
        this.favicon = favicon;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public void appendMeta(Meta meta) {
        this.meta.add(meta);
    }

    public void appendMountable(MountableComponent mountable) {
        this.mountables.add(mountable);
    }

    public void setMountPoint(MountPoint mountPoint) {
        this.mount = mountPoint;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public HtmlElement html() {
        return buildPage();
    }

    private Page buildPage() {
        Page page = new Page();
        page.addChild(buildHead("Hello World!", null, new ArrayList<>()));
        page.addChild(buildBody());
        return page;
    }

    private Body buildBody() {
        TextAloftElement textElement = new TextAloftElement("Hello World!\n\nSincerely yours,\n- Server.") {
            @Override
            protected AloftListener[] listeners() {
                return new AloftListener[0];
            }
        };
        Body body = new Body();
        body.addChild(textElement.html());
        return body;
    }

    private Head buildHead(String title, String favicon, ArrayList<AloftPage.Meta> meta) {
        Head head = new Head();
        head.addTitle(title);
        return head;
    }

    public class Meta {

    }

}
