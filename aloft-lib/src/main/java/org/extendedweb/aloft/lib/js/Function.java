package org.extendedweb.aloft.lib.js;

import org.extendedweb.aloft.lib.html.elements.js.JavaScriptObject;
import org.extendedweb.aloft.lib.html.elements.js.types.FunctionObject;

public class Function extends JSO {

    private String name;
    private Args args;
    private JavaScriptObject block;

    public Function(String name, Args args, JavaScriptObject block) {
        this.name = name;
        this.args = args;
        this.block = block;
    }

    @Override
    protected JavaScriptObject build() {
        FunctionObject function = new FunctionObject(name, args.getArray());
        function.setSlot(block.build());
        return function;
    }
}
