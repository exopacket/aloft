package org.extendedweb.aloft.server.base.db.internal.supporting;

import org.extendedweb.aloft.server.base.db.internal.supporting.QueryParams;
import org.extendedweb.aloft.server.base.db.internal.supporting.QueryResults;

public interface ExecutesQueries {

    QueryResults execute(QueryParams p);
    void executeUpdate(QueryParams p);

}
