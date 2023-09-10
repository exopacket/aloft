package com.inteliense.aloft.cli.utils.sys.shell;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public abstract class Command {

    public abstract Status lineRead(byte[] bytes, String string);

    public static void noOut(String cmd) throws Exception {

        ProcessBuilder builder = new ProcessBuilder();
        builder.command("/bin/sh", "-c", cmd);
        builder.start();

    }

    public static void runAndWait(String cmd) throws Exception {

        ProcessBuilder builder = new ProcessBuilder();
        builder.command("/bin/sh", "-c", cmd);
        Process process = builder.start();

        process.waitFor();

    }

    public Status exec(String cmd) throws Exception {

        ProcessBuilder builder = new ProcessBuilder();
        builder.command("/bin/sh", "-c", cmd);
        Process process = builder.start();

        StringBuilder output = new StringBuilder();

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(process.getInputStream()));

        String line;
        while ((line = reader.readLine()) != null) {
            lineRead(line.getBytes(StandardCharsets.UTF_8), line);
        }

        int exitVal = process.waitFor();
        return getStatus(exitVal);

    }

    public static int runThread(String cmd) throws Exception {

        ProcessBuilder builder = new ProcessBuilder();
        builder.command("/bin/sh", "-c", cmd, "&");
        Process process = builder.start();

        StringBuilder output = new StringBuilder();

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(process.getInputStream()));

        String line;
        while ((line = reader.readLine()) != null) {
            output.append(line + "\n");
        }

        int exitVal = process.waitFor();
        if (exitVal == 0) {
            int processId = -1;
            try {
                processId = Integer.parseInt(output.toString().split("\\n")[0]);
            } catch(Exception ex) {

            }
            return processId;
        }

        return 0;

    }

    private static Status getStatus(int v) {

        if(v == 0) return Status.EXIT_W_SUCCESS;
        else return Status.EXIT_W_ERROR;

    }

}
