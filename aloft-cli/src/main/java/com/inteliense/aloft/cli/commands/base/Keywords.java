package com.inteliense.aloft.cli.commands.base;

import com.inteliense.aloft.cli.commands.keywords.Create;
import com.inteliense.aloft.cli.commands.keywords.Init;

import java.util.Arrays;

@SuppressWarnings("ALL")
public class Keywords {

    private static final Class[] commands = new Class[]{
        Create.class,
        Init.class
    };

    private static final Class[] required = new Class[]{
        Create.class
    };

    private static final Object[] flags = new String[]{

    };

    public static Class getClass(String cmd) {
        try {
            return Class.forName("com.inteliense.aloft.cli.commands.keywords." + cmd.substring(0, 1).toUpperCase() + cmd.substring(1));
        } catch (Exception ignored) {}
        return null;
    }

    public static boolean exists(String cmd) {
        try {
            return Arrays.asList(commands).contains(getClass(cmd));
        } catch (Exception e) {e.printStackTrace();}
        return false;
    }

    public static boolean requiresValue(String cmd) {
        try {
            return Arrays.asList(required).contains(Class.forName(cmd.substring(0, 1).toUpperCase() + cmd.substring(1)));
        } catch (Exception ignored) {}
        return false;
    }

    public static boolean flagExists(String flag) {
        try {
            return Arrays.asList(flags).contains(flag.toLowerCase());
        } catch (Exception ignored) {}
        return false;
    }

}
