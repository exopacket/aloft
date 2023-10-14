package com.inteliense.aloft.compiler.tests.elements;

import com.inteliense.aloft.compiler.lang.keywords.AloftTheme;
import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftElement;
import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftElementSubtype;
import com.inteliense.aloft.server.html.elements.HtmlElement;

import java.util.ArrayList;
import java.util.HashMap;

public class _MyTextFieldElement {

    private HashMap<String, Object> data = new HashMap<>();

    public AloftElement build(HashMap<String, Object> vars) {
        this.data = vars;
        return new __();
    }

    private class __ extends AloftElement {

        @Override
        public HtmlElement html(AloftTheme theme) {
            return createElement("div");
        }

        @Override
        protected String name() {
            return "_my_text_field_element_";
        }

        @Override
        protected boolean acceptsIterator() {
            return false;
        }

        @Override
        protected boolean acceptsBuilder() {
            return false;
        }

        @Override
        protected boolean requiresBuilder() {
            return false;
        }

        @Override
        protected boolean isExtensible() {
            return false;
        }

        @Override
        protected boolean hasMultipleSubtypes() {
            return true;
        }

        @Override
        protected boolean acceptsChild() {
            return false;
        }

        @Override
        protected void setupVariables(HashMap<String, Object> vars) {
            vars.put("placeholder", null);
            setVariables();
        }

        private void setVariables() {
            for(String key : data.keySet()) vars.replace(key, data.get(key));
        }

        @Override
        protected void subtypes(ArrayList<AloftElementSubtype> subtypes) {

        }
    }
}
