package com.inteliense.aloft.cli.commands.base;

import java.util.ArrayList;

public class Parser {

    public static Arg[] getArgs(String[] args) {
        ArrayList<Arg> argList = new ArrayList<>();
        boolean needValue = false;
        String prevName = "";
        for(int i=0; i<args.length; i++) {
            String arg = args[i];
            if(flagCheck(arg) && Keywords.flagExists(arg)) {
                argList.add(new Arg(arg));
                continue;
            }
            if(needValue && !flagCheck(arg)) {
                argList.add(new Arg(prevName, arg));
                prevName = "";
                needValue = false;
                continue;
            }
            if(!flagCheck(arg) && Keywords.exists(arg)) {
                needValue = Keywords.requiresValue(arg);
                prevName = (needValue) ? arg : "";
                if(!needValue) argList.add(new Arg(arg));
            }
        }
        Arg[] arr = new Arg[argList.size()];
        arr = argList.toArray(arr);
        return arr;
    }

    private static boolean flagCheck(String v) {
        return v.contains("--");
    }

}
