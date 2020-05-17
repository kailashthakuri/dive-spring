package io.ace.springframework.securityapp.cryptomodule;

import org.springframework.security.crypto.encrypt.BytesEncryptor;
import org.springframework.security.crypto.encrypt.Encryptors;
import org.springframework.security.crypto.keygen.KeyGenerators;
import org.springframework.security.crypto.keygen.StringKeyGenerator;
import org.springframework.util.Base64Utils;

public class EncryptorTest {

    public static void main(String[] args) {
//        BytesEncryptor stronger = Encryptors.stronger("password", "salt");
//        byte[] encrypt = stronger.encrypt(new byte[]{1, 0, 1});
//        System.out.println(encrypt);

        StringKeyGenerator string = KeyGenerators.string();
        System.out.println(string.generateKey());
    }
}
