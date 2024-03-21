package org.extendedweb.aloft.lib.model;

import org.extendedweb.aloft.lib.lang.types.base.V;

import java.util.ArrayList;

public class AloftModelQueryWhere {

    private String table;
    private WhereGroup root = new WhereGroup();

    public AloftModelQueryWhere(String table) {
        this.table = table;
    }
    
    public WhereGroup root() {
        return this.root;
    }
    
    public class WhereGroup {
        
        private ArrayList<WhereGroup> inner = new ArrayList<>();
        private WhereGroup parent;
        protected boolean or = false;
        
        public WhereGroup() { }
        
        public WhereGroup(boolean or) { this.or = or; }
        
        public WhereGroup(boolean or, WhereGroup parent) {
            this.or = or;
            this.parent = parent;
        }
        
        public WhereGroup whereGroup() {
            WhereGroup group = new WhereGroup(false,this);
            inner.add(group);
            return group;
        }

        public WhereGroup orWhereGroup() {
            WhereGroup group = new WhereGroup(true,this);
            inner.add(group);
            return group;
        }
        
        public WhereGroup endGroup() {
            return parent;
        }
        
        public WhereGroup where(V v1, String operator, V v2) {
            inner.add(new AloftModelQueryWhereCondition(v1, operator, v2, false));
            return this;
        }

        public WhereGroup orWhere(V v1, String operator, V v2) {
            inner.add(new AloftModelQueryWhereCondition(v1, operator, v2, true));
            return this;
        }
        
    }

    public class AloftModelQueryWhereCondition extends WhereGroup {

        private WhereRef ref1;
        private WhereRef ref2;
        private String operator;
        
        public AloftModelQueryWhereCondition(V v1, String operator, V v2, boolean or) {
            this.operator = operator;
            this.ref1 = new WhereRef(table, v1);
            this.ref2 = new WhereRef(table, v2);
            this.or = or;
        }

    }

    public class WhereRef {

        private V value;

        public WhereRef(String table, V value) {
            this.value = value;
        }
        
        public V get() {
            return value;
        }

    }

}
