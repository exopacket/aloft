package org.extendedweb.aloft.utils.sys.uid;

import org.extendedweb.aloft.utils.global.__;

public class LimitedEscalate {

    private static boolean isEscalated() {
        return __.same("1000", "0");
    }

    private static void run() {
        //Custom sudo script
    }

    public static void createConfigFile() {
        if(isEscalated()) return;
        System.err.println("[TEMPORARY NOTICE] Please run the aloft CLI as root.");
        System.exit(0);
    }

}
