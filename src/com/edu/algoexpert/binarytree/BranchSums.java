package com.edu.algoexpert.binarytree;

import java.util.ArrayList;
import java.util.List;

public class BranchSums {

    public static List<Integer> branchSums(BinaryTree root) {
        List<Integer> result = new ArrayList<Integer>();
        traverse(root, result, 0);
        return result;
    }

    public static void traverse(BinaryTree tree, List<Integer> array, int sum) {
        if (tree != null) {
            if (tree.left == null && tree.right == null) {
                array.add(sum + tree.value);
            } else {
                traverse(tree.left, array, sum + tree.value);
                traverse(tree.right, array, sum + tree.value);
            }
        }
    }

    public static class BinaryTree {

        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
}
