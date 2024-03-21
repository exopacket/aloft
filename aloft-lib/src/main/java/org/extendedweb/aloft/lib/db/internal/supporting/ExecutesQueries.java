package org.extendedweb.aloft.lib.db.internal.supporting;

import org.extendedweb.aloft.lib.db.internal.supporting.QueryParams;
import org.extendedweb.aloft.lib.db.internal.supporting.QueryResults;

public interface ExecutesQueries {

    QueryResults execute(QueryParams p);
    void executeUpdate(QueryParams p);

}
