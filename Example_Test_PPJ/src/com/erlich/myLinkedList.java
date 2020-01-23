package com.erlich;

public class myLinkedList {
    public Node head;

    public myLinkedList() {
        head = null;
    }

    public void addFront(int data) {
        head = new Node(data,head);
    }

//    public void addBack(int data) {
//        if (head == null) {
//            addFront(data);
//            return;
//        }
//        Node tmp = head;
//
//        while(tmp.next != null) {
//            tmp = tmp.next;
//            tmp.next= new Node(data);
//        }
//
//    }

    public int sum() {
        int sum = 0;
        Node tmp = head;
        while (tmp   != null) {
            sum += tmp.data;
            tmp = tmp.next;
        }
        return sum;
    }

}
