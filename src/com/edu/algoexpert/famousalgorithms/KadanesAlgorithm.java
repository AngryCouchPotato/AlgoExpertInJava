package com.edu.algoexpert.famousalgorithms;

public class KadanesAlgorithm {

    public static int kadanesAlgorithm(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int maxIterated = 0;
        for (int num : array) {
            maxIterated = Math.max(maxIterated + num, num);
            if (maxIterated > max) {
                max = maxIterated;
            }
        }
        return max;
    }
}
