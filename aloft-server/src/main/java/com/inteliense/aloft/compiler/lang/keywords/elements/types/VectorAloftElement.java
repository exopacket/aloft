package com.inteliense.aloft.compiler.lang.keywords.elements.types;

import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftElement;
import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftElementSubtype;
import com.inteliense.aloft.compiler.lang.lib.StyleModule;
import com.inteliense.aloft.server.html.elements.HtmlElement;
import com.inteliense.aloft.utils.global.__;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VectorAloftElement extends AloftElement {

    public VectorAloftElement() { super(); init(); }

    public int getColorsSize() { return ((ArrayList<String[]>) this.vars.get("colors")).size(); }

    public int getDefaultColorsSize() { return ((ArrayList<String>) this.vars.get("default-colors")).size(); }

    public void replaceColor(String previous, String next) {

    }

    public void replaceColor(int index, String next) {

    }

    public void setViewBox(String v) {
        this.vars.replace("view-box", v);
    }

    public void setSize(String height, String width) {
        this.vars.replace("height", height);
        this.vars.replace("width", width);
    }

    public void setElement(HtmlElement element) {
        this.vars.replace("element", element);
    }

    public String getEncodedUrl(StyleModule module) {
        String html = html(module).getHtml();
        String b64 = __.b64(html.getBytes());
        String data = "data:image/svg+xml;base64," + b64;
        return "url('" + data + "')";
    }

    public static VectorAloftElement fromFile(File file) throws Exception {
        Scanner scnr = new Scanner(file);
        StringBuilder builder = new StringBuilder();
        while(scnr.hasNextLine()) {
            builder.append(scnr.nextLine());
        }
        String svgStr = builder.toString();
        ArrayList<String[]> colors = getColors(svgStr);

        VectorAloftElement element = new VectorAloftElement() {
            @Override
            public HtmlElement html(StyleModule module) {
                HtmlElement svg = (HtmlElement) this.vars.get("element");
                svg.addAttribute("xmlns", "http://www.w3.org/2000/svg");
                svg.addAttribute("xmlns:xlink", "http://www.w3.org/1999/xlink");
                svg.addAttribute("version", "1.1");
                svg.addAttribute("viewBox", String.valueOf(this.vars.get("view-box")));
                svg.addAttribute("width", String.valueOf(this.vars.get("width")));
                svg.addAttribute("height", String.valueOf(this.vars.get("height")));
                return svg;
            }
        };

        Parser p = Parser.htmlParser();
        p.settings(new ParseSettings(true, true));
        Document _svg = p.parseInput(svgStr, "/");
        Element svg = _svg.selectFirst("svg");
        Attributes attrs = svg.attributes();
        element.setSize(attrs.get("height"), attrs.get("width"));
        element.setViewBox(attrs.getIgnoreCase("viewBox"));
        HtmlElement el = createElement("svg", element.id());
        iterate(svg, el);
        element.setElement(el);
        return element;
    }

    private static void iterate(Element el, HtmlElement element) {
        Elements children = el.children();
        for(int i=0; i< children.size(); i++) {
            Element child = children.get(i);
            HtmlElement childEl = createElement(child.tagName(), "");
            Attributes attrs = child.attributes();
            for(Attribute attr: attrs) {
                childEl.addAttribute(attr.getKey(), attr.getValue());
            }
            iterate(child, childEl);
            element.addChild(childEl);
        }
    }

    private static ArrayList<String[]> getColors(String fileContent) {
        ArrayList<String[]> colors = new ArrayList<String[]>();
        ArrayList<String> matches = new ArrayList<String>();
        Pattern p = Pattern.compile("(#([a-zA-Z0-9]+))|(rgba\\(.*\\))");
        Matcher m = p.matcher(fileContent);
        while(m.find()) {
            String match = fileContent.substring(m.start(), m.end());
            if(!matches.contains(match)) {
                matches.add(match);
                colors.add(new String[]{match, match});
            }
        }
        return colors;
    }

    @Override
    protected String name() {
        return "__vector__";
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
        return false;
    }

    @Override
    protected boolean acceptsChild() {
        return false;
    }

    @Override
    protected void setupVariables(HashMap<String, Object> vars) {
        vars.put("view-box", null);
        vars.put("width", null);
        vars.put("height", null);
        vars.put("colors", new ArrayList<String[]>());
        vars.put("default-colors", new ArrayList<String>());
        vars.put("element", null);
    }

    @Override
    protected void subtypes(ArrayList<AloftElementSubtype> subtypes) {

    }
}
