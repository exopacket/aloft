package org.extendedweb.aloft.lib.html.elements.css;

import org.extendedweb.aloft.lib.html.StaticSourceFile;

public class StylesheetRenderer {

    public static StaticSourceFile render(StylesheetEndpoint css) {
        return new StaticSourceFile(css.getStylesheet().getFile().getPath(), css.getStylesheet().getValue(), "text/css");
    }

}
