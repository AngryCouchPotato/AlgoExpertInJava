package com.edu.algoexpert.graphs;

public class SingleCycleCheck {

    public static boolean hasSingleCycle(int[] array) {
        if (array == null || array.length == 1) {
            return false;
        }
        int curId = 0;
        int counter = 0;
        while (counter < array.length) {
            if (counter > 0 && curId == 0) {
                return false;
            }
            curId = (curId + array[curId]) % array.length;
            curId = curId >= 0 ? curId : array.length + curId;
            counter++;
        }
        return curId == 0;
    }
}
