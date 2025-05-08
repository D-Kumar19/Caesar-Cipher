package org.example;

import CaesarCipher.CaesarCipher;

public class Main {
    public static void main(String[] args) {
        CaesarCipher caesarCipher = new CaesarCipher();
        String ciphered = caesarCipher.cipher("How are you doing today", 12);
        System.out.println(ciphered);
    }
}