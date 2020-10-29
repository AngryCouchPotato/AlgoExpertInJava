package com.edu.algoexpert.binarytree;

public class NodeDepths {

    public static int nodeDepths(BinaryTree root) {
        return nodeDepths(root, 0);
    }

    public static int nodeDepths(BinaryTree node, int depth) {
        if (node == null) {
            return depth;
        }
        int res = depth;
        if (node.left != null) {
            res += nodeDepths(node.left, depth + 1);
        }
        if (node.right != null) {
            res += nodeDepths(node.right, depth + 1);
        }
        return res;
    }

    static class BinaryTree {

        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
}
