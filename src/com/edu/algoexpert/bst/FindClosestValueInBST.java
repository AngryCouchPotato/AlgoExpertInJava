package com.edu.algoexpert.bst;

public class FindClosestValueInBST {

    public static int findClosestValueInBst(BST tree, int target) {
        return findClosestValueInBst(tree, target, Double.POSITIVE_INFINITY);
    }

    public static int findClosestValueInBst(BST tree, int target, double closest) {
        if (tree == null) {
            return (int) closest;
        }

        if (Math.abs(target - tree.value) < Math.abs(target - closest)) {
            closest = tree.value;
        }

        if (target > tree.value) {
            return findClosestValueInBst(tree.right, target, closest);
        } else if (target < tree.value) {
            return findClosestValueInBst(tree.left, target, closest);
        } else {
            return (int) closest;
        }
    }

    static class BST {

        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
