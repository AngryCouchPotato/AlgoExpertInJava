package com.edu.algoexpert.dynamicprogramming;

public class NumberOfWaysToMakeChange {

    // O(n*d) time | O(n) space
    public static int numberOfWaysToMakeChange(int n, int[] denoms) {
        int[] changes = new int[n + 1];
        changes[0] = 1;
        for(int denom : denoms) {
            for(int i = denom; i <= n; i++) {
                changes[i] = changes[i] + changes[i - denom];
            }
        }
        return changes[n];
    }
}
