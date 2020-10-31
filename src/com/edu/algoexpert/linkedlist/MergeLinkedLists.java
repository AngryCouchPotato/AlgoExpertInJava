package com.edu.algoexpert.linkedlist;

public class MergeLinkedLists {

    public static LinkedList mergeLinkedLists(LinkedList headOne, LinkedList headTwo) {
        return merge(headOne, headTwo);
    }

    public static LinkedList merge(LinkedList headOne, LinkedList headTwo) {
        if (headOne == null && headTwo == null) {
            return null;
        } else if (headOne == null) {
            return headTwo;
        } else if (headTwo == null) {
            return headOne;
        }
        if (headOne.value < headTwo.value) {
            headOne.next = merge(headOne.next, headTwo);
            return headOne;
        } else {
            headTwo.next = merge(headOne, headTwo.next);
            return headTwo;
        }
    }

    public static class LinkedList {

        int value;
        LinkedList next;

        LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }
}
