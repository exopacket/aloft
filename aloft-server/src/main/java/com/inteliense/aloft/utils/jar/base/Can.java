package com.inteliense.aloft.utils.jar.base;

public class Can {

    private boolean valid = false;
    private boolean unlocked = false;
    private int userId = -1;
    private byte[] binary;
    private String mainClass = "";

    public Can(byte[] gcmKey, byte[] encIv,
               byte[] encPassword, byte[] encUser,
               byte[] encData, byte[] encEntrypoint, byte[] encSig512) {



    }

    public boolean isValid() {
        return valid;
    }

    public boolean isUnlocked() {
        return unlocked;
    }

    private int getUserId() {
        return 0;
    }

    private void verifyPassword() {



    }

}
