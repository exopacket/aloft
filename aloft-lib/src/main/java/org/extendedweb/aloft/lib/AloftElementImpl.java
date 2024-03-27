package org.extendedweb.aloft.lib;

public interface AloftElementImpl {
    AloftElementActions[] elementActions();
    AloftElementListeners[] elementListeners();
    String valueUid();
}
