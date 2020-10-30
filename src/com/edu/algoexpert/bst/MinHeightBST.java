package com.edu.algoexpert.bst;

import java.util.List;

public class MinHeightBST {

    public static BST minHeightBst(List<Integer> array) {
        return minHeightBst(array, null, 0, array.size() - 1);
    }

    public static BST minHeightBst(List<Integer> array, BST node, int left, int right) {
        if (left > right) {
            return node;
        }
        int midId = left + (right - left) / 2;
        Integer value = array.get(midId);
        if (node == null) {
            node = new BST(value);
        } else {
            node.insert(value);
        }
        minHeightBst(array, node, left, midId - 1);
        minHeightBst(array, node, midId + 1, right);
        return node;
    }


    static class BST {

        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
            left = null;
            right = null;
        }

        public void insert(int value) {
            if (value < this.value) {
                if (left == null) {
                    left = new BST(value);
                } else {
                    left.insert(value);
                }
            } else {
                if (right == null) {
                    right = new BST(value);
                } else {
                    right.insert(value);
                }
            }
        }
    }
}
