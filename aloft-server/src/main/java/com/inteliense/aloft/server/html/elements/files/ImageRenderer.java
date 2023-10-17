package com.inteliense.aloft.server.html.elements.files;

import com.inteliense.aloft.server.html.StaticSourceFile;

public class ImageRenderer {

    public static StaticSourceFile render(ImageEndpoint js) {
        return new StaticSourceFile(js.getImg().getFile().getPath(), js.getImg().getValue(), "image/png");
    }

    public static StaticSourceFile renderFavicon(ImageEndpoint js) {
        return new StaticSourceFile(js.getImg().getFavicon().getPath(), js.getImg().getValue(), "image/png");
    }

}
