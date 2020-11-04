package com.edu.algoexpert.linkedlist;

public class LinkedListConstruction {

    static class DoublyLinkedList {

        public Node head;
        public Node tail;

        public void setHead(Node node) {
            if (head == null) {
                head = node;
                tail = node;
            } else {
                insertBefore(head, node);
            }
        }

        public void setTail(Node node) {
            if (tail == null) {
                setHead(node);
            } else {
                insertAfter(tail, node);
            }
        }

        public void insertBefore(Node node, Node nodeToInsert) {
            if (head == nodeToInsert && tail == nodeToInsert) {
                return;
            }
            remove(nodeToInsert);
            nodeToInsert.prev = node.prev;
            nodeToInsert.next = node;
            if (node.prev == null) {
                head = nodeToInsert;
            } else {
                node.prev.next = nodeToInsert;
            }
            node.prev = nodeToInsert;
        }

        public void insertAfter(Node node, Node nodeToInsert) {
            if (head == nodeToInsert && tail == nodeToInsert) {
                return;
            }
            remove(nodeToInsert);
            nodeToInsert.prev = node;
            nodeToInsert.next = node.next;
            if (node.next == null) {
                tail = nodeToInsert;
            } else {
                node.next.prev = nodeToInsert;
            }
            node.next = nodeToInsert;
        }

        public void insertAtPosition(int position, Node nodeToInsert) {
            if (position == 1) {
                setHead(nodeToInsert);
                return;
            }
            Node node = head.next;
            int current = 2;
            while (node != null && current != position) {
                node = node.next;
                current++;
            }
            if (node != null) {
                insertBefore(node, nodeToInsert);
            } else {
                setTail(nodeToInsert);
            }
        }

        public void removeNodesWithValue(int value) {
            Node node = head;
            while (node != null) {
                Node nodeToRemove = node;
                node = node.next;
                if (nodeToRemove.value == value) {
                    remove(nodeToRemove);
                }
            }
        }

        public void remove(Node node) {
            if (node == null) {
                return;
            }
            if (head == node) {
                head = node.next;
            }
            if (tail == node) {
                tail = node.prev;
            }
            if (node.prev != null) {
                node.prev.next = node.next;
            }
            if (node.next != null) {
                node.next.prev = node.prev;
            }
            node.next = null;
            node.prev = null;
        }

        public boolean containsNodeWithValue(int value) {
            Node node = head;
            while (node != null) {
                if (node.value == value) {
                    return true;
                }
                node = node.next;
            }
            return false;
        }
    }

    // Do not edit the class below.
    static class Node {

        public int value;
        public Node prev;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
