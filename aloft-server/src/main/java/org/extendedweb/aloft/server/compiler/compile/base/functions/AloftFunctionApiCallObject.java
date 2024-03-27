package org.extendedweb.aloft.server.compiler.compile.base.functions;

import org.extendedweb.aloft.lib.html.elements.js.JavaScriptObject;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.server.compiler.compile.base.AloftServerCode;
import org.extendedweb.aloft.server.compiler.compile.base.functions.base.AloftMutualFunctionObject;
import org.extendedweb.aloft.server.compiler.compile.base.functions.base.AloftFunctionObject;

import java.util.ArrayList;

public class AloftFunctionApiCallObject extends AloftMutualFunctionObject {

    public AloftFunctionApiCallObject(Type type, V... args) {
        super(type, args);
    }

    @Override
    public JavaScriptObject js() {
        return null;
    }

    @Override
    public ArrayList<AloftFunctionObject> serverObjects() {
        return null;
    }

    @Override
    public JavaScriptObject getObject() {
        return null;
    }

    @Override
    public AloftServerCode server() {
        return null;
    }
}
