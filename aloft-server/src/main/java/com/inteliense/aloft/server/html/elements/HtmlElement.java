package com.inteliense.aloft.server.html.elements;

import com.inteliense.aloft.compiler.lang.keywords.elements.types.ButtonAloftElement;
import com.inteliense.aloft.compiler.lang.keywords.listeners.base.AloftListener;
import com.inteliense.aloft.compiler.lang.lib.StyleModule;
import com.inteliense.aloft.server.html.elements.js.*;
import com.inteliense.aloft.server.html.elements.types.Content;
import com.inteliense.aloft.utils.global.__;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public abstract class HtmlElement {

    private ArrayList<HtmlElement> children = new ArrayList<HtmlElement>();
    private ArrayList<String[]> styles = new ArrayList<String[]>();
    private HashMap<String, String> attributes = new HashMap<String, String>();
    private String id;
    protected String prependHtml = "";

    protected abstract String getKey();

    public HtmlElement() { this.id = null; }

    public HtmlElement(String id) {
        this.id = id;
    }

    public String getId() {
        return id == null ? "" : id;
    }

    public void addChild(HtmlElement element) {
        this.children.add(element);
    }

    public static HtmlElement builder(String tag, String content) {
        return builder(tag, content, null);
    }

    public static HtmlElement builder(String tag, String content, String id) {
        return builder(tag, content, id, new String[][]{});
    }

    public static HtmlElement builder(String tag, String content, String id, String[][] attrs) {
        HtmlElement element = new HtmlElement(id) {
            @Override
            protected String getKey() {
                return tag;
            }
        };
        if(!__.empty(content)) element.addChild(new Content(content));
        for (String[] attr : attrs) element.addAttribute(attr[0], attr[1]);
        return element;
    }
    
    public HtmlElement addAttribute(String key, String value) {
        if(this.attributes.containsKey(key)) {
            String v = this.attributes.get(key);
            this.attributes.replace(key, v + " " + value);
        } else {
            this.attributes.put(key, value);
        }
        return this;
    }

    public HtmlElement addAttributes(String key, String...values) {
        for(int i=0; i<values.length; i++) addAttribute(key, values[i]);
        return this;
    }

    public HtmlElement addAttribute(String key, String value, String delimiter) {
        if(this.attributes.containsKey(key)) {
            String v = this.attributes.get(key);
            this.attributes.replace(key, v + delimiter + value);
        } else {
            this.attributes.put(key, value);
        }
        return this;
    }
    
    public void addStyle(String key, String value) {
        this.styles.add(new String[]{key, value});
    }
    
    public void addStyle(String[][] styles) {
        for(int i=0; i<styles.length; i++) {
            this.styles.add(styles[i]);
        }
    }

    public HtmlElement applyJs(JavaScript js) {
        this.id = id;
        return null;
    }

    public String getHtml() {
        if(!__.empty(prependHtml)) prependHtml += "\n";
        if(this.children.isEmpty()) return prependHtml + this.buildTag();
        else {
            String html = prependHtml + this.buildTag(false);
            for(int i=0; i<this.children.size(); i++) {
                html += this.children.get(i).getHtml();
            }
            return html + this.buildTag(true);
        }
    }

    private String buildTag(boolean close) {
        if(this.getKey() == null) return "";
        if(close) return "</" + this.getKey() + ">";
        else {
            String tag = "<" + this.getKey();
            tag += " " + this.buildAttributes();
            tag += ">";
            return tag;
        }
    }

    private String buildTag() {
        if(this.getKey() == null) return "";
        String tag = "<" + this.getKey();
        tag += " " + this.buildAttributes();
        tag += "></" + this.getKey() + ">";
        return tag;
    }

    private String buildAttributes() {
        String style = buildStyles();
        String attrs = (style.isEmpty()) ? "" : "style=\"" + style + "\" ";
        Set<String> keys = this.attributes.keySet();
        for ( String key : keys ) {
            String value = this.attributes.get(key);
            attrs += key + "=\"" + value + "\" ";
        }
        if(!__.empty(getId())) attrs += "id=\"" + getId() + "\"";
        return attrs;
    }

    private String buildStyles() {
        String styles = "";
        for(int i=0; i<this.styles.size(); i++) {
            String[] arr = this.styles.get(i);
            String key = arr[0];
            String value = arr[1];
            styles += key + ":" + value + ";";
        }
        return styles;
    }

}
