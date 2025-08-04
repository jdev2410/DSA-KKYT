package com.dsa.learning.linkedList;

import java.util.Stack;

public class SortInsertSinglyLinkedList {

    private int data;
    private SortInsertSinglyLinkedList next;

    public SortInsertSinglyLinkedList(int data) {
        this.data = data;
        this.next = null;
    }

    private static void print(SortInsertSinglyLinkedList head) {
        if (head == null)
            return;
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    private static SortInsertSinglyLinkedList sortInsert(int data, SortInsertSinglyLinkedList head) {
        SortInsertSinglyLinkedList node = new SortInsertSinglyLinkedList(data);
        if (head == null)
            return node;
        SortInsertSinglyLinkedList temp = head;
        if (data < head.data) {
            node.next = head;
            return node;
        }
        while (head != null) {
            if (head.data < data && (head.next != null && data < head.next.data)) {
                node.next = head.next;
                head.next = node;
            } else {
                if (head.next == null && data > head.data) {
                    head.next = node;
                }
                head = head.next;
            }
        }
        return temp;
    }

    // General Approach
    private static void findMiddleOfLinkedList(SortInsertSinglyLinkedList head) {
        if (head == null)
            return;
        SortInsertSinglyLinkedList node;
        int nodeCount = 0;
        for (node = head; node != null; node = node.next) {
            nodeCount++;
        }
        for (int i = 0; i < (nodeCount / 2); i++) {
            head = head.next;
        }
        System.out.println(head.data);
    }

    // Slow Fast approach
    private static void findMiddleOfLinkedListSlowFast(SortInsertSinglyLinkedList head) {
        if (head == null)
            return;
        SortInsertSinglyLinkedList slow = head;
        SortInsertSinglyLinkedList fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }

    private static void findNthNodeFromEnd(int index, SortInsertSinglyLinkedList head) {
        if (head == null)
            return;
        SortInsertSinglyLinkedList first = head;
        for (int i = 0; i < index; i++) {
            first = first.next;
        }
        SortInsertSinglyLinkedList second = head;
        while (first != null) {
            second = second.next;
            first = first.next;
        }
        System.out.println(second.data);
    }

    private static SortInsertSinglyLinkedList reverse(SortInsertSinglyLinkedList head) {
        if (head == null)
            return null;
        SortInsertSinglyLinkedList curr = head;
        SortInsertSinglyLinkedList prev = null;
        while (curr != null) {
            SortInsertSinglyLinkedList next=  curr.next;
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        SortInsertSinglyLinkedList head = new SortInsertSinglyLinkedList(2);
        SortInsertSinglyLinkedList node1 = new SortInsertSinglyLinkedList(3);
        SortInsertSinglyLinkedList node2 = new SortInsertSinglyLinkedList(10);
        SortInsertSinglyLinkedList node3 = new SortInsertSinglyLinkedList(100);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        print(head);
        System.out.println("____________________________________");
        // SortInsertSinglyLinkedList sortInsertSinglyLinkedList = sortInsert(25, null);
        //findMiddleOfLinkedList(head);
        //print(sortInsertSinglyLinkedList);
        //findMiddleOfLinkedListSlowFast(head);
        //findNthNodeFromEnd(1, head);
        print(reverse(head));
    }
}

