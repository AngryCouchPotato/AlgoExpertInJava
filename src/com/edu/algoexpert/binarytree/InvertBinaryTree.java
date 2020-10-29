package com.edu.algoexpert.binarytree;

public class InvertBinaryTree {

    public static void invertBinaryTree(BinaryTree tree) {
        if (tree == null) {
            return;
        }
        if (tree.left != null && tree.right != null) {
            BinaryTree temp = tree.right;
            tree.right = tree.left;
            tree.left = temp;
            invertBinaryTree(tree.left);
            invertBinaryTree(tree.right);
        } else if (tree.left != null) {
            tree.right = tree.left;
            tree.left = null;
            invertBinaryTree(tree.right);
        } else if (tree.right != null) {
            tree.left = tree.right;
            tree.right = null;
            invertBinaryTree(tree.left);
        }
    }

    static class BinaryTree {

        public int value;
        public BinaryTree left;
        public BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
        }
    }
}
