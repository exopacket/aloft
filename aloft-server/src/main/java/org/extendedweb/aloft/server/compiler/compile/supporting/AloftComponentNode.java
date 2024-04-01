package org.extendedweb.aloft.server.compiler.compile.supporting;

import org.extendedweb.aloft.lib.ModuleElementAttributes;
import org.extendedweb.aloft.lib.html.Html;
import org.extendedweb.aloft.lib.html.elements.HtmlElement;
import org.extendedweb.aloft.lib.lang.base.ElementMapper;
import org.extendedweb.aloft.lib.lang.structure.AloftTheme;
import org.extendedweb.aloft.lib.lang.structure.components.AloftComponent;
import org.extendedweb.aloft.lib.lang.structure.components.AloftObjectProperties;
import org.extendedweb.aloft.lib.lang.structure.components.AloftObjectProperty;
import org.extendedweb.aloft.lib.lang.structure.elements.types.TextAloftElement;
import org.extendedweb.aloft.lib.lang.types.base.A;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.lang.types.t.AloftComponentT;
import org.extendedweb.aloft.lib.lang.types.t.ArrayT;
import org.extendedweb.aloft.lib.lang.types.t.DynamicT;
import org.extendedweb.aloft.lib.lang.types.v.AloftComponentV;
import org.extendedweb.aloft.server.compiler.compile.base.TypeCompiler;
import org.extendedweb.aloft.server.compiler.compile.base.objects.ComponentAloftObject;
import org.extendedweb.aloft.server.compiler.compile.base.objects.PageAloftObject;
import org.extendedweb.aloft.server.compiler.compile.base.register.CompiledObjectsRegister;
import org.extendedweb.aloft.server.compiler.compile.base.register.ComponentObjectRegister;
import org.extendedweb.aloft.server.compiler.exceptions.CompilerException;
import org.extendedweb.aloft.server.grammar.antlr.AloftParser;
import org.extendedweb.aloft.utils.encryption.A32;
import org.extendedweb.aloft.utils.encryption.Rand;
import org.extendedweb.aloft.utils.encryption.SHA;
import org.extendedweb.aloft.utils.global.__;

import java.util.ArrayList;
import java.util.List;

public class AloftComponentNode {

    private String name;
    private String id;
    private ArrayList<AloftComponentProperty> properties = new ArrayList<>();
    private ArrayList<AloftComponentNode> children = new ArrayList<>();
    private AloftRenderConditions conditions;

    public AloftComponentNode(ContextContainer container, CompiledObjectsRegister register) throws CompilerException {
        AloftParser.Component_treeContext ctx = (AloftParser.Component_treeContext) container.context();
        AloftParser.Var_nameContext varCtx = ctx.var_name();
        name = varCtx.getText();
        if(!register.getComponentsRegister().exists(name)) new ContextContainer(varCtx, container.getFile()).e("Component '" + name + "' not found within scope.", CompilerException.ExceptionType.FATAL);
        ArrayList<AloftVariable> vars = register.getComponentsRegister().get(name).getVariables();
        List<AloftParser.PropertyContext> properties = ctx.property();
        int requiredSize = 0;
        int requiredCompiled = 0;
        for(AloftVariable variable : vars) if(variable.isRequired()) requiredSize++;
        for(AloftParser.PropertyContext property : properties) {
            AloftParser.Var_nameContext nameCtx = property.var_name();
            String name = nameCtx.getText();
            AloftVariable variable = null;
            for(AloftVariable var : vars) {
                if(__.same(var.getIdentifier(), name)) {
                    variable = var;
                    break;
                }
            }
            if(!__.isset(variable)) {
                new ContextContainer(varCtx, container.getFile()).e("Component property '" + name + "' not found within the component.", CompilerException.ExceptionType.CRITICAL);
                continue;
            }
            //TODO AloftComponentT returning null because of no support in the type compiler
            //  ?? should be added as child (new AloftComponentNode())?
            AloftParser.Property_valueContext valueCtx = property.property_value();
            if(__.isset(valueCtx.component_tree())) {
                AloftComponentNode node = new AloftComponentNode(new ContextContainer(valueCtx.component_tree(), container.getFile()), register);
                AloftComponent component = node.build(register);
                AloftComponentV componentV = new AloftComponentV(component);
                this.properties.add(new AloftComponentProperty(name, componentV));
            } else {
                this.properties.add(new AloftComponentProperty(name, TypeCompiler.compile(variable.getType(), new ContextContainer(valueCtx, container.getFile()))));
            }
            if(variable.isRequired()) requiredCompiled++;
        }
        if(requiredCompiled < requiredSize) {
            container.e("Required properties missing.", CompilerException.ExceptionType.FATAL);
        }
    }

    public AloftComponent build(CompiledObjectsRegister register, ArrayList<AloftVariable> variables) {
        System.out.println("BUILD");
        AloftComponent c;
        if(__.isset(register.getComponentsRegister().getComponent(name))) {
             c = register.getComponentsRegister().getComponent(name);
        } else {
            c = new AloftComponent() {
                @Override
                public String getName() {
                    return name;
                }

                @Override
                public AloftObjectProperties getProperties() {
                    AloftObjectProperties props = new AloftObjectProperties();
                    for (AloftVariable variable : variables) {
                        if (variable.isRequired()) {
                            props.put(variable.getIdentifier(), variable.getType(), true);
                            if (variable.isset()) {
                                props.get(variable.getIdentifier()).replace(variable.value());
                            }
                        } else if (!variable.isRequired()) {
                            props.put(variable.getIdentifier(), variable.getType(), false);
                            if (variable.isset()) {
                                props.get(variable.getIdentifier()).replace(variable.value());
                            }
                        }
                    }
                    return props;
                }
            };
        }
        ArrayList<AloftObjectProperty> objectProps = new ArrayList<>();
        for(AloftComponentProperty prop : properties) {
              objectProps.add(new AloftObjectProperty(prop.getName(), prop.getValue()));
        }
        c.setVars(objectProps);
        return c;
    }

    public AloftComponent build(CompiledObjectsRegister register) {
        AloftComponent c;
        if(__.isset(register.getComponentsRegister().getComponent(name))) {
            c = register.getComponentsRegister().getComponent(name);
        } else {
            c = new AloftComponent() {
                @Override
                public String getName() {
                    return name;
                }
            };
        }
        ArrayList<AloftObjectProperty> objectProps = new ArrayList<>();
        for(AloftComponentProperty prop : properties) {
            objectProps.add(new AloftObjectProperty(prop.getName(), prop.getValue()));
        }
        c.setVars(objectProps);
        return c;
    }

    public AloftComponent component() {
        return new AloftComponent() {
            @Override
            public String getName() {
                return name;
            }
        };
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
