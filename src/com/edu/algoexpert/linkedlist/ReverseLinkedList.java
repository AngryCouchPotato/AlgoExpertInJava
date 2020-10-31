package com.edu.algoexpert.linkedlist;

public class ReverseLinkedList {

    public static LinkedList reverseLinkedList(LinkedList head) {
        LinkedList newHead = reverse(head, head.next);
        head.next = null;
        return newHead;
    }

    public static LinkedList reverse(LinkedList prev, LinkedList cur) {
        if (cur == null) {
            return prev;
        }
        LinkedList newHead = reverse(cur, cur.next);
        cur.next = prev;
        return newHead;
    }

    static class LinkedList {

        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}
