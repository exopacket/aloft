package org.extendedweb.aloft.lib.html.elements.js;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

//Application javascript that creates the appropriate objects
public class AppJavaScript {

    private ArrayList<JavaScript> js = new ArrayList<>();
    private AtomicReference<JavaScriptRefMapper> mapper = new AtomicReference<>();

    public AppJavaScript() {
        mapper.set(new JavaScriptRefMapper());
    }

    public JavaScript apply(JavaScript js) {
        this.js.add(js);
        return js;
    }

    public ArrayList<JavaScript> get() {
        return js;
    }

    public AtomicReference<JavaScriptRefMapper> getMapper() {
        return mapper;
    }
}
