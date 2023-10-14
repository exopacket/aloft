package com.inteliense.aloft.compiler.lang.supporting;

import com.inteliense.aloft.compiler.lang.keywords.components.AloftComponent;
import com.inteliense.aloft.server.html.elements.HtmlElement;
import com.inteliense.aloft.utils.global.__;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class MountableComponent extends AloftComponent {

    private DynamicMountableComponent slot;
    private ArrayList<AloftComponent> components = new ArrayList<>();

    public MountableComponent() throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        super();
        slot = new DynamicMountableComponent() {
            @Override
            protected void mountables(HashMap<String, MountableComponent> map) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
                ArrayList<AloftComponent> v = build();
                for(AloftComponent component : v) { }
//                    map.put(component.getId());
//                }
            }
        };
    }

    protected abstract ArrayList<AloftComponent> build() throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException;

    public void appendComponent(AloftComponent component) {
        this.components.add(component);
    }

    public HtmlElement get(List<String> arr, HtmlElement root) {
        String current = null;
        if(arr.size() > 0) current = arr.get(0);
        MountableComponent toMount = (__.isset(current)) ? slot.getActive(current) : null;
        if(components.size() == 1) return components.get(0).html(null);
        for(int i=0; i< components.size(); i++) {
            AloftComponent component = components.get(i);
            if(__.isset(toMount) && component instanceof MountPoint) {
                arr.remove(0);
                root.addChild(toMount.get(arr, toMount.html(null)));
            } else {
                root.addChild(component.html(null));
            }
        }
        return root;
    }

    public MountPoint createSlot(boolean append) {
        if(append) appendComponent(createSlot());
        return createSlot();
    }

    public MountPoint createSlot() {
        return new MountPoint();
    }
//
//    public MountableComponent createInlineComponent(AloftComponent component, boolean append) {
//        MountableComponent mountable = new MountableComponent() {
//            @Override
//            public String getName() {
//                return component.getName();
//            }
//        };
//        if(append) this.components.add(mountable);
//        return mountable;
//    }

//    public MountableComponent createInlineComponent(AloftComponent component) {
//        return createInlineComponent(component, false);
//    }
//
//    public void appendMountables(MountableComponent component) {
//        this.child.addComponent(component);
//    }

}
