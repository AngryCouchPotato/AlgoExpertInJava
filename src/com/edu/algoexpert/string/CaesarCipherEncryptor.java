package com.edu.algoexpert.string;

public class CaesarCipherEncryptor {

    public static String caesarCypherEncryptor(String str, int key) {
        if (str == null || str.length() == 0 || key <= 0) {
            return str;
        }
        int step = (key % ((int) ('z' - 'a' + 1)));
        char[] res = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int moved = ch + step;
            if (moved > 'z') {
                moved = 'a' - 1 + (moved - 'z');
            }
            res[i] = (char) moved;
        }
        return new String(res);
    }
}
