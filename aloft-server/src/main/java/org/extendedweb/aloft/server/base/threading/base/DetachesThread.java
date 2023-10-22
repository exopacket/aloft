package org.extendedweb.aloft.server.base.threading.base;

public abstract class DetachesThread extends ThreadImpl {
    @Override
    public boolean doesJoin() { return false; }
}
