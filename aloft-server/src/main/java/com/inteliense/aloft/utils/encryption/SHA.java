package com.inteliense.aloft.utils.encryption;

import com.inteliense.datautils.Hex;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA {

    public static String getSha1(String input)
    {
        try {

            MessageDigest md = MessageDigest.getInstance("SHA-1");

            byte[] messageDigest = md.digest(input.getBytes());

            BigInteger num = new BigInteger(1, messageDigest);
            String hashtext = num.toString(16);

            while (hashtext.length() < 40) {
                hashtext = "0" + hashtext;
            }

            return hashtext;
        }

        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return "";

    }

    public static String get512(String input)
    {
        try {

            MessageDigest md = MessageDigest.getInstance("SHA-512");

            byte[] messageDigest = md.digest(input.getBytes());

            BigInteger num = new BigInteger(1, messageDigest);
            String hashtext = num.toString(16);

            while (hashtext.length() < 128) {
                hashtext = "0" + hashtext;
            }

            return hashtext;
        }

        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return "";

    }

    public static String get384(String input)
    {
        try {

            MessageDigest md = MessageDigest.getInstance("SHA-384");

            byte[] messageDigest = md.digest(input.getBytes());

            BigInteger num = new BigInteger(1, messageDigest);
            String hashtext = num.toString(16);

            while (hashtext.length() < 96) {
                hashtext = "0" + hashtext;
            }

            return hashtext;
        }

        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return "";

    }

    public static String get384(byte[] input)
    {
        try {

            MessageDigest md = MessageDigest.getInstance("SHA-384");

            byte[] messageDigest = md.digest(input);

            BigInteger num = new BigInteger(1, messageDigest);
            String hashtext = num.toString(16);

            while (hashtext.length() < 96) {
                hashtext = "0" + hashtext;
            }

            return hashtext;
        }

        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return "";

    }

    public static String get256(String input)
    {
        try {

            MessageDigest md = MessageDigest.getInstance("SHA-256");

            byte[] messageDigest = md.digest(input.getBytes());

            BigInteger num = new BigInteger(1, messageDigest);
            String hashtext = num.toString(16);

            while (hashtext.length() < 64) {
                hashtext = "0" + hashtext;
            }

            return hashtext;
        }

        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return "";

    }

    public static String getHmac512(String input, String key) {

        try {

            Mac sha256_HMAC = Mac.getInstance("HmacSHA512");
            SecretKeySpec secret_key = new SecretKeySpec(key.getBytes("UTF-8"), "HmacSHA512");
            sha256_HMAC.init(secret_key);

            return Hex.getHex(sha256_HMAC.doFinal(input.getBytes("UTF-8")));

        } catch (Exception ex) {

            return null;

        }

    }

    public static String getHmac384(String input, byte[] key) {

        try {

            Mac sha384_HMAC = Mac.getInstance("HmacSHA384");
            SecretKeySpec secret_key = new SecretKeySpec(key, "HmacSHA384");
            sha384_HMAC.init(secret_key);

            return Hex.getHex(sha384_HMAC.doFinal(input.getBytes("UTF-8")));

        } catch (Exception ex) {

            return null;

        }

    }

    public static String getHmac384(String input, String key) {

        try {

            Mac sha384_HMAC = Mac.getInstance("HmacSHA384");
            SecretKeySpec secret_key = new SecretKeySpec(Hex.fromHex(key), "HmacSHA384");
            sha384_HMAC.init(secret_key);

            return Hex.getHex(sha384_HMAC.doFinal(input.getBytes("UTF-8")));

        } catch (Exception ex) {

            return null;

        }

    }
    public static String getHmac256(String input, String key) {

        try {

            Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
            SecretKeySpec secret_key = new SecretKeySpec(key.getBytes("UTF-8"), "HmacSHA256");
            sha256_HMAC.init(secret_key);

            return Hex.getHex(sha256_HMAC.doFinal(input.getBytes("UTF-8")));

        } catch (Exception ex) {

            return null;

        }

    }

}