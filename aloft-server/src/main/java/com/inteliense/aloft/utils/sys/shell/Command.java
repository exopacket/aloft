package com.inteliense.aloft.utils.sys.shell;

public abstract class Command {

    public abstract Status lineRead(byte[] bytes, String string);

}
