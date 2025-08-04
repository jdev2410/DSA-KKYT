package com.dsa.learning.linkedList;

public class DetectLoop {
    private int data;
    private DetectLoop next;

    public DetectLoop(int data) {
        this.data = data;
        this.next = null;
    }

    private static void print(DetectLoop head) {
        if (head == null)
            return;
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    private static void isLoopDetected(DetectLoop head) {
        if (head == null)
            return;
        DetectLoop node = head;
        do {
            System.out.println(head.data);
            head = head.next;
        }
        while (node != head);
       // return false;
    }

    public static void main(String[] args) {
        DetectLoop head = new DetectLoop(2);
        DetectLoop node1 = new DetectLoop(3);
        DetectLoop node2 = new DetectLoop(4);
        DetectLoop node3 = new DetectLoop(5);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next=head;
       // print(head);
        System.out.println("____________________________");
        //System.out.println(isLoopDetected(head));
        isLoopDetected(head);
    }
}
