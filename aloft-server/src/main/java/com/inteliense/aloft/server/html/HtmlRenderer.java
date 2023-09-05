package com.inteliense.aloft.server.html;

import com.inteliense.aloft.compiler.lang.keywords.Component;
import com.inteliense.aloft.compiler.lang.keywords.Element;
import com.inteliense.aloft.compiler.lang.keywords.Page;

public class HtmlRenderer {

    public static Html render(Page page) {
        return new Html(RenderType.PAGE);
    }

    public static Html render(Component component) {
        return new Html(RenderType.COMPONENT);
    }

    public static Html render(Element element) {
        return new Html(RenderType.ELEMENT);
    }

}
