package com.inteliense.aloft.server.html.elements.files;

import com.inteliense.aloft.application.config.AppConfig;
import com.inteliense.aloft.server.http.supporting.*;

public class ImageEndpoint extends Endpoint {

    private Image img;

    public ImageEndpoint(Route route, RequestType type, AloftRequestType internalType, VariableTree vars, Image img) {
        super(route, type, internalType, vars);
        this.img = img;
    }

    public ImageEndpoint(Route route, RequestType type, AloftRequestType internalType, VariableTree vars) {
        super(route, type, internalType, vars);
    }

    public ImageEndpoint(Route route, RequestType type, AloftRequestType internalType, VariableTree vars, AppConfig config) {
        super(route, type, internalType, vars, config);
    }

    public Image getImg() {
        return img;
    }

}
