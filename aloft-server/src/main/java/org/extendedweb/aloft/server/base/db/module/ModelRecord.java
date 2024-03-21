package org.extendedweb.aloft.server.base.db.module;

import org.extendedweb.aloft.lib.lang.base.Jsonable;
import org.extendedweb.aloft.lib.model.AloftModelField;
import org.json.simple.JSONObject;

import java.util.HashMap;

public class ModelRecord implements Jsonable {

    private String model;
    private String modelId;
    private HashMap<Integer, AloftModelField> fields;

    public ModelRecord(HashMap<Integer, AloftModelField> fields) {

    }

    private String recordHash() {
        return null;
    }

    private JSONObject buildJson() {
        return new JSONObject();
    }

    @Override
    public JSONObject json() {
        return null;
    }

}
