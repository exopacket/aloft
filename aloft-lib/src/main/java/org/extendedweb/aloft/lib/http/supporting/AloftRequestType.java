package org.extendedweb.aloft.lib.http.supporting;

public enum AloftRequestType {
    SERVER_SIDE_RENDERING, //Load the entire page, components plus component state, js, and custom css
    CLIENT_SIDE_COMPONENT, //state gets called first, if FE doesn't have component composition, this will be called as well
    CLIENT_SIDE_COMPONENT_STATE, //called to gather component state variables that are NEEDED (some are default/constants, some are only defined by the client, ...)
    CLIENT_SIDE_WINDOW_INIT, //called immediately after a SSR is rendered on the page to fill the framework vars and cache
    SERVER_RESOURCE, //called to update a model/resource object (record)
    APPLICATION_INFO,
    CLIENT_SIDE_API,
    PUBLIC_API,
    CLIENT_SIDE_ASYNC_API,
    PUBLIC_ASYNC_API,
    JAVASCRIPT_FILE,
    STYLESHEET_FILE,
    IMAGE,
    FILE,
    FONT_FILE
}
