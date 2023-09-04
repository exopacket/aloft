package com.inteliense.aloft.utils.encryption;

import javax.crypto.spec.IvParameterSpec;
import java.security.SecureRandom;

public class Rand {

    public static byte[] secure(int len) {

        byte[] bytes = new byte[len];
        new SecureRandom().nextBytes(bytes);
        return bytes;

    }

    public static String str(int len) {

        int leftLimit = 48;
        int rightLimit = 122;
        int targetStringLength = len;

        java.util.Random random = new java.util.Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return generatedString;

    }

    public static byte[] generateKey(int bits) {

        byte[] key = new byte[bits / 8];
        new SecureRandom().nextBytes(key);
        return key;

    }

    public static byte[] generateIv(int bits) {

        byte[] iv = new byte[bits / 8];
        new SecureRandom().nextBytes(iv);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);
        return ivParameterSpec.getIV();

    }

}
