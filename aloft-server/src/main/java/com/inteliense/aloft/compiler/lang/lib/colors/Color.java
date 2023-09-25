package com.inteliense.aloft.compiler.lang.lib.colors;

public class Color {

    private int[] rgb = new int[]{0,0,0,255};

    public Color(String hex) {
        this.rgb = ColorUtils.hexToRgb(hex);
    }

    public Color(int r, int g, int b) {
        this.rgb = new int[]{r,g,b, 1};
    }

    public Color(int r, int g, int b, int a) {
        this.rgb = new int[]{r,g,b,a};
    }

    public String getHex() {
        return ColorUtils.rgbToHex(rgb);
    }

    public String getRgbaFunction() {
        return "rgba(" + rgb[0] + ", " + rgb[1] + ", " + rgb[2] + ", " + ColorUtils.intToFloat(rgb[3]) + ")";
    }

}
