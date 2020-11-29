package com.edu.algoexpert.arrays;

public class ArrayOfProducts {
    // O(n) time | O(n) space
    public int[] arrayOfProducts(int[] array) {
        if (array == null | array.length < 2) {
            return array;
        }
        int length = array.length;
        int[] left = new int[length];
        int[] right = new int[length];
        left[0] = 1;
        right[length - 1] = 1;
        for (int i = 1; i < length; i++) {
            left[i] = left[i - 1] * array[i - 1];
        }
        for (int i = length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * array[i + 1];
        }
        for (int i = 0; i < length; i++) {
            array[i] = left[i] * right[i];
        }
        return array;
    }
}
