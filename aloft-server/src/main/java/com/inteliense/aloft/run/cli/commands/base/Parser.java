package com.inteliense.aloft.run.cli.commands.base;

import java.util.ArrayList;

public class Parser {

    public static Arg[] getArgs(String[] args) {
        ArrayList<Arg> argList = new ArrayList<>();
        boolean needValue = false;
        int prevFlagIndex = -1;
        String prevName = "";
        for(int i=0; i<args.length; i++) {
            String arg = args[i];
            if(flagCheck(arg) && argList.size() > 0 && Keywords.flagExists(argList.get(0).getName(), arg)) {
                Arg flag = Keywords.getFlagArg(arg);
                if(flag == null) continue;
                argList.add(flag);
                if(flag.requiresValue()) prevFlagIndex = argList.size() - 1;
                continue;
            }
            if(!flagCheck(arg) && prevFlagIndex > 0) {
                argList.get(prevFlagIndex).setValue(arg);
                prevFlagIndex = -1;
                continue;
            }
            if(!flagCheck(arg) && needValue) {
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
