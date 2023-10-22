package org.extendedweb.aloft.lib.lang.structure.style;

import org.extendedweb.aloft.utils.global.__;

public class AloftStyleConditionalClass extends AloftStyleClass {

    private String conditionalKey = null;
    private String elementKey = null;
    private String groupId = null;

    public AloftStyleConditionalClass(String className, AloftStyle style, String groupId, String conditionalKey, String elementKey) {
        super(className, style);
        this.conditionalKey = conditionalKey;
        this.elementKey = elementKey;
        this.groupId = groupId;
    }

    @Override
    public boolean isConditional() {
        return true;
    }

    public boolean match(String groupId) {
        return __.same(groupId, this.groupId);
    }

    public boolean inGroup(String groupId) {
        return __.same(groupId, this.groupId);
    }

    public boolean match(String groupId, String conditionalKey) {
        return __.same(conditionalKey, this.conditionalKey) && __.same(groupId, this.groupId);
    }

    public String getElementKey() {
        return elementKey;
    }

}
