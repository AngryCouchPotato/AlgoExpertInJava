package com.edu.algoexpert.arrays;

import java.util.List;

public class MoveElementToEnd {

    // O(n) time | O(1) space
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        int left = 0;
        int right = array.size() - 1;
        while (left < right) {
            if (array.get(right) == toMove) {
                right--;
            } else if (array.get(left) == toMove) {
                swap(array, left, right);
                left++;
            } else {
                left++;
            }
        }
        return array;
    }

    private static void swap(List<Integer> array, int left, int right) {
        int temp = array.get(left);
        array.set(left, array.get(right));
        array.set(right, temp);
    }
}
