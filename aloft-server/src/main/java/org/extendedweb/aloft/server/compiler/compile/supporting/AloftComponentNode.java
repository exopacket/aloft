package org.extendedweb.aloft.server.compiler.compile.supporting;

import org.extendedweb.aloft.lib.lang.structure.components.AloftComponent;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.lang.types.t.ArrayT;
import org.extendedweb.aloft.lib.lang.types.t.DynamicT;
import org.extendedweb.aloft.server.compiler.compile.base.TypeCompiler;
import org.extendedweb.aloft.server.compiler.compile.base.register.CompiledObjectsRegister;
import org.extendedweb.aloft.server.compiler.exceptions.CompilerException;
import org.extendedweb.aloft.server.grammar.antlr.AloftParser;

import java.util.ArrayList;
import java.util.List;

public class AloftComponentNode {

    private String component;
    private String id;
    private ArrayList<AloftComponentProperty> properties = new ArrayList<>();
    private ArrayList<AloftComponentNode> children = new ArrayList<>();
    private AloftRenderConditions conditions;

    public AloftComponentNode(ContextContainer container, CompiledObjectsRegister register) throws CompilerException {
        AloftParser.Component_treeContext ctx = (AloftParser.Component_treeContext) container.context();
        AloftParser.Var_nameContext varCtx = ctx.var_name();
        component = varCtx.getText();
        List<AloftParser.PropertyContext> properties = ctx.property();
        for(AloftParser.PropertyContext property : properties) {
            AloftParser.Var_nameContext nameCtx = property.var_name();
            String name = nameCtx.getText();
            AloftParser.Property_valueContext valueCtx = property.property_value();
            if(name.equals("children")) {
                AloftComponentBuilder[] children = TypeCompiler.compile(new ArrayT(), new ContextContainer(valueCtx, container.getFile())).get();
                for(int i=0; i<children.length; i++) this.children.add(children[i].get());
            } else if(name.equals("child")) {
                this.children.add(TypeCompiler.compile(new BuiltComponentContainerT(), new ContextContainer(valueCtx, container.getFile())).get());
            } else {
                this.properties.add(new AloftComponentProperty(name, TypeCompiler.compile(new DynamicT(), new ContextContainer(valueCtx, container.getFile()))));
            }
        }
    }

    public AloftComponentNode(ContextContainer container, CompiledObjectsRegister register, AloftRenderConditions conditions) throws CompilerException {
        this.conditions = conditions;
        AloftParser.Component_treeContext ctx = (AloftParser.Component_treeContext) container.context();
        AloftParser.Var_nameContext varCtx = ctx.var_name();
        component = varCtx.getText();
        List<AloftParser.PropertyContext> properties = ctx.property();
        for(AloftParser.PropertyContext property : properties) {
            AloftParser.Var_nameContext nameCtx = property.var_name();
            String name = nameCtx.getText();
            AloftParser.Property_valueContext valueCtx = property.property_value();
            if(name.equals("children")) {
                AloftComponentBuilder[] children = TypeCompiler.compile(new ArrayT(), new ContextContainer(valueCtx, container.getFile())).get();
                for(int i=0; i<children.length; i++) this.children.add(children[i].get());
            } else if(name.equals("child")) {
                this.children.add(TypeCompiler.compile(new BuiltComponentContainerT(), new ContextContainer(valueCtx, container.getFile())).get());
            } else {
                this.properties.add(new AloftComponentProperty(name, TypeCompiler.compile(new DynamicT(), new ContextContainer(valueCtx, container.getFile()))));
            }
        }
    }

    private void build(CompiledObjectsRegister register) {

    }

    private void registration(CompiledObjectsRegister register) {

    }

    public AloftComponent component() {
        return null;
    }

    private static class AloftComponentProperty {
        private String name;
        private V value;
        private boolean hasConditions = false;
        private AloftRenderConditions conditions = null;

        public AloftComponentProperty(String name, AloftRenderConditions conditions) {
            this.name = name;
            this.conditions = conditions;
            this.hasConditions = true;
        }

        public AloftComponentProperty(String name, V value) {
            this.name = name;
            this.value = value;
        }

        public V getValue() {
            if(hasConditions) return conditions.val();
            return value;
        }

        public String getName() {
            return name;
        }

    }

}
