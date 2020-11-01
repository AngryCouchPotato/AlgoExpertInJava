package com.edu.algoexpert.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class FindLoop_2 {

    // O(n) time | O(n) space
    public static LinkedList findLoop(LinkedList head) {
        Set<LinkedList> set = new HashSet<>();
        LinkedList node = head;
        while (!set.contains(node)) {
            set.add(node);
            node = node.next;
        }
        return node;
    }

    static class LinkedList {

        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}
