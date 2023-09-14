package com.inteliense.aloft.utils.sys.info;

public class User {

    public static String username() {
        return System.getProperty("user.name");
    }

//    public static int getUID() {
//
//        try {
//            String[] out = Run.withOut("id -u " + username());
//            return Integer.parseInt(out[0]);
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            return -1;
//        }
//
//    }

//    public static String getUserHome() {
//        try {
//            String home = "";
//            if (getUID() == 0) {
//                home = Run.withOut("su -c 'echo $HOME' " + username())[0];
//            } else {
//                home = Run.withOut("echo $HOME")[0];
//            }
//            return home;
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        return "/root/";
//    }
    
}
