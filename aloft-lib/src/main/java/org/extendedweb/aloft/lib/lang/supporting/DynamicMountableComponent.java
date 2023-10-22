package org.extendedweb.aloft.lib.lang.supporting;

import org.extendedweb.aloft.lib.lang.structure.components.AloftComponent;
import org.extendedweb.aloft.utils.data.BaseX;
import org.extendedweb.aloft.utils.encryption.SHA;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public abstract class DynamicMountableComponent extends AloftComponent {

    private HashMap<String, MountableComponent> map = new HashMap<>();

    public DynamicMountableComponent() throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException { super(); mountables(map); }

    public DynamicMountableComponent(MountableComponent initial) {
        super();
        map.put(initial.getId(), initial);
    }

    protected abstract void mountables(HashMap<String, MountableComponent> map) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException;

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
        return "__mountable_component__";
    }
}
