package com.edu.algoexpert.searching;

public class BinarySearch {

    // O(log(n)) time | O(1) space
    public static int binarySearch(int[] array, int target) {
        if(array == null || array.length == 0) {
            return -1;
        }
        int l = 0;
        int r = array.length - 1;
        while(l <= r) {
            int mid = l + (r - l) / 2;
            if(array[mid] == target) {
                return mid;
            } else if (array[mid] > target) {
                r = mid - 1;
            } else if (array[mid] < target) {
                l = mid + 1;
            }
        }
        return -1;
    }
}
