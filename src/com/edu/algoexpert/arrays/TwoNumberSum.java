package com.edu.algoexpert.arrays;

import java.util.Arrays;

public class TwoNumberSum {
    // O(n*log(n)) time | O(1) space
    public static int[] twoNumberSum(int[] array, int targetSum) {
        if(array == null || array.length < 2) {
            return new int[0];
        }
        Arrays.sort(array);
        int l = 0;
        int r = array.length - 1;
        while(l < r) {
            int res = targetSum - array[l];
            if(res == array[r]) {
                return new int[]{array[l], array[r]};
            }	else if (res > array[r]) {
                l++;
            }	else if (res < array[r]) {
                r--;
            }
        }
        return new int[0];
    }
}
