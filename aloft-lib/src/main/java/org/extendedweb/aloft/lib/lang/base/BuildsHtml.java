package org.extendedweb.aloft.lib.lang.base;

import org.extendedweb.aloft.lib.lang.structure.AloftTheme;
import org.extendedweb.aloft.lib.html.elements.HtmlElement;

public interface BuildsHtml {
    HtmlElement html(AloftTheme theme, ElementMapper mapper);
    HtmlElement create(AloftTheme theme, ElementMapper mapper);
}
