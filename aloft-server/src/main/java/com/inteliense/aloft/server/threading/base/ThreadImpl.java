package com.inteliense.aloft.server.threading.base;

import com.inteliense.aloft.utils.global.__;

import java.util.HashMap;

public abstract class ThreadImpl {

    public ThreadImpl() { }

    protected int idleMillis = 0;
    protected Thread thread = null;
    private HashMap<String, Object> vars = new HashMap<>();

    public boolean issetVar(String name) {
        return vars.containsKey(name) && __.isset(vars.get(name));
    }

    public void setVar(String name, Object value) {
        if(vars.containsKey(name)) vars.replace(name, value);
        else vars.put(name, value);
    }

    public Object getVar(String name) {
        if(vars.containsKey(name)) return vars.get(name);
        return null;
    }

    public void removeVar(String name) {
        vars.remove(name);
    }

    public abstract boolean doesJoin();
    protected abstract boolean execute();
    protected abstract void onStart();
    protected abstract void onStop();
    public abstract void start();
    public abstract void stop();

}
