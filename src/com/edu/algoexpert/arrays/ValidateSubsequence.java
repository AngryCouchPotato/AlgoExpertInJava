package com.edu.algoexpert.arrays;

import java.util.List;

public class ValidateSubsequence {

    // O(n) time | O(1) space
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int id = 0;
        for (Integer num : array) {
            if (id == sequence.size()) {
                return true;
            }
            if (num.equals(sequence.get(id))) {
                id++;
            }
        }
        return id == sequence.size();
    }
}
