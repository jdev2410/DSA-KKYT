package com.dsa.learning.linkedList.practiceLinkedList;

class DNode {
    public int data;
    public DNode next;
    public DNode prev;

    DNode(int data, DNode next, DNode prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}


public class DLLNode {
    private static DNode convertArrayIntoLL(int[] arr) {
        DNode head = new DNode(arr[0], null, null);
        DNode temp = head;
        for (int i = 1; i < arr.length; i++) {
            DNode d = new DNode(arr[i], null, null);
            temp.next = d;
            d.prev = temp;
            temp = temp.next;
        }
        return head;
    }


    private static void print(DNode head) {
        DNode temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    private static DNode reverseLinkedList(DNode head) {
        DNode temp = head;
        DNode prev = null;
        while (temp != null) {
            prev = temp.prev;
            temp.prev = temp.next;
            temp.next = prev;
            temp = temp.prev;
        }
        return prev.prev;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        DNode dNode = convertArrayIntoLL(arr);
        print(reverseLinkedList(dNode));
    }
}


