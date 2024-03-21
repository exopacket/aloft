package org.extendedweb.aloft.lib.http.protocol.responses.base;

import org.extendedweb.aloft.lib.lang.base.Jsonable;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.utils.global.__;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;

public class ResponseObject implements Jsonable {

    private String key;
    private V value;
    private boolean isArray = false;
    private ArrayList<ResponseObject> children = new ArrayList<>();

    public ResponseObject(String key) {
        this.key = key;
    }

    public ResponseObject(String key, boolean isArray) {
        this.key = key;
        this.isArray = isArray;
    }

    public ResponseObject(V value) {
        this.value = value;
    }

    public ResponseObject(String key, V value) {
        this.key = key;
        this.value = value;
    }

    public ResponseObject pair(String key, V value) {
        ResponseObject object = new ResponseObject(key, value);
        children.add(object);
        return object;
    }

    public ResponseObject array(String key) {
        ResponseObject arr = new ResponseObject(key, true);
        children.add(arr);
        return arr;
    }

    public String getKey() {
        return key;
    }

    public ResponseObject object(String key) {
        ResponseObject object = new ResponseObject(key);
        children.add(object);
        return object;
    }

    public ResponseObject add(V value) {
        if(!isArray) return null;
        children.add(new ResponseObject(value));
        return this;
    }

    public ResponseObject add(ResponseObject object) {
        if(!isArray) return null;
        children.add(object);
        return this;
    }

    public ResponseObject put(String key, V value) {
        ResponseObject object = new ResponseObject(key, value);
        children.add(object);
        return this;
    }

    public ResponseObject put(ResponseObject object) {
        children.add(object);
        return this;
    }

    public boolean isRawValue() {
        return children.isEmpty() && __.isset(value);
    }

    public V getValue() {
        return value;
    }

    @Override
    public JSONObject json() {
        JSONObject jsonObj = new JSONObject();
        if(isArray) {
            JSONArray arr = new JSONArray();
            for(ResponseObject resp : children) {
                if(resp.isRawValue()) {
                    arr.add(resp.getValue().get());
                } else {
                    arr.add(resp.json());
                }
            }
            jsonObj.put(key, arr);
            return jsonObj;
        } else {
            if(isRawValue()) {
                jsonObj.put(key, value.get());
                return jsonObj;
            } else {
                for(ResponseObject resp : children) {
                    JSONObject obj = resp.json();
                    jsonObj.put(resp.getKey(), obj.get(resp.getKey()));
                }
            }
        }
        JSONObject container = new JSONObject();
        container.put(this.getKey(), jsonObj);
        return container;
    }
}
