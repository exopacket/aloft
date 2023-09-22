package com.inteliense.aloft.server.html;

import com.inteliense.aloft.compiler.lang.keywords.components.AloftComponent;
import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftElement;
import com.inteliense.aloft.compiler.lang.keywords.AloftPage;
import com.inteliense.aloft.server.http.supporting.Endpoint;

public class HtmlRenderer {

    public static Html render(AloftPage page) {
        return new Html(RenderType.PAGE, page);
    }

    public static Html render(AloftComponent component) {
        return new Html(RenderType.COMPONENT, component);
    }

    public static Html render(AloftElement element) {
        return new Html(RenderType.ELEMENT, element);
    }

}
