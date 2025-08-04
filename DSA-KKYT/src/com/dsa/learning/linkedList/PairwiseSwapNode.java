package com.dsa.learning.linkedList;

public class PairwiseSwapNode {
    // Input-> 1, 2, 3, 4
    // Output-> 2, 1, 4, 3

    // Input-> 1, 2, 3, 4, 5
    // Output-> 2, 1, 4, 3, 5

    // Input-> 1
    // Output-> 1

    private int data;
    private PairwiseSwapNode next;

    public PairwiseSwapNode(int data) {
        this.data = data;
        this.next = null;
    }

    private static void print(PairwiseSwapNode head) {
        if (head == null)
            return;
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }


    private static PairwiseSwapNode swapNode(PairwiseSwapNode head) {
        if (head == null)
            return null;
        PairwiseSwapNode node = head;
        while (node != null) {
            int temp;
            if (node.next != null) {
                temp = node.next.data;
                node.next.data=node.data;
                node.data=temp;
                node=node.next.next;
            }
            else {
                break;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        PairwiseSwapNode head = new PairwiseSwapNode(1);
        PairwiseSwapNode node1 = new PairwiseSwapNode(2);
        PairwiseSwapNode node2 = new PairwiseSwapNode(3);
        PairwiseSwapNode node3 = new PairwiseSwapNode(4);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        print(head);
        System.out.println("________________________________");
        PairwiseSwapNode pairwiseSwapNode = swapNode(head);
        print(pairwiseSwapNode);
    }
}
