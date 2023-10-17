package com.inteliense.aloft.compiler.lang.base;

import com.inteliense.aloft.compiler.lang.keywords.AloftTheme;
import com.inteliense.aloft.server.html.elements.HtmlElement;

public interface BuildsHtml {
    HtmlElement html(AloftTheme theme, ElementMapper mapper);
    HtmlElement create(AloftTheme theme, ElementMapper mapper);
}
