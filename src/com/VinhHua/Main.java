package com.VinhHua;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addSortedOrder(1);
        list.addSortedOrder(4);
        list.addSortedOrder(3);
        list.addSortedOrder(9);
        list.addSortedOrder(12);
        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.addSortedOrder(2);
        list2.addSortedOrder(5);
        list2.addSortedOrder(6);
        list2.addSortedOrder(7);
        list2.addSortedOrder(10);
        list2.addSortedOrder(12);
        System.out.print("List 1: ");
        list.printList();
        System.out.print("List 2: ");
        list2.printList();
        list.deleteDuplicate();
//        System.out.println("Removed " +list.delete());
//        list.printList();
        list.addAtEnd(16);
//        System.out.println(list.getSize());
        list.mergeTwoList(list.getHead(), list2.getHead());
        list.printList();
        System.out.println("Reversing the list");
        list.reverseList();

    }


}
