package org.extendedweb.aloft.lib.html.elements.css;

import org.extendedweb.aloft.lib.html.StaticSourceFile;

public class FontRenderer {

    public static StaticSourceFile render(FontEndpoint font) {
        return new StaticSourceFile(font.getFont().getPath(), font.getFont().getBytes(), "application/font-woff");
    }

}
