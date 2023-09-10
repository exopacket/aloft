package com.inteliense.aloft.server.html;

import com.inteliense.aloft.compiler.lang.keywords.AloftComponent;
import com.inteliense.aloft.compiler.lang.keywords.AloftElement;
import com.inteliense.aloft.compiler.lang.keywords.AloftPage;

public class HtmlRenderer {

    public static Html render(AloftPage page) {
        return new Html(RenderType.PAGE);
    }

    public static Html render(AloftComponent component) {
        return new Html(RenderType.COMPONENT);
    }

    public static Html render(AloftElement element) {
        return new Html(RenderType.ELEMENT);
    }

}
