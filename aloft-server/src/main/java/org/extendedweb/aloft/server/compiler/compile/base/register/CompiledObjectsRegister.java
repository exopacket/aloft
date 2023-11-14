package org.extendedweb.aloft.server.compiler.compile.base.register;

import org.extendedweb.aloft.lib._AloftObjects;
import org.extendedweb.aloft.lib._AloftProject;
import org.extendedweb.aloft.lib.application.config.AppConfig;

public class CompiledObjectsRegister {

    private _AloftObjects objects = new _AloftObjects();
    private AppConfig config = null;

    public CompiledObjectsRegister(String configPath) {
        config = parseConfig(configPath);
    }

    public _AloftObjects getApp() {
        return objects;
    }

    public _AloftProject buildProject() {
        return null;
    }

    private AppConfig parseConfig(String configPath) {
        return new AppConfig(configPath);
    }

}
