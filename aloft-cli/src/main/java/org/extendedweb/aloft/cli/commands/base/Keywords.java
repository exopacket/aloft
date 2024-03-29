package org.extendedweb.aloft.cli.commands.base;

import org.extendedweb.aloft.cli.commands.keywords.*;
import org.extendedweb.aloft.cli.commands.keywords.*;
import org.extendedweb.aloft.cli.commands.keywords.*;
import org.extendedweb.aloft.cli.commands.keywords.Module;

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
            Publish.class,
            Middleware.class,
            Module.class,
            Cache.class,
            New.class
    };

    private static final Class[] required = new Class[]{
            Create.class
    };

    private static final HashMap<String, Object[]> flags = new HashMap<String, Object[]>() {{
        put("--public", new Object[]{ (new Arg("--public")), Debug.class });
        put("--group-id", new Object[]{ (new Arg("--group-id", true)), Create.class});
        put("--add", new Object[]{ (new Arg("--add", true)), Middleware.class});
        put("--remove", new Object[]{ (new Arg("--remove", true)), Middleware.class});
        put("--install", new Object[]{ (new Arg("--install", true)), Middleware.class});
        put("--configure", new Object[]{ (new Arg("--configure", true)), Middleware.class});
        put("--add", new Object[]{ (new Arg("--add", true)), Module.class});
        put("--remove", new Object[]{ (new Arg("--remove", true)), Module.class});
        put("--install", new Object[]{ (new Arg("--install", true)), Module.class});
        put("--configure", new Object[]{ (new Arg("--configure", true)), Module.class});
        put("--theme", new Object[]{ (new Arg("--theme", true)), New.class});
        put("--model", new Object[]{ (new Arg("--model", true)), New.class});
        put("--file", new Object[]{ (new Arg("--file", true)), New.class});
        put("--db", new Object[]{ (new Arg("--db", true)), New.class});
    }};

    public static Class getClass(String cmd) {
        try {
            return Class.forName("org.extendedweb.aloft.cli.commands.keywords." + cmd.substring(0, 1).toUpperCase() + cmd.substring(1));
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
            flag = "--" + flag.replace("--", "");
            if(flags.containsKey(flag.toLowerCase())) {
                Object[] v = flags.get(flag.toLowerCase());
                return (Arg) v[0];
            }
        } catch (Exception ignored) {}
        return null;
    }

}

