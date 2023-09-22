package com.inteliense.aloft.compiler.lang.keywords;

import com.inteliense.aloft.compiler.lang.base.AssertsLanguage;
import com.inteliense.aloft.compiler.lang.base.BuildsHtml;
import com.inteliense.aloft.compiler.lang.base.BuildsJava;
import com.inteliense.aloft.compiler.lang.keywords.components.AloftScreen;
import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftElement;
import com.inteliense.aloft.compiler.lang.keywords.elements.types.AloftScreenContainer;
import com.inteliense.aloft.compiler.lang.keywords.elements.types.ButtonAloftElement;
import com.inteliense.aloft.compiler.lang.keywords.elements.types.TextAloftElement;
import com.inteliense.aloft.compiler.lang.keywords.listeners.types.AloftOnClickListener;
import com.inteliense.aloft.compiler.lang.keywords.style.base.AloftStyleClass;
import com.inteliense.aloft.compiler.lang.keywords.style.base.AloftStyleCss;
import com.inteliense.aloft.compiler.lang.keywords.style.base.AloftStyleHashList;
import com.inteliense.aloft.compiler.lang.supporting.MountableComponent;
import com.inteliense.aloft.server.html.elements.HtmlElement;
import com.inteliense.aloft.server.html.elements.types.Body;
import com.inteliense.aloft.server.html.elements.types.Head;
import com.inteliense.aloft.server.html.elements.types.Page;
import com.inteliense.aloft.server.http.supporting.*;

import java.awt.*;
import java.util.ArrayList;

public class AloftPage extends Endpoint implements BuildsJava, AssertsLanguage, BuildsHtml {

    private String favicon = null;
    private String title = null;
    private ArrayList<Meta> meta = new ArrayList<>();
    private MountableComponent root;
    private AloftStyleCss css = new AloftStyleCss();

    public AloftPage(Route route, RequestType type, AloftRequestType internalType, VariableTree vars) {
        super(route, type, internalType, vars);
    }

    public AloftPage(Route route, RequestType type, AloftRequestType internalType, VariableTree vars, AloftTheme theme) {
        super(route, type, internalType, vars, theme);
    }

//    public AloftPage(Route route) {
//        this.path = route.getPath();
//    }
//
//    public AloftPage(Route route, AppConfig appConfig) {
//        this.path = route.getPath();
//    }
//
//    public AloftPage(Route route, VariableTree vars) {
//        this.path = route.getPath();
//    }
//
//    public AloftPage(Route route, AppConfig appConfig, VariableTree vars) {
//        this.path = route.getPath();
//    }
//
//    public AloftPage(String path, String favicon, String title) {
//        this.path = path;
//        this.favicon = favicon;
//        this.title = title;
//    }
    
    public void setPath(RoutePath path) {
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

    public void testAppend() {
        AloftScreen screen = new AloftScreen();
//        screen.appendState("__root__.test", new StringT(), "value");
        AloftScreenContainer container = new AloftScreenContainer();
        TextAloftElement textElement = new TextAloftElement(this.vars.getByIndex(0).getValue() + "\n\nSincerely yours,\n- Server.");
        textElement.addListener(new AloftOnClickListener());
        TextAloftElement textSpan = new TextAloftElement("THIS IS A TEST PAGE.");
        textElement.addSpan(textSpan);
        textElement.addStyle("color", "blue");
        textElement.addStyle("font-weight", "bold");
        textElement.addStyle("text-decoration", "underline");
        textElement.addStyle("font-style", "italic");
        textElement.setClasses(this.theme.mergeByHash(textElement.getStyle().getHashes()));
        container.addChild(textElement);
        ButtonAloftElement btn = new ButtonAloftElement("This button does nothing.");
        container.addChild(btn);
        screen.addChild(container);
        this.root = screen;
        this.root.appendCss(this.css);
    }

    public AloftStyleCss getCss() {
        return css;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public HtmlElement html() {
        return buildPage();
    }


    private void buildCss() {
        this.root.appendCss(this.css);
    }

    private Page buildPage() {
        Page page = new Page();
        Body body = buildBody();
        page.addChild(buildHead("Hello World!", null, new ArrayList<>()));
        page.addChild(body);
        return page;
    }

    private Body buildBody() {
        testAppend();
        Body body = new Body();
        body.addChild(root.html());
        return body;
    }

    private Head buildHead(String title, String favicon, ArrayList<AloftPage.Meta> meta) {
        Head head = new Head();
        head.addTitle(title);
        head.addCss(css);
        return head;
    }

    public class Meta {

    }

}
