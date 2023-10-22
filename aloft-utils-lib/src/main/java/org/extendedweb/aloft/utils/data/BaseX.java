package org.extendedweb.aloft.utils.data;

import java.util.Base64;

public class BaseX {

    public static String encode64(String input) {
        return Base64.getEncoder().encodeToString(input.getBytes());
    }

    public static String encode64(byte[] input) {
        return Base64.getEncoder().encodeToString(input);
    }

    public static String stringFrom64(String input) {
        return new String(Base64.getDecoder().decode(input.getBytes()));
    }

    public static String stringFrom64(byte[] input) {
        return new String(Base64.getDecoder().decode(input));
    }

    public static byte[] bytesFrom64(String input) {
        try {
            return Base64.getDecoder().decode(input.getBytes());
        } catch (Exception e) {
            return null;
        }
    }

    public static byte[] bytesFrom64(byte[] input) {
        return Base64.getDecoder().decode(input);
    }

}
