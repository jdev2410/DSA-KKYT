package com.dsa.learning.linkedList;

public class RemoveDuplicate {
    private int data;
    private RemoveDuplicate next;

    public RemoveDuplicate(int data) {
        this.data = data;
        this.next = null;
    }

    public static void print(RemoveDuplicate head) {
        if (head == null)
            return;
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static RemoveDuplicate remove(RemoveDuplicate head) {
        if (head == null)
            return null;
        RemoveDuplicate node = head;
        while (node != null && node.next != null) {
            if (node.data == node.next.data) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        RemoveDuplicate head = new RemoveDuplicate(2);
        RemoveDuplicate node1 = new RemoveDuplicate(3);
        RemoveDuplicate node2 = new RemoveDuplicate(3);
        RemoveDuplicate node3 = new RemoveDuplicate(4);
        RemoveDuplicate node4 = new RemoveDuplicate(5);
        RemoveDuplicate node5 = new RemoveDuplicate(5);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        print(head);
        System.out.println("________________________________________");
        RemoveDuplicate remove = remove(head);
        print(remove);
    }
}
