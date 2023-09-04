package com.inteliense.aloft.server.html;

import com.inteliense.aloft.compiler.Component;
import com.inteliense.aloft.compiler.Element;
import com.inteliense.aloft.compiler.Page;

public class HtmlRenderer {

    public static Html render(Page page) {
        return new Html(RenderedType.PAGE);
    }

    public static Html render(Component component) {
        return new Html(RenderedType.COMPONENT);
    }

    public static Html render(Element element) {
        return new Html(RenderedType.ELEMENT);
    }

}
