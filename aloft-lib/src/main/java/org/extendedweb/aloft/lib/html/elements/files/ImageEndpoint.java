package org.extendedweb.aloft.lib.html.elements.files;

import org.extendedweb.aloft.lib.application.config.AppConfig;
import org.extendedweb.aloft.lib.client.ClientInfo;
import org.extendedweb.aloft.lib.client.ClientSession;
import org.extendedweb.aloft.lib.http.supporting.*;

public class ImageEndpoint extends Endpoint {

    private Image img;

    public ImageEndpoint(RequestParams params, AppConfig config, Image img) {
        super(params, config);
        this.img = img;
    }

    public Image getImg() {
        return img;
    }

}