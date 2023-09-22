package com.inteliense.aloft.server.html.elements.css;

import com.inteliense.aloft.server.html.StaticSourceFile;

public class StylesheetRenderer {

    public static StaticSourceFile render(StylesheetEndpoint css) {
        return new StaticSourceFile(css.getStylesheet().getFile().getPath(), css.getStylesheet().getValue(), "text/css");
    }

}
