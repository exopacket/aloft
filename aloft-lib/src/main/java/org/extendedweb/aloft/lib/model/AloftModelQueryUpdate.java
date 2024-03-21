package org.extendedweb.aloft.lib.model;

public class AloftModelQueryUpdate {

    private AloftModelQueryType type;
    private String model;

    public AloftModelQueryUpdate(AloftModelQueryType type, String model) {
        this.type = type;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

}
