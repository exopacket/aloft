package com.inteliense.aloft.utils.encryption;

import javax.crypto.spec.IvParameterSpec;
import java.security.SecureRandom;
import java.util.Random;

public class Rand {

    public static byte[] secure(int len) {

        byte[] bytes = new byte[len];
        new SecureRandom().nextBytes(bytes);
        return bytes;

    }

    public static String letter(String seed) {
        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int s = ((int) seed.charAt(0)) + ((int) seed.charAt(seed.length() - 1));
        Random r = new Random(s);
        int i = r.nextInt(52);
        return String.valueOf(letters.charAt(i));
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

    public static String caseify(String input) {
        final int start = 48;
        final int start_disregard = 57;
        final int stop_disregard = 64;
        final int end = 90;
        input = input.toUpperCase();
        StringBuilder ret = new StringBuilder();
        for(int i=0; i<input.length(); i++) {
            final char c = input.charAt(i);
            final int v = ((byte) c);
            final int mod = v % 2;
            final boolean odd = mod == 1;
            final boolean alpha = !Character.isDigit(c);
            int final_val;
            if(alpha && odd) {
                final int k = v - stop_disregard;
                final_val = (k > 7) ? (v - 7) : (start_disregard - (7 - k));
            } else if(alpha) {
                final int k = end - v;
                final_val = (k > 7) ? (v + 7) : ((7 - k) + start);
            } else if(odd) {
                final int k = stop_disregard - v;
                final_val = (k < 7) ? (v + 7) : (end - k);
            } else {
                final int k = v - start;
                final_val = (k > 7) ? (v - 7) : (start + (7 - k));
            }
            char final_c = (char) final_val;
            if(alpha) ret.append(("" + final_c).toUpperCase());
            else ret.append(("" + final_c).toLowerCase());
        }
        return ret.toString();
    }

    public static String randomCase(String input) {
        input = input.toLowerCase();
        StringBuilder ret = new StringBuilder();
        for(int i=0; i<input.length(); i++) {
            byte res = secure(1)[0];
            int bool = res % 2;
            boolean capitalize = bool == 1;
            String c = input.substring(i, i + 1);
            if(capitalize) c = c.toUpperCase();
            ret.append(c);
        }
        return ret.toString();
    }

}
