package org.extendedweb.aloft.lib;

import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.t.FieldT;
import org.extendedweb.aloft.lib.model.AloftModelField;
import org.extendedweb.aloft.lib.model.AloftModelQuery;
import org.extendedweb.aloft.lib.model.AloftModelCollection;
import org.extendedweb.aloft.utils.encryption.A32;
import org.extendedweb.aloft.utils.encryption.Rand;
import org.extendedweb.aloft.utils.global.__;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class _AloftModel {

    private String name;
    private String connectionName = "default";
    private ArrayList<AloftModelField> fields = new ArrayList<>();

    public _AloftModel(String name) {
        this.name = name;
    }

    public _AloftModel(String name, String connectionName) {
        this.name = name;
        this.connectionName = connectionName;
//        this.fields = createFields(fields(new HashMap<>()));
    }

    public String getConnectionName() {
        return connectionName;
    }

    public String getModelId() {
        return Rand.letter(this.name + "_" + this.connectionName) + A32.casified(this.name + "_" + this.connectionName);
     }

    protected abstract HashMap<String, T> fields();
    protected abstract void query(AloftModelQuery query);
    protected abstract AloftModelCollection getQuery(AloftModelQuery query);

    public String getName() {
        return name;
    }

    public void change(AloftModelQuery query) {
        query(query);
    }

    public AloftModelCollection retrieve(AloftModelQuery query) {
        return getQuery(query);
    }

    public ArrayList<AloftModelField> getFields() {
        return fields;
    }

    public AloftModelCollection getById() { return null; }

    public AloftModelCollection getById(String... fields) { return null; }

    public FieldT[] only(String...fields) {
        FieldT[] arr = new FieldT[fields.length];
//        for(int i=0; i<fields.length; i++) {
//            String field = fields[i];
//            for(FieldT v : this.fields) {
//                if(__.same(v.getName(), field)) {
//                    arr[i] = v;
//                    break;
//                }
//            }
//        }
        return arr;
    }

    public void migrate(String db) { }

//    private ArrayList<FieldT> createFields(HashMap<String, T> map) {
//        for(String key : map.keySet()) {
//
//        }
//    }

}
