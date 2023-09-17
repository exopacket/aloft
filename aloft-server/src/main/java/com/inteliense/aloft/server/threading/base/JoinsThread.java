package com.inteliense.aloft.server.threading.base;

public abstract class JoinsThread extends ThreadImpl {
    @Override
    public boolean doesJoin() { return true; }
}
