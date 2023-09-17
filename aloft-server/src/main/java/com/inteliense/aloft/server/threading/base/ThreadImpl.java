package com.inteliense.aloft.server.threading.base;

public abstract class ThreadImpl {

    public ThreadImpl() { }


    protected int idleMillis = 0;
    protected Thread thread = null;

    public abstract boolean doesJoin();
    protected abstract boolean execute();
    public abstract void start();
    public abstract void stop();

}
