package com.VinhHua;

public class SimplerDoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public SimplerDoublyLinkedList(int data) {
    }


    class Node {
        private int data;
        private Node prev;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
}
