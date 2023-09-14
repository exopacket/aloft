package com.inteliense.aloft.utils.global;

import com.inteliense.aloft.utils.data.BaseX;
import com.inteliense.aloft.utils.data.Hex;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

public class __ {

    public static String hex(byte[] arr) {
        return Hex.getHex(arr);
    }

    public static String b64(byte[] arr) {
        return BaseX.encode64(arr);
    }

    public static byte[] bites(String str) {
        final Pattern textPattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$");
        boolean isBase64 = textPattern.matcher(str).matches();
        try {
            byte[] arr = null;
            if(isBase64) arr = BaseX.bytesFrom64(str);
            if(arr == null) arr = Hex.fromHex(str);
            if(arr == null) arr = str.getBytes(StandardCharsets.UTF_8);
            return arr;
        } catch (Exception e) {
            return null;
        }
    }

    public static Object nothing() {
        return null;
    }

    public static boolean same(String str1, String str2) {
        return str1.equals(str2);
    }

}
