package com.dsa.learning.linkedList;

public class CircularLinkedList {
    private int data;
    private CircularLinkedList next;

    public CircularLinkedList(int data) {
        this.data = data;
        this.next = null;
    }

    public static void print(CircularLinkedList head) {
        if (head == null)
            return;
        CircularLinkedList node = head;
        do {
            System.out.println(head.data);
            head = head.next;
        } while (node != head);
    }

//    public static CircularLinkedList insertAtFirst(int element, CircularLinkedList head) {
//        if (head == null)
//            return null;
//        CircularLinkedList node = head;
//        CircularLinkedList firstNode = new CircularLinkedList(element);
//        firstNode.next = head;
//    }

    public static void main(String[] args) {
        CircularLinkedList head = new CircularLinkedList(1);
        CircularLinkedList node1 = new CircularLinkedList(2);
        CircularLinkedList node2 = new CircularLinkedList(3);
        head.next = node1;
        node1.next = node2;
        node2.next = head;
        print(head);
        System.out.println("_____________________________________________");
        //CircularLinkedList circularLinkedList = insertAtFirst(4, head);
        //print(circularLinkedList);
    }
}
