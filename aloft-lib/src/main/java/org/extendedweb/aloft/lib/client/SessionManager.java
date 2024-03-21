package org.extendedweb.aloft.lib.client;

import org.extendedweb.aloft.lib.db.internal.connectors.RedisConnection;

import java.util.ArrayList;

public class SessionManager {

    private RedisConnection redis;
    private ArrayList<ClientSession> sessions;
    private CookieManager cookieManager;

}
