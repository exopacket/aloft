package org.extendedweb.aloft.lib.http.supporting;

import org.extendedweb.aloft.lib.application.config.AppConfig;

public class AloftRequestTypeParser {

    public static AloftRequestType get(HeaderList headers, String path, RequestType requestType, AppConfig config) {
        return switch (requestType) {
            case GET -> _get(headers, path, config);
            case POST -> _post(headers, path);
            default -> null;
        };
    }

    private static AloftRequestType _get(HeaderList headers, String path, AppConfig config) {
        if(headers.has("X-Aloft-Resource-Content-Type")) {
            if(headers.has("X-Aloft-Async-Id")) {
                if(path.indexOf(config.getRoutesConfig().api()) == 0) return AloftRequestType.CLIENT_SIDE_ASYNC_API;
                if(path.indexOf(config.getRoutesConfig().publicApi()) == 0) return AloftRequestType.PUBLIC_ASYNC_API;
            } else {
                if(path.indexOf(config.getRoutesConfig().api()) == 0) return AloftRequestType.CLIENT_SIDE_API;
                if(path.indexOf(config.getRoutesConfig().publicApi()) == 0) return AloftRequestType.PUBLIC_API;
            }
        }
        if(path.indexOf(config.getRoutesConfig().stylesheets()) == 0) {
            if(path.indexOf(".css") > 0) return AloftRequestType.STYLESHEET_FILE;
            if(path.indexOf(".woff") > 0) return AloftRequestType.FONT_FILE;
        }
        if(path.indexOf(config.getRoutesConfig().javascript()) == 0) return AloftRequestType.JAVASCRIPT_FILE;
        if(path.indexOf(config.getRoutesConfig().images()) == 0) return AloftRequestType.IMAGE;
        if(path.indexOf(config.getRoutesConfig().files()) == 0) return AloftRequestType.FILE;
        return AloftRequestType.SERVER_SIDE_RENDERING;
    }

    private static AloftRequestType _post(HeaderList headers, String path) {
        return AloftRequestType.CLIENT_SIDE_API;
    }

}
