package org.extendedweb.aloft.lib.html.elements;

import org.extendedweb.aloft.lib.html.elements.js.JavaScript;
import org.extendedweb.aloft.lib.lang.base.ElementMapper;
import org.extendedweb.aloft.lib.lang.structure.style.AloftStyleConditionalClass;
import org.extendedweb.aloft.lib.html.elements.js.types.ElementRef;
import org.extendedweb.aloft.lib.html.elements.types.Content;
import org.extendedweb.aloft.utils.global.__;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public abstract class HtmlElement {

    private ArrayList<HtmlElement> children = new ArrayList<HtmlElement>();
    private ArrayList<String[]> styles = new ArrayList<String[]>();
    private HashMap<String, String> attributes = new HashMap<String, String>();
    private ArrayList<AloftStyleConditionalClass> conditionalClasses = new ArrayList<>();
    private String id;
    private String friendlyId = "";
    private String uniqueId = "";
    private String veryUniqueId = "";
    private String aid = "";
    protected String parentComponent = null;
    protected String prependHtml = "";

    protected String ref = "";
    public abstract String getKey();

    public HtmlElement() {
        this.id = null;
    }

    public HtmlElement(String id) {
        this.id = id;
    }

    public void setParentComponent(String parentComponent) {
        this.parentComponent = parentComponent;
    }

    public String getParentComponent() {
        return parentComponent;
    }

    public void setIdentifiers(String friendlyId, String uniqueId, String veryUniqueId, String aid, boolean debug) {
        this.friendlyId = friendlyId;
        this.uniqueId = uniqueId;
        this.veryUniqueId = veryUniqueId;
        this.aid = aid;
        if(identified()) {
            this.id = (debug) ? friendlyId : veryUniqueId;
            this.addAttribute("data-aid", aid);
            this.addAttribute("data-uid", uniqueId);
        }
    }

    public String getId() {
        return id == null ? "" : id;
    }

    private boolean identified() {
        return id != null && !id.isEmpty();
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getRef() {
        return ref;
    }

    public void setConditionalClasses(ArrayList<AloftStyleConditionalClass> conditionalClasses) {
        this.conditionalClasses = conditionalClasses;
    }

    public ElementRef ref() {
        ElementRef root = ElementRef.el(this, conditionalClasses);
        for(int i=0; i<children.size(); i++) {
            ElementRef child = children.get(i).ref(root);
            if(__.isset(child)) {
                root.addChild(children.get(i).getRef(), child);
            }
        }
        return root;
    }

    public ElementRef ref(ElementRef root) {
        for(int i=0; i<children.size(); i++) {
            ElementRef child = children.get(i).ref(root);
            if(__.isset(child)) {
                root.addChild(children.get(i).getRef(), child);
            }
        }
        if(__.isset(ref)) {
            ElementRef me = ElementRef.el(this);
            root.addChild(getRef(), me);
            return me;
        }
        return null;
    }

    public void addChild(HtmlElement element) {
        element.setRef(null);
        element.setParentComponent(this.parentComponent);
        this.children.add(element);
    }

    public void addChild(String key, HtmlElement element) {
        element.setRef(key);
        element.setParentComponent(this.parentComponent);
        this.children.add(element);
    }

    public String getVeryUniqueId() {
        return veryUniqueId;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public ArrayList<HtmlElement> getChildren() {
        return children;
    }

    public HtmlElement map(ElementMapper mapper) {
        mapper.iterate(this);
        return this;
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
            public String getKey() {
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
            if(!v.contains(value)) this.attributes.replace(key, v + " " + value);
        } else {
            this.attributes.put(key, value);
        }
        return this;
    }

    public HtmlElement addAttribute(String key, String value, boolean overwrite) {
        if(this.attributes.containsKey(key)) {
            if(overwrite) this.attributes.put(key, value);
            System.out.println(this.attributes.get(key));
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
        if(this.children.isEmpty() && !__.same("script", getKey())) return prependHtml + this.buildTag();
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
        tag += this.buildAttributes();
        tag += "/>";
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
        return " " + attrs;
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
