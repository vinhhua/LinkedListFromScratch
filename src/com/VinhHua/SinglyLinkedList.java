package com.VinhHua;

public class SinglyLinkedList {
    private Node head;
    private int size;


    public SinglyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    /**
     * Really simple, first create a new node, then point the new node's reference (newNode.next) = head;
     * Then set the new node as head.
     * @param data integer that you want to add.
     */
    public void insert(int data) {
        if (isEmpty()) {
            this.head = new Node(data);
            size++;
        } else {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            size++;
        }
    }

    /**
     * Add a new node at the end of the linked list
     * @param data the data that you want to add.
     */

    public void addAtEnd(int data) {
        if (isEmpty()) {
            insert(data);
        } else {
            Node newNode = new Node(data);
            Node current = head;
            // while the reference of current isn't null then keep going until the end of list
            while (current.next != null) {
                current = current.next;
            }
            // here at the end of list, set the reference of the current, which at the end of list to the newNode.
            current.next = newNode;
            size++;
        }
    }

    /**
     * Delete the node at the beginning of list.
     * @return the node that got deleted.
     */

    public Node delete() {
        if (isEmpty()) return null;
        Node temp = head;
        // just these 2 lines are enough
        head = head.next;
        size--;
        temp.next = null;   // memory management
        return temp;
    }

    public Node deleteDuplicate() {
        return deleteDupHelper(head);
    }

    private Node deleteDupHelper(Node head) {
        Node current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    public void addSortedOrder(int data) {
        if (head == null || head.data >= data) {
            insert(data);
            return;
        }

        Node current = head.next;
        Node previous = head;
        while (current != null && current.data < data) {
            previous = current;
            current = current.next;
        }

        Node newNode = new Node(data);
        newNode.next = current;
        previous.next = newNode;
        size++;
    }

    /**
     * Reverse the singly linked list by changing pointers' references
     * save the reference of current to next
     * set the reference to prev, so prev <-- current
     * move next to current
     * move to prev to current
     */

    public void reverseList() {
        Node next, prev = null;
        Node current = head;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
        printList();
    }

    public boolean isEmpty() {
        return head == null;
    }


    public int peek() {
        return head.data;
    }

    public int getSize() {
        return this.size;
    }

    public void clear() {
        head = null;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }


    class Node {
        private Node next;
        private int data;

        public Node(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Node: " +data;
        }
    }

    public Node mergeTwoList(Node l1, Node l2) {
        Node newList = new Node(0);
        Node prev = newList;

        while (l1 != null && l2 != null) {
            if (l1.data <= l2.data) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }

        if (l1 == null) prev.next = l2;
        if (l2 == null) prev.next = l1;

        return newList.next;
    }

}


