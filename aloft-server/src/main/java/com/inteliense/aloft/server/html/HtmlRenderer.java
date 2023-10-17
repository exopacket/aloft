package com.inteliense.aloft.server.html;

import com.inteliense.aloft.compiler.lang.keywords.AloftTheme;
import com.inteliense.aloft.compiler.lang.keywords.components.AloftComponent;
import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftElement;
import com.inteliense.aloft.compiler.lang.keywords.AloftPage;
import com.inteliense.aloft.server.http.supporting.Endpoint;

public class HtmlRenderer {

    public static Html render(AloftPage page, AloftTheme theme) {
        return new Html(RenderType.PAGE, page, theme);
    }

    public static Html render(AloftComponent component, AloftTheme theme) {
        return new Html(RenderType.COMPONENT, component, theme);
    }

    public static Html render(AloftElement element, AloftTheme theme) {
        return new Html(RenderType.ELEMENT, element, theme);
    }

}
