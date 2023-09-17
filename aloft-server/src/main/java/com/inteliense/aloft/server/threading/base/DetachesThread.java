package com.inteliense.aloft.server.threading.base;

public abstract class DetachesThread extends ThreadImpl {
    @Override
    public boolean doesJoin() { return false; }
}
