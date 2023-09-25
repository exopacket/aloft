package com.inteliense.aloft.compiler.lang.lib.colors;

import java.util.HashMap;

public class Colors {

    private HashMap<String, Swatch> swatches = new HashMap<>();

    public Colors(String red, String green, String blue) {
        create(ColorUtils.hexToRgb(red), ColorUtils.hexToRgb(green), ColorUtils.hexToRgb(blue));
    }

    public Colors(int[] red, int[] green, int[] blue) {
        create(red, green, blue);
    }

    public Color get(String key) {
        return swatches.get(key).base();
    }

    public Color get(String key, Shade shade) {
        if(shade == Shade.DARK) return swatches.get(key).dark();
        if(shade == Shade.LIGHT) return swatches.get(key).light();
        return swatches.get(key).base();
    }

    private void create(int[] red, int[] green, int[] blue) {
        float[] steps = new float[]{0,0,0};
        float r = ColorUtils.toHsv(red[0], red[1], red[2])[0] * 360;
        float g = ColorUtils.toHsv(green[0], green[1], green[2])[0] * 360;
        float b = ColorUtils.toHsv(blue[0], blue[1], blue[2])[0] * 360;
        steps[0] = (g - r) / 4;
        steps[1] = (b - g) / 4;
        steps[2] = ((r + 360) - b) / 4;
        mix(red, steps[0],  "red", "orange", "yellow", "chartreuse");
        mix(green, steps[1],  "green", "spring-green", "cyan", "azure");
        mix(blue, steps[2],  "blue", "violet", "magenta", "rose");
    }

    private void mix(int[] base, float step, String...names) {
        int[] v = base;
        for(int i=0; i<names.length; i++) {
            String name = names[i];
            int alpha = v.length == 4 ? v[3] : 255;
            Color def = new Color(v[0], v[1], v[2], alpha);
            float[] hsv = ColorUtils.toHsv(v[0], v[1], v[2]);
            float[] hsvDark = dark(hsv);
            float[] hsvLight = light(hsv);
            Color dark = new Color(ColorUtils.fromHsv(hsvDark, alpha));
            Color light = new Color(ColorUtils.fromHsv(hsvLight, alpha));
            swatches.put(name, new Swatch(def, light, dark));
            float[] next = new float[]{next(hsv[0], step), hsv[1], hsv[2]};
            v = ColorUtils.hexToRgb(ColorUtils.fromHsv(next, alpha));
        }
    }

    private float next(float v, float step) {
        return (360 * v) + step;
    }

    private float[] dark(float[] values) {
        double h = values[0];
        double s = values[1];
        double v = values[2];
        double d = v - 0.35;
        double x = s;
        if(d < 0) {
            x += (v * -1);
            d = 0;
        }
        double y = h;
        if(x >= 1.0) {
            y += x - 1.0;
            x = 1.0;
        }
        if(y >= 360) {
            y = y - 360;
        }
        return new float[]{(float) y * 360, (float) x, (float) d};
    }

    private float[] light(float[] values) {
        double h = values[0];
        double s = values[1];
        double v = values[2];
        double d = v + 0.35;
        double x = s;
        if(d >= 1.0) {
            x -= d - 1.0;
            d = 1.0;
        }
        double y = h;
        if(x < 0) {
            y -= (x * -1);
            x = 0;
        }
        if(y < 0) {
            y = 360 - (y * -1);
        }
        return new float[]{(float) y * 360, (float) x, (float) d};
    }

    public enum Shade {
        DEFAULT,
        LIGHT,
        DARK
    }

}
