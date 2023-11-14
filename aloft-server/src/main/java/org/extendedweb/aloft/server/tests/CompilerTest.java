package org.extendedweb.aloft.server.tests;

import org.extendedweb.aloft.server.compiler.compile.base.AloftCompiler;

public class CompilerTest {

    public static void main(String[] args) {
        String directory = "/home/ryan/aloft/aloft-server/aloft-compiler-tests";
        new AloftCompiler(directory, false);
    }

}
