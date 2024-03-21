package org.extendedweb.aloft.lib.lang.types.t;

import org.extendedweb.aloft.lib._AloftModel;
import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.model.AloftModelField;

import java.util.ArrayList;

public class RelatedT extends FieldT {

    private _AloftModel related;
    private ArrayList<AloftModelField> fields = new ArrayList<>();

    //TODO FIXME create the FieldT with the superclass constructor
    public RelatedT(FieldT parent, _AloftModel related) {
        super(parent.getParent(), parent.getName(), T.model(parent.getName(), related));
        this.related = related;
        reload();
    }

    public void reload() {
        ((ModelT) this.type).reloadFromModel(related);
        this.fields.clear();
        this.fields.addAll(related.getFields());
    }

    @Override
    public V value(Object v) {
        reload();
        return ((ModelT) this.type).value();
    }

    public V value() {
        return value(null);
    }

}
