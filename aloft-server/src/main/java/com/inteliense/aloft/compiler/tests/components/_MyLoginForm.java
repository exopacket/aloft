package com.inteliense.aloft.compiler.tests.components;

import com.inteliense.aloft.compiler.lang.keywords.components.AloftComponent;
import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftElement;
import com.inteliense.aloft.compiler.lang.keywords.elements.types.ButtonAloftElement;
import com.inteliense.aloft.compiler.lang.keywords.elements.types.CenteredAloftElement;
import com.inteliense.aloft.compiler.lang.keywords.elements.types.ColumnAloftElement;
import com.inteliense.aloft.compiler.lang.keywords.elements.types.TextAloftElement;
import com.inteliense.aloft.compiler.lang.lib._AloftComponent;
import com.inteliense.aloft.compiler.lang.lib.colors.Colors;
import com.inteliense.aloft.compiler.tests.elements._MyTextFieldElement;

import java.util.HashMap;

public class _MyLoginForm extends _AloftComponent {

    public _MyLoginForm() {
        addChild(a());
    }

    @Override
    public String getName() {
        return "__my_login_form__";
    }

    private AloftElement a() {
        CenteredAloftElement centered = new CenteredAloftElement();
        ColumnAloftElement column = new ColumnAloftElement();
        ButtonAloftElement btn = new ButtonAloftElement("__button_default__");
        TextAloftElement txt = new TextAloftElement("LOG IN");
        btn.setText("Sign in");
        btn.addSubclass("primary");
        btn.addSubclass("sm");
        column.addChild(txt);
        column.addChild(b());
        column.addChild(b());
        column.addChild(btn);
        centered.addChild(column);
        return centered;
    }

    private AloftElement b() {
        return new _MyTextFieldElement().build(new HashMap<>());
    }

}
