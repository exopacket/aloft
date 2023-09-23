package com.inteliense.aloft.compiler.lang.supporting;

import com.inteliense.aloft.compiler.lang.keywords.components.AloftComponent;
import com.inteliense.aloft.server.html.elements.js.AppJavaScript;
import com.inteliense.aloft.utils.data.BaseX;
import com.inteliense.aloft.utils.encryption.SHA;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

public class DynamicMountableComponent extends AloftComponent {

    private HashMap<String, MountableComponent> map = new HashMap<>();

    public DynamicMountableComponent() { super(); }

    public DynamicMountableComponent(MountableComponent initial) {
        super();
        map.put(initial.getId(), initial);
    }

    public void addComponent(MountableComponent component) {
        if(map.containsKey(component.getId())) return;
        map.put(component.getId(), component);
    }

    public MountableComponent getActive(String name) {
        String id = BaseX.encode64(SHA.Bites.getSha1(name));
        if(map.containsKey(id)) return map.get(id);
        return null;
    }

    @Override
    public String getName() {
        return null;
    }
}
