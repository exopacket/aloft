package org.extendedweb.aloft.lib.http.supporting;

import org.extendedweb.aloft.utils.global.__;
import org.apache.commons.httpclient.HttpStatus;

public class HttpErrorMessages {

    public static String getMessage(int code) {
        String message = HttpStatus.getStatusText(code);
        return (__.isset(message)) ? message : "Unknown error.";
    }

}
