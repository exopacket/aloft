package org.extendedweb.aloft.lib.html;

import com.sun.net.httpserver.HttpExchange;
import org.extendedweb.aloft.lib.http.protocol.responses.base.DefinedResponse;
import org.extendedweb.aloft.lib.http.supporting.Response;

public class JsonObjectRenderer {

    public static JsonResponseFile render(DefinedResponse response) {
        return new JsonResponseFile(response.json());
    }

}
