package com.dsa.learning.linkedList;

import java.util.Arrays;
import java.util.List;

public class LinkedListDemo {
    private int data;
    private LinkedListDemo next;

    public LinkedListDemo(int data) {
        this.data = data;
        this.next = null;
    }

    private static void printNo(LinkedListDemo node) {
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    private static void printRecursive(LinkedListDemo node) {
        if (node == null)
            return;
        System.out.println(node.data);
        printRecursive(node.next);
    }

    private static LinkedListDemo insertAtFirst(int numberToBeAddedAtFirst, LinkedListDemo node) {
        LinkedListDemo newNode = new LinkedListDemo(numberToBeAddedAtFirst);
        newNode.next = node;
        return newNode;
    }

    private static LinkedListDemo insertAtLast(int numberToBeAddedAtEnd, LinkedListDemo node) {
        LinkedListDemo newNode = new LinkedListDemo(numberToBeAddedAtEnd);
        if (node == null)
            return newNode;
        LinkedListDemo head = node;
        while (node.next != null)
            node = node.next;
        node.next = newNode;
        return head;
    }

    private static LinkedListDemo insertAtGivenIndex(int index, LinkedListDemo node, int value) {
        LinkedListDemo head = node;
        LinkedListDemo newNode = new LinkedListDemo(value);
        if (node == null)
            return newNode;
        LinkedListDemo temp = node;
        for (int i = 1; i < index; i++) {
            if (i + 1 == index) {
                temp = node.next;
                node.next = newNode;
                newNode.next = temp;
            } else
                node = node.next;
        }
        return head;
    }

    public static LinkedListDemo deleteFirstNode(LinkedListDemo node) {
        if (node != null && node.next != null)
            return node.next;
        return null;
    }

    public static LinkedListDemo deleteLastNode(LinkedListDemo node) {
        if (node == null || node.next == null)
            return null;
        LinkedListDemo head = node;
        while (node.next.next != null) {
            node = node.next;
        }
        node.next = null;
        return head;
    }

    public static int search(int numberToBeSearched, LinkedListDemo node) {
        if (node == null)
            return -1;
        int count = 1;
        while (node != null) {
            if (node.data == numberToBeSearched)
                return count;
            else {
                count++;
                node = node.next;
            }
        }
        return -1;
    }

    private static LinkedListDemo reverse(LinkedListDemo head) {
        LinkedListDemo temp = head;
        LinkedListDemo prev = null;
        LinkedListDemo next;
        while (temp != null) {
             next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        LinkedListDemo head = new LinkedListDemo(25);
        LinkedListDemo ll = new LinkedListDemo(26);
        LinkedListDemo ll1 = new LinkedListDemo(28);
        LinkedListDemo del = new LinkedListDemo(78);
        head.next = ll;
        ll.next = ll1;
        ll1.next=del;
        //printNo(head);
       // printRecursive(head);
        // LinkedListDemo linkedListDemo = insertAtFirst(24, head);
        // LinkedListDemo linkedListDemo = insertAtLast(29, head);
       // System.out.println("------------------------------------");
        //LinkedListDemo linkedListDemo = insertAtGivenIndex(2, head);
        //LinkedListDemo linkedListDemo = insertAtGivenIndex(3, head, 27);
        // LinkedListDemo linkedListDemo = deleteFirstNode(head);
        //LinkedListDemo linkedListDemo = deleteLastNode(del);
        //System.out.println(search(25, head));
        // printRecursive(linkedListDemo);
        printNo(reverse(head));
    }
}
