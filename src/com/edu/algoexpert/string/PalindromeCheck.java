package com.edu.algoexpert.string;

public class PalindromeCheck {

    public static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return false;
        } else if (str.length() == 1) {
            return true;
        }
        int l = 0;
        int r = str.length() - 1;
        while (l <= r) {
            if (str.charAt(l) != str.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }

        return true;
    }
}
