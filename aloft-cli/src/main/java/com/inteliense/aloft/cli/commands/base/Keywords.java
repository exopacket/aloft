package com.inteliense.aloft.cli.commands.base;

import com.inteliense.aloft.cli.commands.keywords.*;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;

@SuppressWarnings("ALL")
public class Keywords {

    private static final Class[] commands = new Class[]{
            Create.class,
            Init.class,
            Debug.class,
            Serve.class,
            Publish.class
    };

    private static final Class[] required = new Class[]{
            Create.class
    };

    private static final HashMap<String, Object[]> flags = new HashMap<String, Object[]>() {{
        put("--public", new Object[]{ (new Arg("--public")), Debug.class });
        put("--group-id", new Object[]{ (new Arg("--group-id", true)), Create.class});
    }};

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
            return Arrays.asList(required).contains(getClass(cmd));
        } catch (Exception ignored) {}
        return false;
    }

    public static boolean flagExists(String className, String flag) {
        try {
            Class<?> c = getClass(className);
            if(flags.containsKey(flag.toLowerCase())) {
                Object[] v = flags.get(flag.toLowerCase());
                if(v[1].getClass() == Array.class) {
                    for (Class _c : (Class[]) v[1]) {
                        if(_c == c) return true;
                    }
                } else {
                    if(((Class) v[1]) == c) return true;
                }
            }
        } catch (Exception ignored) {}
        return false;
    }

    public static Arg getFlagArg(String flag) {
        try {
            if(flags.containsKey(flag.toLowerCase())) {
                Object[] v = flags.get(flag.toLowerCase());
                return (Arg) v[0];
            }
        } catch (Exception ignored) {}
        return null;
    }

}

