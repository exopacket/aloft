package org.extendedweb.aloft.lib.colors;

import org.extendedweb.aloft.utils.data.Hex;

import java.awt.Color;
import java.awt.image.ColorModel;

public class ColorUtils {

    public static int[] hexToRgb(String hex) {
        hex = hex.replace("#", "");
        return switch (hex.length()) {
            case 3 -> new int[]{
                    Integer.valueOf(hex.substring(0, 1) + hex.substring(0, 1), 16),
                    Integer.valueOf(hex.substring(1, 2) + hex.substring(1, 2), 16),
                    Integer.valueOf(hex.substring(2, 3) + hex.substring(2, 3), 16),
                    255
            };
            case 6 -> new int[]{
                    Integer.valueOf(hex.substring(0, 2), 16),
                    Integer.valueOf(hex.substring(2, 4), 16),
                    Integer.valueOf(hex.substring(4, 6), 16),
                    255
            };
            case 8 -> new int[]{
                    Integer.valueOf(hex.substring(0, 2), 16),
                    Integer.valueOf(hex.substring(2, 4), 16),
                    Integer.valueOf(hex.substring(4, 6), 16),
                    Integer.valueOf(hex.substring(6, 8), 16),
            };
            default -> new int[0];
        };
    }

    public static String rgbToHex(int red, int green, int blue) {
        return rgbToHex(new int[]{red, green, blue});
    }

    public static String rgbToHex(int red, int green, int blue, int alpha) {
        return rgbToHex(new int[]{red, green, blue, alpha});
    }

    public static String rgbToHex(int[] rgb) {
        String red = Hex.getHex(new byte[]{(byte) rgb[0]});
        String green = Hex.getHex(new byte[]{(byte) rgb[1]});
        String blue = Hex.getHex(new byte[]{(byte) rgb[2]});
        String alpha = (rgb.length == 4) ? Hex.getHex(new byte[]{(byte) rgb[3]}) : "";
        return "#" + red + green + blue + alpha;
    }

    public static String fromHsv(float[] v) {
        int rgb = Color.HSBtoRGB(v[0] / 360, v[1], v[2]);
        return rgbToHex(ColorModel.getRGBdefault().getRed(rgb), ColorModel.getRGBdefault().getGreen(rgb), ColorModel.getRGBdefault().getBlue(rgb));
    }

    public static String fromHsv(float[] v, int alpha) {
        int rgb = Color.HSBtoRGB(v[0] / 360, v[1], v[2]);
        return rgbToHex(ColorModel.getRGBdefault().getRed(rgb), ColorModel.getRGBdefault().getGreen(rgb), ColorModel.getRGBdefault().getBlue(rgb), alpha);
    }

    public static float[] toHsv(int red, int green, int blue) {
        float[] hsv = new float[3];
        Color.RGBtoHSB(red, green, blue, hsv);
        return hsv;
    }

    public static float intToFloat(int v) {
        float vv = (float) v;
        return vv / 255;
    }

}
