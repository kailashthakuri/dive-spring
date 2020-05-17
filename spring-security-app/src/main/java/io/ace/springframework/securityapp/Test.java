package io.ace.springframework.securityapp;

import org.springframework.security.crypto.encrypt.BytesEncryptor;
import org.springframework.security.crypto.encrypt.Encryptors;

public class Test {
    public static void main(String[] args) {

        BytesEncryptor stronger = Encryptors.stronger("password", "salt");
        byte[] encrypt = stronger.encrypt(new byte[]{1, 3, 4});
        System.out.println(encrypt);
    }
}
