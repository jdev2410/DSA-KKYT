package com.dsa.learning.linkedList;

public class DoublyLinkedList {
    DoublyLL head;

    class DoublyLL{
        DoublyLL prev;
        DoublyLL next;
        String data;
        DoublyLL(String data){
           prev= null;
           next=null;
           this.data=data;
        }
    }

    void insertData(String data){
        DoublyLL dd= new DoublyLL(data);
        if(head==null){
            head=dd;
            return;
        }
        dd.next=head.prev;
        dd=head;
    }

    public static void main(String[] args) {
        DoublyLinkedList dd= new DoublyLinkedList();
        dd.insertData("A");
        dd.insertData("B");
        dd.insertData("C");
    }
}
