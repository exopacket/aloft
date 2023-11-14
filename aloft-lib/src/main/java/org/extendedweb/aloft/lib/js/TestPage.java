package org.extendedweb.aloft.lib.js;

import org.extendedweb.aloft.lib.html.elements.js.JavaScriptObject;

public class TestPage extends JS {

    @Override
    protected JavaScriptObject create() {
        return container(
                Let("name", Str.v("value")),
                Function("name", Args.none(), ((args) -> {
                    return container(
                            Let("name", Raw.v("true")),
                            Decide(
                                    If(Expr(Truthy("var")), container(
                                            Let("name", Bool.t())
                                    ))
                            )
                    );
                }))
        );
    }
}
