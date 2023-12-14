package org.extendedweb.aloft.server.compiler.compile.base;

import org.extendedweb.aloft.lib._AloftProject;
import org.extendedweb.aloft.server.compiler.compile.base.objects.PageAloftObject;
import org.extendedweb.aloft.server.compiler.compile.base.objects.RouteGroupAloftObject;
import org.extendedweb.aloft.server.compiler.compile.base.register.CompiledObjectsRegister;
import org.extendedweb.aloft.server.compiler.compile.supporting.ContextContainer;
import org.extendedweb.aloft.server.compiler.exceptions.CompilerException;
import org.extendedweb.aloft.server.grammar.antlr.AloftLexer;
import org.extendedweb.aloft.server.grammar.antlr.AloftParser;
import org.antlr.v4.runtime.*;
import org.extendedweb.aloft.server.base.debug.FileWatcher;
import org.extendedweb.aloft.server.compiler.compile.base.register.ComponentObjectRegister;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

public class AloftCompiler {

    private File dir = null;
    private boolean debug = false;
    private FileWatcher watcher = null;
    private CompiledObjectsRegister compiledObjects = null;

    public AloftCompiler(String dir, boolean debug) {
        this.dir = new File(dir);
        this.debug = debug;
        this.compiledObjects = new CompiledObjectsRegister("", new ComponentObjectRegister());
        compileAll();
        if(this.debug) {
            watcher = new FileWatcher(this.dir) {
                @Override
                protected void compile(FileContains file) {
                    compileFile(file.getFile());
                }
            };
        }
    }

    private void compileAll() {
        iterate(this.dir.listFiles());
    }

    private void compileFile(File file) {
        try {
            System.out.println(file.getAbsoluteFile().getPath());
            InputStream stream = new FileInputStream(file);
            Lexer lexer = new AloftLexer(CharStreams.fromStream(stream));
            TokenStream tokenStream = new CommonTokenStream(lexer);
            AloftParser parser = new AloftParser(tokenStream);
            AloftParser.RContext r = parser.r();
            List<AloftParser.SyntaxContext> root = r.syntax();
            for(int i=0; i<root.size(); i++) {
                PageAloftObject page = PageAloftObject.createIf(root, compiledObjects, i, file);
                if(isset(page)) {
                    compiledObjects.register(PageAloftObject.class, page, new ContextContainer(root.get(i).page().var_name(), file));
                    continue;
                }
                RouteGroupAloftObject routeGroup = RouteGroupAloftObject.createIf(root, compiledObjects, i, file);
                if(isset(routeGroup)) {
                    compiledObjects.register(RouteGroupAloftObject.class, routeGroup, new ContextContainer(root.get(i).routes().path(), file));
                    continue;
                }
            }
            _AloftProject project = compiledObjects.buildProject();
        } catch (Exception e) {
            e.printStackTrace();
        } catch (CompilerException e) {
            e.handle();
        }
    }

    private boolean isset(Object o) {
        return o != null;
    }

    private void iterate(File[] files) {
        for (File file : files) {
            if (file.isDirectory()) {
                iterate(file.listFiles());
            } else {
                if(file.getName().contains(".aloft")) compileFile(file);
            }
        }
    }

}
