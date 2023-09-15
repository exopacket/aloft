package com.inteliense.aloft.run.cli.commands.base;

import com.inteliense.aloft.run.cli.commands.keywords.Build;
import com.inteliense.aloft.run.cli.commands.keywords.Daemon;
import com.inteliense.aloft.run.cli.commands.keywords.Debug;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;

@SuppressWarnings("ALL")
public class Keywords {

    private static final Class[] commands = new Class[]{
        Daemon.class,
        Build.class
    };

    private static final Class[] required = new Class[]{
        Build.class
    };

    private static final HashMap<String, Object[]> flags = new HashMap<String, Object[]>() {{
            put("--localhost", new Object[]{ new Arg("--localhost"), Daemon.class });
            put("--ipv6", new Object[]{ new Arg("--ipv6"), Daemon.class });
            put("--balanced", new Object[]{ (new Arg("--balanced")), Daemon.class });
            put("--public", new Object[]{ (new Arg("--public")), Debug.class });
    }};

    public static Class getClass(String cmd) {
        try {
            return Class.forName("com.inteliense.aloft.run.cli.commands.keywords." + cmd.substring(0, 1).toUpperCase() + cmd.substring(1));
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
            Class<?> c = Class.forName(className);
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

}
