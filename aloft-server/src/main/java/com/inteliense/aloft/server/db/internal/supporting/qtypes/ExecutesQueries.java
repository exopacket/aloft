package com.inteliense.aloft.server.db.internal.supporting.qtypes;

import com.inteliense.aloft.server.db.internal.supporting.QueryParams;
import com.inteliense.aloft.server.db.internal.supporting.QueryResults;

public interface ExecutesQueries {

    QueryResults execute(QueryParams p);
    void executeUpdate(QueryParams p);

}
