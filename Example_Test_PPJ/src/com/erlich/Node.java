package com.erlich;

public class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
    Node(int data) {
        this(data,null);
    }

//    public int countNodes(Node head) {
//        int counter = 0;
//        while(head.next != null) {
//            counter++;
//            head = head.next;
//        }
//        return counter;
//    }
}
