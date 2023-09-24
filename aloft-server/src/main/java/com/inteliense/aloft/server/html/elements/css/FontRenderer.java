package com.inteliense.aloft.server.html.elements.css;

import com.inteliense.aloft.server.html.StaticSourceFile;

public class FontRenderer {

    public static StaticSourceFile render(FontEndpoint font) {
        return new StaticSourceFile(font.getFont().getPath(), font.getFont().getBytes(), "application/font-woff");
    }

}
