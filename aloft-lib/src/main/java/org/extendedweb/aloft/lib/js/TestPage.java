package org.extendedweb.aloft.lib.js;

import org.extendedweb.aloft.lib.html.elements.js.JavaScriptObject;

public class TestPage extends JS {

    @Override
    protected JavaScriptObject create() {
        return container(
                let("name", Str.v("value")),
                function("name", Args.none(), ((args) -> {
                    return container(
                            let("name", Raw.v("true")),
                            decide(
                                    vif(expr(truthy("var")), container(
                                            let("name", Bool.t())
                                    ))
                            )
                    );
                }))
        );
    }
}
