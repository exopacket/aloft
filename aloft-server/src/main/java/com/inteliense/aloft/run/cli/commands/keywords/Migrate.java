package com.inteliense.aloft.run.cli.commands.keywords;

import com.inteliense.aloft.application.config.AppConfig;
import com.inteliense.aloft.grammar.antlr.AloftLexer;
import com.inteliense.aloft.grammar.antlr.AloftParser;
import com.inteliense.aloft.run.cli.Help;
import com.inteliense.aloft.run.cli.commands.base.Command;
import com.inteliense.aloft.run.cli.commands.base.HandlesCommands;
import com.inteliense.aloft.server.db.internal.Db;
import com.inteliense.aloft.server.db.internal.supporting.DbType;
import com.inteliense.aloft.server.debug.ReloadServer;
import com.inteliense.aloft.server.http.debug.DebugServer;
import com.inteliense.aloft.server.threading.ThreadGroup;
import com.inteliense.aloft.server.threading.types.DetachedThread;
import com.inteliense.aloft.utils.data.JSON;
import com.inteliense.aloft.utils.global.__;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

public class Migrate extends HandlesCommands {

    public Migrate(Command command, AppConfig config) {
        super(command, config);
    }

    @Override
    public void run(AppConfig config) {
        requiredFlag("src");
        requiredFlag("config");
        String configPath = flagValue("config");
        String srcPath = flagValue("src");
        try {
            HashMap<String, Db> connections = connect(configPath);
            __.printPrettyLn("Running migrations...\n", __.ANSI_BLUE);
            walkAndParse(srcPath, connections);
        } catch (Exception e) { System.exit(1); }
    }

    @Override
    public Help help() {
        return null;
    }

    private HashMap<String, Db> connect(String config) throws Exception {
        HashMap<String, Db> map = new HashMap<>();
        File file = new File(config);
        if(!file.exists()) {
            System.err.println("Failed to find the configuration file at the specified path.");
            throw new Exception("Failed to find the configuration file at the specified path.");
        }
        Scanner scnr = new Scanner(file);
        StringBuilder builder = new StringBuilder();
        while(scnr.hasNextLine()) {
            builder.append(scnr.nextLine());
        }
        try {
            if(!__.isset(JSON.verify(builder.toString()))) throw new Exception("Failed to read configuration file. Invalid JSON.");
            JSONObject json = JSON.getObject(builder.toString());
            if(!json.containsKey("databases")) throw new Exception("Failed to read configuration file. Invalid JSON.");
            JSONArray databases = (JSONArray) json.get("databases");
            for(int i=0; i<databases.size(); i++) {
                JSONObject connection = (JSONObject) databases.get(i);
                if(!connection.containsKey("name")) throw new Exception("Failed to read configuration file. Invalid JSON.");
                String name = (String) connection.get("name");
                if(!connection.containsKey("type")) throw new Exception("Failed to read configuration file. Invalid JSON.");
                String type = (String) connection.get("type");
                if(__.same("mysql", type)) {
                    __.printPrettyLn("Connecting to MySQL database '" + name + "'", __.ANSI_YELLOW);
                    if(!connection.containsKey("port")) throw new Exception("Failed to read configuration file. Invalid JSON.");
                    int port = (int) connection.get("port");
                    if(!connection.containsKey("host")) throw new Exception("Failed to read configuration file. Invalid JSON.");
                    String host = (String) connection.get("host");
                    if(!connection.containsKey("username")) throw new Exception("Failed to read configuration file. Invalid JSON.");
                    String username = (String) connection.get("username");
                    if(!connection.containsKey("password")) throw new Exception("Failed to read configuration file. Invalid JSON.");
                    String password = (String) connection.get("password");
                    map.put(name, new Db(DbType.MYSQL, username, password, name));
                    __.printPrettyLn("Connection created to MySQL database '" + name + "'", __.ANSI_GREEN);
                }
            }
            return map;
        } catch (Exception e) {
            System.err.println("Failed to read configuration file. Invalid JSON.");
            throw new Exception("Failed to read configuration file. Invalid JSON.");
        }
    }

    private void walkAndParse(String src, HashMap<String, Db> connections) throws Exception {
        Path dir = Paths.get(src);
        Files.walk(dir).forEach(path -> {
            try {
                parseFile(path.toFile());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    private void parseFile(File file) throws IOException {
        __.printPrettyLn("Parsing file '" + file.getAbsolutePath().split("src/")[1] + "'", __.ANSI_YELLOW);
        InputStream stream = new FileInputStream(file);
        Lexer lexer = new AloftLexer(CharStreams.fromStream(stream));
        TokenStream tokenStream = new CommonTokenStream(lexer);
        AloftParser parser = new AloftParser(tokenStream);
        RuleContext ruleContext = parser.r().getRuleContext();
        ParseTree objects = ruleContext.getChild(0);
        int size = objects.getChildCount();
        for(int i=0; i<size; i++) {
            ParseTree rootObject = objects.getChild(i);
            for(int x=0; x<rootObject.getChildCount(); x++) {
                System.out.println(rootObject.getChild(x).getText());
            }
        }
    }

}
