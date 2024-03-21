package org.extendedweb.aloft.lib.model;

public class AloftModelQueryInsert {

    private AloftModelQueryType type;
    private String model;

    public AloftModelQueryInsert(AloftModelQueryType type, String model) {
        this.type = type;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

}
