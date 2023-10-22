package org.extendedweb.aloft.lib.html.elements.css;

public class Font {

    private FontBuilder font;

    public Font(FontBuilder font) {
        this.font = font;
    }

    public byte[] getBytes() {
        return font.getBytes();
    }

    public String getPath() {
        return font.getPath();
    }

}
