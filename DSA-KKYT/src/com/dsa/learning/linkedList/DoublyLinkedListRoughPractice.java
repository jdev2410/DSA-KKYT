package com.dsa.learning.linkedList;

public class DoublyLinkedListRoughPractice {
    private int data;
    private DoublyLinkedListRoughPractice next;
    private DoublyLinkedListRoughPractice prev;

    public DoublyLinkedListRoughPractice(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    private static void print(DoublyLinkedListRoughPractice head) {
        if (head == null)
            return;
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    private static DoublyLinkedListRoughPractice reverse(DoublyLinkedListRoughPractice head) {
        if (head == null || head.next == null)
            return head;
        DoublyLinkedListRoughPractice node = head;
        DoublyLinkedListRoughPractice previous = null;
        while (node != null) {
            previous = node.prev;
            node.prev = node.next;
            node.next = previous;
            node = node.prev;
        }
        return previous.prev;
    }

    public static void main(String[] args) {
        DoublyLinkedListRoughPractice head = new DoublyLinkedListRoughPractice(1);
        DoublyLinkedListRoughPractice node1 = new DoublyLinkedListRoughPractice(2);
        DoublyLinkedListRoughPractice node2 = new DoublyLinkedListRoughPractice(3);
        DoublyLinkedListRoughPractice node3 = new DoublyLinkedListRoughPractice(4);
        head.next = node1;
        node1.prev = head;
        node1.next = node2;
        node2.prev = node1;
        node2.next = node3;
        node3.prev = node2;
        print(head);
        System.out.println("________________________");
        print(reverse(head));
    }

}
