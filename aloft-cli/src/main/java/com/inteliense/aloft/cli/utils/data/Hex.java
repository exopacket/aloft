package com.inteliense.aloft.cli.utils.data;

import java.nio.charset.StandardCharsets;

public class Hex {

    public static String getHex(byte[] data) {

        final byte[] HEX_ARRAY = "0123456789abcdef".getBytes(StandardCharsets.US_ASCII);

        byte[] hexChars = new byte[data.length * 2];
        for(int j=0; j<data.length; j++) {

            int v = data[j] & 0xFF;
            hexChars[j*2] = HEX_ARRAY[v >>> 4];
            hexChars[j*2+1] = HEX_ARRAY[v & 0x0F];

        }

        return new String(hexChars, StandardCharsets.UTF_8);

    }

    public static byte[] fromHex(String hex) {

        try {

            byte[] val = new byte[hex.length() / 2];

            for (int i = 0; i < val.length; i++) {

                int index = i * 2;
                int j = Integer.parseInt(hex.substring(index, index + 2), 16);
                val[i] = (byte) j;

            }

            return val;

        } catch (Exception e) {

            return null;

        }

    }

}
