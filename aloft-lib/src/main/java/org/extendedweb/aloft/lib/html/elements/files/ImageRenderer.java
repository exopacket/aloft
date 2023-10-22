package org.extendedweb.aloft.lib.html.elements.files;

import org.extendedweb.aloft.lib.html.StaticSourceFile;

public class ImageRenderer {

    public static StaticSourceFile render(ImageEndpoint js) {
        return new StaticSourceFile(js.getImg().getFile().getPath(), js.getImg().getValue(), "image/png");
    }

    public static StaticSourceFile renderFavicon(ImageEndpoint js) {
        return new StaticSourceFile(js.getImg().getFavicon().getPath(), js.getImg().getValue(), "image/png");
    }

}
