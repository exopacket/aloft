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

import javax.swing.text.Style;
import java.util.ArrayList;

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

    public ArrayList<AloftStyleClass> mergeByHash(ArrayList<AloftStyleHashList> hashes) {
            ArrayList[] v = this.classBuilder.merge(this.classes, hashes);
            this.classes = v[1];
            return v[0];
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
