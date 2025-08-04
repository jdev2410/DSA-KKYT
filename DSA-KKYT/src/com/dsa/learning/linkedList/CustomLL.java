package com.dsa.learning.linkedList;

import java.util.*;
import java.util.stream.Collectors;

public class CustomLL {
    Node head;

    class Node {
        private String data;
        private Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertAtFirst(String data) {
        Node ll = new Node(data);
        if (head == null) {
            head = ll;
            return;
        }
        ll.next = head;
        head = ll;
    }

    public void insertAtTheEnd(String data) {
        Node ll = new Node(data);
        if (head == null) {
            head = ll;
            return;
        }
        // Need to review this logic
//        Node node=head;
//        node.next=ll;
//        head=node;
    }

    private void printNames(Node node) {
        //  Traversing using while loop
        while (node != null) {
            System.out.println("My name is " + node.data);
            node = node.next;
        }

    }

    public void traversByRecursion(Node node) {
        if (node != null) {
            System.out.print(node.data);
            node = node.next;
            traversByRecursion(node);
        }

    }

    public Node insertAtGivenIndex(Node head, int index, String data) {
        Node temp = new Node(data);
        if (index == 1) {
            temp.next = head;
            return temp;
        }
        Node curr = head;
        for (int i = 1; i <= index - 2 && curr != null; i++) {
            curr = curr.next;
        }
        if (curr == null)
            return head;
        temp.next = curr.next;
        return head;
    }

    boolean deleteFirst(Node node) {
        if (node == null) {
            return false;
        }
        head = node.next;
        return true;
    }

    boolean deleteLast(Node node) {
        if (node == null) {
            return false;
        }
        // write code here
        return true;
    }

    public int findIndexOfGivenElement(Node node, String eleToBeSearched) {
        if (node == null)
            return -1;
        for (int i = 1; node != null; i++) {
              if(node.data.equals(eleToBeSearched)){
                  return i;
              }
            node=node.next;
        }
        return 0;
    }

    public static void main(String[] args) {
//        CustomLL ll = new CustomLL();
////        ll.insertAtFirst("A");
////        ll.insertAtFirst("B");
////        ll.insertAtFirst("D");
//        System.out.println(ll.findIndexOfGivenElement(ll.head,"L"));

        String s= "15465sdfi";
        int replace = s.lastIndexOf("/");
        System.out.println(replace);
    }

}