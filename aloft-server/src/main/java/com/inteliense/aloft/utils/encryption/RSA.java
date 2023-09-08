package com.inteliense.aloft.utils.encryption;

import javax.crypto.Cipher;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.security.spec.EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

public class RSA {

    public static PublicKey publicKeyFromStr(String pubKey) {

        try {

            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            EncodedKeySpec keySpec = new X509EncodedKeySpec(pubKey.getBytes(StandardCharsets.UTF_8));
            return keyFactory.generatePublic(keySpec);

        } catch (Exception ex) {


        }

        return null;

    }

    public static PrivateKey privateKeyFromStr(String pubKey) {

        try {

            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            EncodedKeySpec keySpec = new X509EncodedKeySpec(pubKey.getBytes(StandardCharsets.UTF_8));
            return keyFactory.generatePrivate(keySpec);

        } catch (Exception ex) {


        }

        return null;

    }

    public static KeyPair generateKeyPair() {

        try {

            KeyPairGenerator gen = KeyPairGenerator.getInstance("RSA");
            gen.initialize(4096);
            return gen.generateKeyPair();

        } catch (Exception ex) {
        }

        return null;

    }

    public static String encrypt(String input, PublicKey publicKey) {

        try {

            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.ENCRYPT_MODE, publicKey);

            byte[] bytes = input.getBytes(StandardCharsets.UTF_8);
            byte[] output = cipher.doFinal(bytes);

            return Base64.getEncoder().encodeToString(output);

        } catch (Exception ex) {


        }

        return "";

    }

    public static String decrypt(String input, PrivateKey privateKey) {

        try {

            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.ENCRYPT_MODE, privateKey);

            byte[] bytes = input.getBytes(StandardCharsets.UTF_8);
            byte[] output = cipher.doFinal(bytes);

            return Base64.getEncoder().encodeToString(output);

        } catch (Exception ex) {


        }

        return "";


    }

    public static String encrypt(String input, String publicKey) {

        return encrypt(input, publicKeyFromStr(publicKey));

    }

    public static String decrypt(String input, String privateKey) {

        return decrypt(input, privateKeyFromStr(privateKey));

    }

}
