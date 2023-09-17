package com.inteliense.aloft.compiler.lang.keywords;

import com.inteliense.aloft.compiler.application.config.AppConfig;
import com.inteliense.aloft.compiler.lang.base.AssertsLanguage;
import com.inteliense.aloft.compiler.lang.base.BuildsJava;
import com.inteliense.aloft.compiler.lang.supporting.FunctionDecipher;
import com.inteliense.aloft.compiler.lang.supporting.MountPoint;
import com.inteliense.aloft.compiler.lang.supporting.MountableComponent;

import java.util.ArrayList;

public class AloftPage implements BuildsJava, AssertsLanguage {

    private String path;
    private String favicon;
    private String title;
    private ArrayList<Meta> meta = new ArrayList<>();
    private ArrayList<MountableComponent> mountables = new ArrayList<>();
    private MountPoint mount;

    private FunctionDecipher decipher;
    
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
    
    public class Meta {
        
    }

}
