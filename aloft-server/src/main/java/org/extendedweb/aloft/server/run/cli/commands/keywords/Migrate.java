package org.extendedweb.aloft.server.run.cli.commands.keywords;

import org.extendedweb.aloft.server.grammar.antlr.AloftLexer;
import org.extendedweb.aloft.server.grammar.antlr.AloftParser;
import org.extendedweb.aloft.server.run.cli.Help;
import org.extendedweb.aloft.server.run.cli.commands.base.Command;
import org.extendedweb.aloft.server.run.cli.commands.base.HandlesCommands;
import org.extendedweb.aloft.server.base.db.internal.Db;
import org.extendedweb.aloft.server.base.db.internal.supporting.DbType;
import org.extendedweb.aloft.server.base.db.internal.supporting.Schema;
import org.extendedweb.aloft.utils.data.Case;
import org.extendedweb.aloft.utils.data.JSON;
import org.extendedweb.aloft.utils.exceptions.types.CriticalException;
import org.extendedweb.aloft.utils.global.__;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Migrate extends HandlesCommands {

    private ArrayList<String> models = new ArrayList<>();
    private int updates = 0;

    public Migrate(Command command) {
        super(command);
    }

    @Override
    public void run() {
        requiredFlag("src");
        requiredFlag("config");
        String configPath = flagValue("config");
        String srcPath = flagValue("src");
        try {
            HashMap<String, Db> connections = connect(configPath);
            __.printPrettyLn("Running migrations...\n", __.ANSI_BLUE);
            walkAndParse(srcPath, connections);
            System.out.println();
            __.printPrettyLn("Migrations are complete!\nThere were " + updates + " updates during the migration.");
            System.out.println();
        } catch (Exception e) { e.printStackTrace(); System.exit(1); } catch (CriticalException e) {
            throw new RuntimeException(e);
        }
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
//            if(!__.isset(JSON.verify(builder.toString()))) throw new Exception("Failed to read configuration file. Invalid JSON.");
            JSONObject json = JSON.getObject(builder.toString());
            if(!json.containsKey("databases")) throw new Exception("Failed to read configuration file. Invalid JSON.");
            JSONArray databases = (JSONArray) json.get("databases");
            for(int i=0; i<databases.size(); i++) {
                JSONObject connection = (JSONObject) databases.get(i);
                connection = (JSONObject) connection.get("connection");
                if(!connection.containsKey("name")) throw new Exception("Failed to read configuration file. Invalid JSON.");
                String name = (String) connection.get("name");
                if(!connection.containsKey("type")) throw new Exception("Failed to read configuration file. Invalid JSON.");
                String type = (String) connection.get("type");
                if(__.same("mysql", type)) {
                    __.printPrettyLn("Connecting to MySQL database '" + name + "'", __.ANSI_YELLOW);
                    if(!connection.containsKey("port")) throw new Exception("Failed to read configuration file. Invalid JSON.");
                    long port = (long) connection.get("port");
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
            e.printStackTrace();
            System.err.println("Failed to read configuration file. Invalid JSON.");
            throw new Exception("Failed to read configuration file. Invalid JSON.");
        }
    }

    private void walkAndParse(String src, HashMap<String, Db> connections) throws Exception, CriticalException {
        File dir = new File(src);
        if(!dir.exists()) {
            System.err.println("Source directory does not exist.");
            System.exit(1);
        }
        getFiles(dir.listFiles(), connections);
    }

    private void getFiles(File[] files, HashMap<String, Db> connections) throws Exception, CriticalException {
        for (File file : files) {
            if (file.isDirectory()) {
                getFiles(file.listFiles(), connections); // Calls same method again.
            } else {
                parseFile(file, connections);
            }
        }
    }

    private void parseFile(File file, HashMap<String, Db> connections) throws Exception, CriticalException {
        __.printPrettyLn("Parsing file '" + file.getAbsolutePath().split("src/")[1] + "'", __.ANSI_YELLOW);
        InputStream stream = new FileInputStream(file);
        Lexer lexer = new AloftLexer(CharStreams.fromStream(stream));
        TokenStream tokenStream = new CommonTokenStream(lexer);
        AloftParser parser = new AloftParser(tokenStream);
        List<AloftParser.SyntaxContext> root = parser.r().syntax();
        for(int i=0; i<root.size(); i++) {
            AloftParser.ModelContext ctx = root.get(i).model();
            if(!__.isset(ctx)) break;
            String name = ctx.var_name().getText();
            if(models.contains(name)) {
                System.err.println("");
                System.exit(1);
            }
            AloftParser.Curly_blockContext curlyBlockContext = ctx.curly_block();
            if(!__.isset(curlyBlockContext)) {
                System.err.println("");
                System.exit(1);
            }
            List<AloftParser.SyntaxContext> list = curlyBlockContext.syntax();
            if(list.isEmpty()) {
                System.err.println("");
                System.exit(1);
            }
            String connectionName = "";
            ArrayList<Schema.ColumnProperties> properties = new ArrayList<>();
            for(AloftParser.SyntaxContext syntax : list) {
                AloftParser.PropertyContext property = syntax.property();
                AloftParser.Declare_variableContext variable = syntax.declare_variable();

                if(__.isset(property)) {
                    String pName = syntax.property().var_name().getText();
                    String pValue = syntax.property().property_value().getText().replaceAll("[\"']", "");
                    if(pName.equals("connection")) {
                        connectionName = pValue;
                        continue;
                    }
                }
                if(__.isset(variable)) {
                    AloftParser.VariableContext var = variable.variable();
                    AloftParser.Var_typeContext type = var.var_type();
                    AloftParser.Var_expressionContext expression = variable.var_expression();
                    if(!__.isset(var)) {
                        System.err.println();
                        System.exit(1);
                    }
                    AloftParser.Var_accessContext access = var.var_access();
                    boolean required = false;
                    if(__.isset(access)) {
                        if(!access.getText().equals("*")) {
                            System.err.println();
                            System.exit(2);
                        }
                        required = true;
                    }
                    String varName = var.getText();
                    if(!__.isset(type)) {
                        System.err.println();
                        System.exit(3);
                    }
                    String typeString = type.getText();
                    String expressionValue = null;
                    if(__.isset(expression)) {
                        AloftParser.NumberContext numbers = expression.number();
                        AloftParser.StringContext str = expression.string();

                        if(__.isset(numbers)) {
                            expressionValue = numbers.getText();
                        } else if(__.isset(str)) {
                            expressionValue = str.getText();
                        } else {
                            System.err.println();
                            System.exit(6);
                        }
                    }
                    Schema.ColumnProperties p = new Schema.ColumnProperties(Case.camelToSnake(varName));
                    if(typeString.equals("id")) {
                        p.setType("varchar(40)");
                        p.primaryKey();
                    } else if(typeString.equals("string")) {
                        p.setType("varchar(255)");
                    } else {
                        p.setType(typeString);
                    }
                    if(__.isset(expressionValue)) {
                        if(expressionValue.contains(".")) {
                            String parts[] = expressionValue.split(".");
                            p.setForeignKey(parts[0], parts[1]);
                        } else {
                            p.setColumnDefault(expressionValue);
                        }
                    }
                    if(!required) p.nullable();
                    properties.add(p);
                    continue;
                }
                throw new Exception();
            }
            if(connectionName.equals("")) continue;
            Db db = connections.get(connectionName);
            updates += Schema.table(db, db.getRawDriver().conn(), connectionName, Case.classToSnake(name), properties);
        }
    }

}
