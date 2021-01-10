package com.edu.algoexpert.dynamicprogramming;

public class MaxSubsetSumNoAdjacent {

    // O(n) time : O(1) space
    public static int maxSubsetSumNoAdjacent_1(int[] array) {
        if(array == null || array.length == 0) {
            return 0;
        } else if (array.length == 1) {
            return array[0];
        }

        int second = array[0];
        int first = Math.max(array[0], array[1]);
        int current;
        for(int i = 2; i < array.length; i++) {
            current = Math.max(first, second + array[i]);
            second = first;
            first = current;
        }
        return first;
    }

    // O(n) time : O(n) space
    public static int maxSubsetSumNoAdjacent_2(int[] array) {
        if(array == null || array.length == 0) {
            return 0;
        } else if (array.length == 1) {
            return array[0];
        }

        int[] sums = new int[array.length];
        sums[0] = array[0];
        sums[1] = Math.max(array[0], array[1]);
        for(int i = 2; i < array.length; i++) {
            sums[i] = Math.max(sums[i - 1], sums[i - 2] + array[i]);
        }
        return sums[array.length - 1];
    }

}
