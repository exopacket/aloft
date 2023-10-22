package org.extendedweb.aloft.lib.colors;

public class Swatch {

    private Color def;
    private Color light;
    private Color dark;

    public Swatch(Color def, Color light, Color dark) {
        this.def = def;
        this.light = light;
        this.dark = dark;
    }

    public Color base() {
        return this.def;
    }

    public Color light() {
        return this.light;
    }

    public Color dark() {
        return this.dark;
    }

}
