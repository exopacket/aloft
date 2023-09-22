package com.inteliense.aloft.server.html;

import com.inteliense.aloft.compiler.lang.keywords.AloftPage;
import com.inteliense.aloft.compiler.lang.keywords.components.AloftComponent;
import com.inteliense.aloft.compiler.lang.keywords.elements.base.AloftElement;
import com.inteliense.aloft.server.http.supporting.Response;

public class StaticSourceFile {

    private String id;
    private String content;
    private String contentType;

    public StaticSourceFile(String id, String content, String contentType) {
        this.id = id;
        this.content = content;
        this.contentType = contentType;
    }

    public Response getResponse() {
        return null;
    }


}
