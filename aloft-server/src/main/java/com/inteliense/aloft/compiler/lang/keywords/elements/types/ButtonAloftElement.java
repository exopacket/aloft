package com.inteliense.aloft.compiler.lang.keywords.elements.types;

import com.inteliense.aloft.compiler.lang.base.ElementMapper;
import com.inteliense.aloft.compiler.lang.keywords.AloftTheme;
import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftElement;
import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftElementSubtype;
import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftIconPlacement;
import com.inteliense.aloft.compiler.lang.lib.colors.ColorUtils;
import com.inteliense.aloft.server.html.elements.HtmlElement;
import com.inteliense.aloft.server.html.elements.types.Content;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ButtonAloftElement extends AloftElement {

    public ButtonAloftElement() { super(); init(); }

    public ButtonAloftElement(String subtype) {
        super(subtype);
        init();
    }

    public void setText(String text) { this.vars.replace("text", text); }

    public void setIcon(IconAloftElement icon, AloftIconPlacement placement) {
        this.vars.replace("icon", icon);
        this.vars.replace("placement", placement);
    }

    public void setColors(String primary, String hover, String border) {
        this.vars.replace("color", primary);
        this.vars.replace("hover-color", hover);
        this.vars.replace("active-color", hover);
        this.vars.replace("pulse-shadow", "0 0 10px 20px " + primary);
        this.vars.replace("pulse-shadow-active", "0 0 0 0 " + primary);
        this.vars.replace("border-color", "solid 2px " + border);
    }

    public void setColors(String primary, String hover, String border, String active) {
        this.vars.replace("color", primary);
        this.vars.replace("hover-color", hover);
        this.vars.replace("active-color", active);
        this.vars.replace("pulse-color", primary);
        this.vars.replace("border-color", "solid 2px " + border);
    }

    public void setRing(String color) {
        int[] ringColor = ColorUtils.hexToRgb(color);
        this.vars.replace("ring-color", "0 0 0 0.25rem rgba(" + ringColor[0] + ", " + ringColor[1] + ", " + ringColor[2] + ", 0.45)");
    }

    public void disableAnimation() {
        this.vars.replace("animated", false);
    }

    @Override
    protected void subtypes(ArrayList<AloftElementSubtype> subtypes) {
        //NAMES ARE IN THIS FORMAT UNTIL FURTHER WORK
        this.subtypes.add(new AloftElementSubtype(constructSubtype("__button_default__")) {
            @Override
            public HtmlElement create(AloftTheme theme, ElementMapper mapper) {
                HtmlElement root = createElement("button");
                Content content = new Content(var("text"));
                root.addChild(content);
                placeType(root);
                applyStyle("button", ButtonAloftElement.class, root, theme);
                applyListeners(root);
                return root;
            }
            @Override
            public String getName() {
                return "__button_default__";
            }
        });
        this.subtypes.add(new AloftElementSubtype(constructSubtype("__icon_button__")) {
            @Override
            public HtmlElement create(AloftTheme theme, ElementMapper mapper) {
                return createElement("button");
            }
            @Override
            public String getName() {
                return "__icon_button__";
            }
        });
    }

    @Override
    protected String name() {
        return "__button__";
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
        return true;
    }

    @Override
    protected boolean hasMultipleSubtypes() {
        return true;
    }

    @Override
    protected boolean acceptsChild() {
        return true;
    }

    @Override
    protected void setupVariables(HashMap<String, Object> vars) {
        vars.put("text", null);
        vars.put("icon", null);
        vars.put("placement", null);

        vars.put("color", null);
        addOverride("color", "background-color");

        vars.put("pulse-shadow", null);
        vars.put("pulse-shadow-active", null);
        addOverride("pulse-shadow", "box-shadow", "after");
        addOverride("pulse-shadow-active", "box-shadow", "active", "after");

        vars.put("ring-color", null);
        addOverride("ring-color", "box-shadow", "hover");
        addOverride("ring-color", "box-shadow", "focus");

        vars.put("border-color", null);
        addOverride("border-color", "border");

        vars.put("hover-color", null);
        addOverride("hover-color", "background-color", "hover");

        vars.put("active-color", null);
        addOverride("active-color", "background-color", "focus");

        vars.put("animated", true);
        addFlaggedOverride("animated", "position", "relative");
        addFlaggedOverride("animated", "transition-duration", "0.4s");
        addFlaggedOverride("animated", "-webkit-transition-duration", "0.4s");
        addFlaggedOverride("animated", "transition-duration", "0.1s", "hover");
//        addOverride("hover-color", "background-color",  "hover");
        addFlaggedOverride("animated", "content", "\"\"", "after");
        addFlaggedOverride("animated", "display", "block", "after");
        addFlaggedOverride("animated", "position", "absolute", "after");
        addFlaggedOverride("animated", "border-radius", "0.2rem", "after");
        addFlaggedOverride("animated", "left", "0", "after");
        addFlaggedOverride("animated", "top", "0", "after");
        addFlaggedOverride("animated", "width", "100%", "after");
        addFlaggedOverride("animated", "height", "100%", "after");
        addFlaggedOverride("animated", "opacity", "0", "after");
        addFlaggedOverride("animated", "transition", "all 0.5s", "after");
//        addFlaggedOverride("animated", "box-shadow", "0 0 10px 40px white", "after");
//        addFlaggedOverride("animated", "box-shadow", "0 0 0 0 white", "active", "after");
        addFlaggedOverride("animated", "position", "absolute", "active", "after");
        addFlaggedOverride("animated", "border-radius", "0.2rem", "active", "after");
        addFlaggedOverride("animated", "left", "0", "active", "after");
        addFlaggedOverride("animated", "top", "0", "active", "after");
        addFlaggedOverride("animated", "opacity", "1", "active", "after");
        addFlaggedOverride("animated", "transition", "0s", "active", "after");

    }

}
