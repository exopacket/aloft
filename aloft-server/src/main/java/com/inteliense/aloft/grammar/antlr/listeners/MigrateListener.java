package com.inteliense.aloft.grammar.antlr.listeners;

import com.inteliense.aloft.compiler.lang.lib.model._AloftModel;
import com.inteliense.aloft.grammar.antlr.AloftBaseListener;
import com.inteliense.aloft.grammar.antlr.AloftParser;
import com.inteliense.aloft.utils.global.__;

import java.util.ArrayList;
import java.util.List;

public class MigrateListener extends AloftBaseListener {

    private ArrayList<_AloftModel> models = new ArrayList<>();

    @Override
    public void enterModel(AloftParser.ModelContext ctx) {
        if(modelExists(ctx.var_name().getRuleContext().getChild(0).getText())) return;
        _AloftModel model = new _AloftModel(ctx.var_name().getRuleContext().getChild(0).getText());
        try {
            inner(ctx.curly_block(), model);
        } catch (Exception e) {
            System.out.println("SYNTAX ERROR");
        }
    }

    private boolean modelExists(String modelName) {
        return false;
    }

    private void inner(AloftParser.Curly_blockContext ctx, _AloftModel model) throws Exception {
        List<AloftParser.SyntaxContext> list = ctx.syntax();
        for(AloftParser.SyntaxContext syntax : list) {
            if(__.isset(syntax.NEW_LINE())) continue;
            if(__.isset(syntax.property())) {
                String pName = syntax.property().var_name().getText();
                String pValue = syntax.property().property_value().getText().replaceAll("[\"']", "");
                if(pName.equals("connection")) {
                    System.out.println("connection=" + pValue);
                    model.setConnection(pValue);
                    continue;
                }
            } else if(__.isset(syntax.declare_variable())) continue;
            throw new Exception();
        }
    }

    @Override
    public void enterModule(AloftParser.ModuleContext ctx) {
        System.out.println("ERROR");
    }

    @Override
    public void enterAnimation(AloftParser.AnimationContext ctx) {
        System.out.println("ERROR");
    }
}
