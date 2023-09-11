package com.inteliense.aloft.grammar.antlr.tests;

import com.inteliense.aloft.grammar.antlr.AloftLexer;
import com.inteliense.aloft.grammar.antlr.AloftParser;
import org.antlr.v4.runtime.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) throws Exception {
        if(args.length != 1) System.exit(1);
        String filepath = args[0];
        File file = new File(filepath);
        if(!file.exists()) System.exit(1);
        InputStream stream = new FileInputStream(file);
        Lexer lexer = new AloftLexer(CharStreams.fromStream(stream));
        TokenStream tokenStream = new CommonTokenStream(lexer);
        AloftParser parser = new AloftParser(tokenStream);
        RuleContext ruleContext = parser.r().getRuleContext();
        int index = ruleContext.getRuleIndex();
        System.out.println(index);
        System.out.println(parser.getRuleNames()[index]);
        System.out.println(ruleContext.getChild(0).getText());
    }

}
