package com.inteliense.aloft.compiler.lang.base;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

public class Assert {

    private static RuleContext context;
    private static String[] rules;

    public static void root(RuleContext context, String[] rules) {
        Assert.context = context;
        Assert.rules = rules;
        ParseTree t = context.getChild(0);
        for(int i=0; i<t.getChildCount(); i++) {
//            object(t.gett.getChild(i));
        }
    }

    private static void object(int index, ParseTree t) {

    }

    private static void inner(ParseTree t) {

    }

}
