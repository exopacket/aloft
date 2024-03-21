package org.extendedweb.aloft.server.compiler.compile.base.functions.base;

import org.extendedweb.aloft.server.compiler.compile.base.AloftServerFunction;

import java.util.ArrayList;

public interface ReturnsServerSide {
    ArrayList<AloftFunctionObject> serverObjects();
}
