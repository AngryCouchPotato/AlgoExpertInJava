package com.edu.algoexpert.linkedlist;

public class ShiftLinkedList {

    public static LinkedList shiftLinkedList(LinkedList head, int k) {
        if(k == 0) {
            return head;
        }
        int length = length(head);
        int shift = Math.abs(k) % length;
        if(shift == 0) {
            return head;
        }
        Tailed tailed = tail(head, (k > 0 ? shift : length - shift));
        tailed.tail.next = head;
        return tailed.head;
    }

    private static int length(LinkedList node) {
        int length = 0;
        while(node != null) {
            node = node.next;
            length++;
        }
        return length;
    }

    private static Tailed tail(LinkedList node, int k) {
        if(node == null) {
            return null;
        }
        Tailed tailed = tail(node.next, k);
        if(tailed != null) {
            if(tailed.value == k) {
                tailed.head = node.next;
                tailed.value = tailed.value + 1;
                node.next = null;
                return tailed;
            } else if (tailed.value > k) {
                return tailed;
            } else {
                tailed.value = tailed.value + 1;
            }
        } else {
            tailed = new Tailed();
            tailed.value = 1;
            tailed.tail = node;
        }
        return tailed;
    }

    static class Tailed {
        public int value;
        public LinkedList head;
        public LinkedList tail;
    }

    static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            next = null;
        }
    }
}
