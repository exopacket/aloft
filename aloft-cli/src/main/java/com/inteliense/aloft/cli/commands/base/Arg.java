package com.inteliense.aloft.cli.commands.base;

public class Arg {

    private String name;
    private String value = null;
    private boolean flag = false;
    private boolean required = false;

    public Arg(String name) {
        if(name.contains("--")) this.flag = true;
        this.name = name.replace("-", "");
    }

    public Arg(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Arg requiresValue() {
        this.required = true;
        return this;
    }

    public boolean isFlag() {
        return this.flag;
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

}
