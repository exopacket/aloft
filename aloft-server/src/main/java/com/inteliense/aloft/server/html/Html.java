package com.inteliense.aloft.server.html;

import com.inteliense.aloft.compiler.lang.base.ElementMapper;
import com.inteliense.aloft.compiler.lang.keywords.AloftPage;
import com.inteliense.aloft.compiler.lang.keywords.AloftTheme;
import com.inteliense.aloft.compiler.lang.keywords.components.AloftComponent;
import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftElement;
import com.inteliense.aloft.compiler.lang.lib._AloftComponent;
import com.inteliense.aloft.compiler.lang.lib._AloftElement;
import com.inteliense.aloft.compiler.lang.lib._AloftPage;
import com.inteliense.aloft.server.http.supporting.Response;
import com.sun.net.httpserver.HttpExchange;

import java.util.ArrayList;

public class Html {

    private RenderType type;
    private Object object;
    private AloftTheme theme;

    public Html(RenderType type, Object object, AloftTheme theme) {
        this.type = type;
        this.object = object;
        this.theme = theme;
    }

    public Response get(HttpExchange t) {
        return buildResponse(t);
    }

    private Response buildResponse(HttpExchange t) {
        Response response = new Response(t, string(), 200);
        ArrayList<String> values = new ArrayList<>();
        values.add("text/html");
        values.add("charset=utf-8");
        response.addHeader("Content-Type", values);
        return response;
    }

    public String string() {
        if(type == RenderType.PAGE && object.getClass() == AloftPage.class)
            return renderPage((AloftPage) object);
        if(type == RenderType.PAGE && object.getClass() == _AloftPage.class)
            return renderPage((_AloftPage) object);
        if(type == RenderType.COMPONENT && object.getClass() == AloftComponent.class)
            return renderComponent((AloftComponent) object);
        if(type == RenderType.COMPONENT && object.getClass() == _AloftComponent.class)
            return renderComponent((_AloftComponent) object);
        if(type == RenderType.ELEMENT && object.getClass() == _AloftElement.class)
            return renderElement((_AloftElement) object);
        if(type == RenderType.ELEMENT)
            return renderElement((AloftElement) object);
        return "";
    }

    public String string(String[] path) {
        if(type == RenderType.PAGE && object.getClass() == AloftPage.class)
            return renderPage((AloftPage) object);
        if(type == RenderType.PAGE && object.getClass() == _AloftPage.class)
            return renderPage((_AloftPage) object);
        if(type == RenderType.COMPONENT && object.getClass() == AloftComponent.class)
            return renderComponent((AloftComponent) object);
        if(type == RenderType.COMPONENT && object.getClass() == _AloftComponent.class)
            return renderComponent((_AloftComponent) object);
        if(type == RenderType.ELEMENT && object.getClass() == _AloftElement.class)
            return renderElement((_AloftElement) object);
        if(type == RenderType.ELEMENT)
            return renderElement((AloftElement) object);
        return "";
    }

    private String renderPage(AloftPage page) { return page.html(theme, new ElementMapper(false)).getHtml(); }

    private String renderComponent(AloftComponent component) {
        return "";
    }

    private String renderElement(AloftElement element) {
        return element.html(theme, null).getHtml();
    }

    private String renderPage(_AloftPage page) {
        return page.getFromPath().html(theme, null).getHtml();
    }

    private String renderComponent(_AloftComponent page) {
        return "";
    }

    private String renderComponent(_AloftPage page, String[] ids) {
        return page.getFromPath(ids).html(theme, null).getHtml();
    }

    private String renderElement(_AloftElement page) {
        return "";
    }

}
