package com.inteliense.aloft.cli.commands.keywords;

import com.inteliense.aloft.cli.Help;
import com.inteliense.aloft.cli.commands.base.Arg;
import com.inteliense.aloft.cli.commands.base.Command;
import com.inteliense.aloft.cli.commands.base.HandlesCommands;
import com.inteliense.aloft.cli.config.AppConfig;
import com.inteliense.aloft.utils.global.__;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class New extends HandlesCommands {

    public New(Command command, AppConfig config) {
        super(command, config);
    }

    @Override
    public void run(AppConfig config) {
        Arg flag = orRequiredFlag("class", "page", "theme", "model"); //TODO
        Arg file = orOptionalFlag("file");
        String filename = "";
        if(!__.isset(file)) filename = flag.getValue();
        else filename = file.getValue();
        String value = flag.getValue();
        if(__.same(flag.getName(), "model")) {
            Arg db = requiredFlag("db");
            value += ":" + db.getValue();
        }
        create(flag.getName(), value, filename);
    }

    private void create(String type, String value, String file) {
        String content = getContent(type, value);
        String filename = file.replace(".ss", "") + ".ss";
        File out = new File(filename);
        try {
            if (out.exists()) appendFile(out, content);
            else createFile(out, content);
            __.printPrettyLn(type.substring(0, 1).toUpperCase() + type.substring(1) + " '" + value + "' created successfully at " + out.getAbsolutePath(), __.ANSI_GREEN);
        } catch (Exception e) {
            System.err.println("Failed to create " + type + ".");
        }
    }

    private String createModel(String name, String db) {
        StringBuilder builder = new StringBuilder();
        builder.append("\n\n");
        builder.append("model").append(" ").append(name).append(" {").append("\n\n");
        builder.append("\t").append("connection: \"").append(db).append("\"\n\n");
        builder.append("\t").append("*id").append(" ").append("id").append("\n");
        builder.append("\t").append("*timestamps").append(" ").append("timestamps").append("\n\n");
        builder.append("}").append("\n");
        return builder.toString();
    }

    private String getContent(String type, String value) {
        if(__.same(type, "model")) return createModel(value.split(":")[0], value.split(":")[1]);
        return createModel(value.split(":")[0], value.split(":")[1]);
    }

    private void appendFile(File file, String content) throws Exception {
        BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
        writer.write(content);
        writer.close();
    }

    private void createFile(File file, String content) throws Exception {
        file.createNewFile();
        PrintWriter pw = new PrintWriter(file);
        pw.print(content);
        pw.close();
    }

    @Override
    public Help help() {
        return null;
    }

}
