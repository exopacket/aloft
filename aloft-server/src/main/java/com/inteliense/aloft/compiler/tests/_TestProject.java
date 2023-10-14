package com.inteliense.aloft.compiler.tests;

import com.inteliense.aloft.compiler.lang.lib._AloftEntryPoint;
import com.inteliense.aloft.compiler.lang.lib._AloftProject;

public class _TestProject extends _AloftEntryPoint {

    private static _AloftProject project;

    public static void main(String[] args) {
        _TestProject project = new _TestProject();
        project.launch();
    }

    @Override
    public void launch() {
    }

}
