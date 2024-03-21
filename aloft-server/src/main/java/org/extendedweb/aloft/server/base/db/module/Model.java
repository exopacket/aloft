package org.extendedweb.aloft.server.base.db.module;

import org.extendedweb.aloft.lib._AloftModel;
import org.extendedweb.aloft.lib.application.config.AppConfig;
import org.extendedweb.aloft.lib.db.internal.Db;
import org.extendedweb.aloft.lib.model.AloftModelField;
import org.extendedweb.aloft.lib.http.protocol.responses.base.DefinedResponse;

import java.util.ArrayList;
import java.util.HashMap;

public class Model {

    private String model;
    private String modelId;
    private HashMap<Integer, AloftModelField> fields;
    private ArrayList<ModelRecord> records;
    private Db db;

    public Model(_AloftModel model, AppConfig config) {
        this.model = model.getName();
        this.modelId = model.getModelId();
        this.fields = new HashMap<>();
        int i = 1;
        for(AloftModelField field : model.getFields()) {
            fields.put(i, field);
            i++;
        }
        this.db = config.db(model.getConnectionName());
    }

    public static DefinedResponse find(_AloftModel model, AppConfig config, String id) {
        Model instance = new Model(model, config);
        return instance.hashById(id);
    }

    public static DefinedResponse verify(_AloftModel model, AppConfig config, String id, String hash) {
        Model instance = new Model(model, config);
        return instance.hashById(id);
    }

    public static DefinedResponse getNeeded(_AloftModel model, AppConfig config, String id, int...fields) {
        Model instance = new Model(model, config);
        return instance.hashById(id);
    }

    public DefinedResponse hashById(String recordId) {
        return null;
    }

}
