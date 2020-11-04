package com.edu.algoexpert.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {

    // O(n^2) time | O(n) space
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        if(array == null || array.length < 3) {
            return new ArrayList<>();
        }
        List<Integer[]> result = new ArrayList<>();
        Arrays.sort(array);
        for(int i = 0; i < array.length; i++) {
            int left = i + 1;
            int right = array.length - 1;
            while(left < right) {
                int diff = targetSum - array[i] - array[left] - array[right];
                if(diff == 0) {
                    result.add(new Integer[]{array[i], array[left], array[right]});
                    left++;
                    right--;
                } else if (diff > 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
}
