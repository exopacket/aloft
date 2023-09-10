package com.inteliense.aloft.cli.utils.sys.info;

import com.inteliense.aloft.utils.sys.shell.Run;

import java.io.File;

public class AppInfo {

    public static String getJarPath() throws Exception {

        String path = new File(Run.class.getProtectionDomain().getCodeSource().getLocation()
                .toURI()).getPath();

        path = path.replaceAll("(\\/[a-zA-Z0-9]+\\.jar)", "");

        return path;

    }

}
