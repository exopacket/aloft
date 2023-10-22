package org.extendedweb.aloft.lib.html;

import org.extendedweb.aloft.lib.application.config.AppConfig;
import org.extendedweb.aloft.lib.lang.structure.AloftTheme;
import org.extendedweb.aloft.lib.lang.structure.components.AloftComponent;
import org.extendedweb.aloft.lib.lang.structure.elements.base.AloftElement;
import org.extendedweb.aloft.lib.lang.structure.AloftPage;

public class HtmlRenderer {

    public static Html render(AloftPage page, AloftTheme theme, AppConfig config) {
        return new Html(RenderType.PAGE, page, theme, config);
    }

    public static Html render(AloftComponent component, AloftTheme theme, AppConfig config) {
        return new Html(RenderType.COMPONENT, component, theme, config);
    }

    public static Html render(AloftElement element, AloftTheme theme, AppConfig config) {
        return new Html(RenderType.ELEMENT, element, theme, config);
    }

}
