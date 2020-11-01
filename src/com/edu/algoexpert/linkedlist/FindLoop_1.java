package com.edu.algoexpert.linkedlist;

public class FindLoop_1 {

    // O(n) time | O(1) space
    public static FindLoop_2.LinkedList findLoop(FindLoop_2.LinkedList head) {
        FindLoop_2.LinkedList slow = head;
        FindLoop_2.LinkedList fast = head;
        do {
            slow = slow.next;
            fast = fast.next.next;
        } while (slow != fast);

        slow = head;

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    static class LinkedList {

        int value;
        FindLoop_2.LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}
