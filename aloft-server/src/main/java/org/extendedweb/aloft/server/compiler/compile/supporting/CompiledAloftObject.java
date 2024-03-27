package org.extendedweb.aloft.server.compiler.compile.supporting;

import org.extendedweb.aloft.lib._AloftObject;

public class CompiledAloftObject {

    private _AloftObject compiledObject;
    private AloftObject compilerObject;

    public CompiledAloftObject(_AloftObject compiledObject, AloftObject compilerObject) {
        this.compiledObject = compiledObject;
        this.compilerObject = compilerObject;
    }

}
