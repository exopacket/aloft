package org.extendedweb.aloft.server.compiler.compile.base.functions;

import org.extendedweb.aloft.lib.html.elements.js.JavaScriptObject;
import org.extendedweb.aloft.server.compiler.compile.base.functions.base.AloftFunctionObject;
import org.extendedweb.aloft.server.compiler.compile.base.functions.base.ReturnsClientSide;
import org.extendedweb.aloft.server.compiler.compile.base.functions.base.ReturnsServerSide;

import java.util.ArrayList;

public class AloftFunctionDefinedCallObject extends AloftFunctionObject implements ReturnsClientSide, ReturnsServerSide {

    private int type = 0;

    @Override
    protected boolean serverSide() {
        return type == 0 || type == 1;
    }

    @Override
    protected boolean clientSide() {
        return type == 0 || type == 2;
    }

    @Override
    public JavaScriptObject js() {
        return null;
    }

    @Override
    public ArrayList<AloftFunctionObject> serverObjects() {
        return null;
    }
}
