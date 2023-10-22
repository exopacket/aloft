package org.extendedweb.aloft.lib.http.supporting;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;

import java.util.List;
import java.util.Map;

public class HeaderParser {

    public static HeaderList getHeaders(HttpExchange t) {
        Headers httpHeaders = t.getRequestHeaders();
        HeaderList list = new HeaderList();

        for(Map.Entry<String, List<String>> entry : httpHeaders.entrySet()) {
            list.addHeader(new Header(entry.getKey(), entry.getValue(), getMaxValues(entry.getKey())));
        }

        return list;
    }

    private static int getMaxValues(String key) {
        return 1;
    }

}
