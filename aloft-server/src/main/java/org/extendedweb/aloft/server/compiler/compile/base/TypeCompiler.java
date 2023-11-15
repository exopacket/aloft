package org.extendedweb.aloft.server.compiler.compile.base;

import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.server.grammar.antlr.AloftParser;

public class TypeCompiler {

    public static V compile(Object o) {
        if(o instanceof AloftParser.Property_valueContext) return property((AloftParser.Property_valueContext) o);
        return null;
    }

    public static V compile(T type, Object o) {
        if(o instanceof AloftParser.Property_valueContext) return property(type, (AloftParser.Property_valueContext) o);
        return null;
    }

    private static V property(AloftParser.Property_valueContext val) {
        return null;
    }

    private static V property(T type, AloftParser.Property_valueContext val) {
        return null;
    }

    private static boolean assertString(AloftParser.Property_valueContext val) {
        return true;
    }

    private static boolean assertPath(AloftParser.Property_valueContext val) {
        return true;
    }

    private static boolean assertArray(AloftParser.Property_valueContext val) {
        return true;
    }

}
