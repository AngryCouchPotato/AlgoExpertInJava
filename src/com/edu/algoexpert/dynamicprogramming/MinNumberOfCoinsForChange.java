package com.edu.algoexpert.dynamicprogramming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinNumberOfCoinsForChange {

    // O(log(m*n^2)) time | O(n^2) space - n = target sum, m = array length
    public static int minNumberOfCoinsForChange(int n, int[] denoms) {
        if(denoms == null || denoms.length == 0) return 0;
        Integer[] result = minNumber(n, denoms, new HashMap<Integer, Integer[]>());
        if(result == null) {
            return -1;
        } else {
            return result.length;
        }
    }

    public static Integer[] minNumber(int target, int[] denoms, Map<Integer, Integer[]> memo) {
        if(memo.containsKey(target)) return memo.get(target);
        if(target == 0) return new Integer[0];
        if(target < 0) return null;

        Integer[] minCombination = null;
        for(int num : denoms) {
            Integer newTarget = target - num;
            Integer[] result = minNumber(newTarget, denoms, memo);
            if(result != null) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = num;
                if(minCombination == null || result.length < minCombination.length) {
                    minCombination = result;
                }
            }
        }
        memo.put(target, minCombination);
        return minCombination;
    }
}
