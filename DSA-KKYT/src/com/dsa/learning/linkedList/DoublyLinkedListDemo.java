package com.dsa.learning.linkedList;

import java.util.PriorityQueue;
import java.util.Queue;

import lombok.Builder;

public class DoublyLinkedListDemo {

    private int data;
    private DoublyLinkedListDemo prev;
    private DoublyLinkedListDemo next;

    public DoublyLinkedListDemo(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    private static void print(DoublyLinkedListDemo head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    private static DoublyLinkedListDemo insertAtFirst(int element, DoublyLinkedListDemo head) {
        DoublyLinkedListDemo node = new DoublyLinkedListDemo(element);
        if (head == null)
            return node;
        node.next = head;
        head.prev = node;
        return node;
    }

    private static DoublyLinkedListDemo insertAtTheEnd(int element, DoublyLinkedListDemo head) {
        DoublyLinkedListDemo node = new DoublyLinkedListDemo(element);
        if (head == null)
            return node;
        DoublyLinkedListDemo temp = head;
        while (head.next != null) {
            head = head.next;
        }
        head.next = node;
        node.prev = head;
        return temp;
    }

    // write a program  to reverse the doubly linked list.
    private static DoublyLinkedListDemo reverse(DoublyLinkedListDemo head) {
        if (head == null)
            return null;
        DoublyLinkedListDemo curr = head;
        DoublyLinkedListDemo prev = null;
        while (curr != null) {
            prev = curr.prev;
            curr.prev = curr.next;
            curr.next = prev;
            curr = curr.prev;
        }
        return prev.prev;
    }

    // Delete head node or first node of the doubly linked list
    public static DoublyLinkedListDemo deleteFirstNode(DoublyLinkedListDemo head) {
        if (head.next == null) {
            head = null;
            return head;
        }
        head = head.next;
        head.prev = null;
        return head;
    }

    // Delete last node of the doubly linked list
    public static DoublyLinkedListDemo deleteLastNode(DoublyLinkedListDemo head) {
        if (head.next == null) {
            head = null;
            return head;
        }
        DoublyLinkedListDemo node = head;
        while (head.next.next != null) {
            head = head.next;
        }
        head.next = null;
        return node;
    }

    private static DoublyLinkedListDemo deleteDuplicateOccurrences(DoublyLinkedListDemo head) {
        DoublyLinkedListDemo temp = head;
        while (temp != null && temp.next != null) {
            DoublyLinkedListDemo next = temp.next;
            while (next != null && temp.data == next.data) {
                next = next.next;
            }
            temp.next = next;
            if (next != null)
                next.prev = temp;
            temp = next;
        }
        return head;
    }


    public static void main(String[] args) {
        DoublyLinkedListDemo head = new DoublyLinkedListDemo(1);
        DoublyLinkedListDemo node1 = new DoublyLinkedListDemo(1);
        DoublyLinkedListDemo node2 = new DoublyLinkedListDemo(1);
        DoublyLinkedListDemo node3 = new DoublyLinkedListDemo(2);
        DoublyLinkedListDemo node4 = new DoublyLinkedListDemo(3);
        DoublyLinkedListDemo node5 = new DoublyLinkedListDemo(3);
        //DoublyLinkedListDemo node6 = new DoublyLinkedListDemo(4);

        head.next = node1;
        node1.prev = head;
        node1.next = node2;
        node2.prev = node1;
        node2.next = node3;
        node3.prev = node2;
        node3.next = node4;
        node4.prev = node3;
        node4.next = node5;
        node5.prev = node4;
        // node5.next = node6;
        // node6.prev = node5;

        print(head);
        System.out.println("______________________________________________");
        //DoublyLinkedListDemo doublyLinkedListDemo = insertAtFirst(24, head);
        //DoublyLinkedListDemo doublyLinkedListDemo = insertAtTheEnd(28, head);
        //DoublyLinkedListDemo reverse = reverse(head);
        // DoublyLinkedListDemo node = new DoublyLinkedListDemo(27);
        //DoublyLinkedListDemo doublyLinkedListDemo = deleteFirstNode(node);
        // DoublyLinkedListDemo doublyLinkedListDemo = deleteLastNode(head);
        // print(doublyLinkedListDemo);
        print(deleteDuplicateOccurrences(head));
    }
}
