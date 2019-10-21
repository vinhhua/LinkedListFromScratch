package com.VinhHua;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addSortedOrder(1);
        list.addSortedOrder(2);
        list.addSortedOrder(3);
        list.addSortedOrder(4);
        list.addSortedOrder(6);
        list.addSortedOrder(5);
        list.addSortedOrder(0);
        list.addSortedOrder(6);
        list.deleteDuplicate();
        list.printList();
        System.out.println("Removed " +list.delete());
        list.printList();
        list.addAtEnd(16);
        System.out.println(list.getSize());
        list.printList();
        System.out.println("Reversing the list");
        list.reverseList();

    }


}
