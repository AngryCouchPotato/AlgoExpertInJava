package com.edu.algoexpert.linkedlist;

public class RemoveKthNodeFromEnd {

    public static void removeKthNodeFromEnd(LinkedList head, int k) {
        if (k == 0 || head == null) {
            return;
        }
        int idx = removeKth(head, head.next, k);
        if (k > idx) {
            head.value = head.next.value;
            head.next = head.next.next;
        }
    }

    public static int removeKth(LinkedList prev, LinkedList cur, int k) {
        if (cur == null) {
            return 0;
        }
        int num = 1 + removeKth(cur, cur.next, k);
        if (num == k) {
            prev.next = cur.next;
            cur.next = null;
        }
        return num;
    }

    static class LinkedList {

        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}
