package io.ace.springframework.securityapp.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPassGenerator {
    public static void main(String[] args) {
        String password = "123";
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println("{bcrypt}" + passwordEncoder.encode(password));
    }
}
