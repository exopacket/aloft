package com.inteliense.aloft.compiler.lang.keywords;

import com.inteliense.aloft.compiler.lang.base.BuildsCss;
import com.inteliense.aloft.compiler.lang.base.BuildsJava;
import com.inteliense.aloft.compiler.lang.keywords.style.base.AloftStyleClass;
import com.inteliense.aloft.compiler.lang.keywords.style.base.AloftStyleClassBuilder;
import com.inteliense.aloft.compiler.lang.keywords.style.base.AloftStyleHashList;
import com.inteliense.aloft.compiler.lang.lib.BootstrapModule;
import com.inteliense.aloft.compiler.lang.lib.IconsModule;
import com.inteliense.aloft.compiler.lang.lib.StyleModule;
import com.inteliense.aloft.compiler.lang.lib.colors.Color;
import com.inteliense.aloft.compiler.lang.lib.colors.Colors;
import com.inteliense.aloft.utils.encryption.A32;
import com.inteliense.aloft.utils.encryption.Rand;

import javax.swing.text.Style;
import java.util.ArrayList;
import java.util.HashMap;

// add 'default MyElement.color: #ff000' to syntax

public class AloftTheme implements BuildsJava {

    private AloftStyleClassBuilder classBuilder = new AloftStyleClassBuilder();
    private ArrayList<AloftStyleClass> classes = new ArrayList<>();

    private Colors colors;

    private StyleModule module;

    private boolean useBootstrap = false;
    private boolean useDefaultIcons = false;
    private boolean useDefaultFont = false;

    public AloftTheme() { }

    public AloftTheme(StyleModule module) { this.module = module; }

    public ArrayList<AloftStyleClass> mergeByHash(HashMap<String, ArrayList<AloftStyleHashList>> hashes) {
        ArrayList<AloftStyleClass> v = new ArrayList<AloftStyleClass>();
        for(String key : hashes.keySet()) {
            ArrayList<AloftStyleClass> c = this.classBuilder.merge(this.classes, hashes.get(key), key);
            v.addAll(c);
            for(AloftStyleClass n : c) {
                if(!this.classBuilder.globalExists(n)) {
                    this.classes.add(n);
                    this.classBuilder.appendGlobalClass(n);
                }
            }
        }
        return v;
    }

    public void setUsesBootstrap() {
        useBootstrap = true;
        module = new BootstrapModule();
    }

    public void setIconModule(IconsModule module) {
        this.module.setIcons(module);
    }

    public void setColors(Colors colors) {
        this.colors = colors;
        this.module.registerColors(colors);
    }

    public Color color(String key) {
        return color(key, Colors.Shade.DEFAULT);
    }

    public Color color(String key, Colors.Shade shade) {
        return colors.get(key, shade);
    }

    public boolean usesBootstrap() {
        return useBootstrap;
    }

    public void setUsesDefaultIcons() {
        useDefaultIcons = true;
    }

    public boolean usesDefaultIcons() {
        return useDefaultIcons;
    }

    public void setUsesDefaultFont() {
        useDefaultFont = true;
    }

    public boolean usesDefaultFont() {
        return useDefaultFont;
    }

    public StyleModule getStyleModule() {
        return this.module;
    }

}
