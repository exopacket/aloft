package com.inteliense.aloft.compiler.lang.base;

import com.inteliense.aloft.compiler.lang.lib.StyleModule;
import com.inteliense.aloft.server.html.elements.HtmlElement;

public interface BuildsHtml {
    HtmlElement html(StyleModule module);
}
