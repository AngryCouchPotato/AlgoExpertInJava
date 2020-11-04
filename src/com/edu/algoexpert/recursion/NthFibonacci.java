package com.edu.algoexpert.recursion;

public class NthFibonacci {
    // O(n) time | O(1) space
    public static int getNthFib(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        int prev = 0;
        int cur = 1;
        for (int curId = 3; curId <= n; curId++) {
            int tempCur = cur;
            cur = prev + cur;
            prev = tempCur;
        }
        return cur;
    }
}
