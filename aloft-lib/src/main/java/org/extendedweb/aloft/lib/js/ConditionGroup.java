package org.extendedweb.aloft.lib.js;

import org.extendedweb.aloft.lib.html.elements.js.JavaScriptObject;

public class ConditionGroup extends JSO {

    private Condition[] conditions;

    public ConditionGroup(Condition...conditions) {
        this.conditions = conditions;
    }

    @Override
    protected JavaScriptObject build() {
        return new JavaScriptObject() {
            @Override
            protected void create() {
                for(org.extendedweb.aloft.lib.js.Condition condition : conditions)
                    child(condition.build());
            }
        };
    }
}
