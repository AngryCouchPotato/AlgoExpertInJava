package com.edu.algoexpert.bst;

public class ValidateBST {
    public static boolean validateBst(BST tree) {
        return validateBst(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static boolean validateBst(BST tree, int min, int max) {
        if(tree == null) {
            return true;
        }
        if (min > tree.value || max <= tree.value) {
            return false;
        }
        return validateBst(tree.left, min, tree.value) && validateBst(tree.right, tree.value, max) ;
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
