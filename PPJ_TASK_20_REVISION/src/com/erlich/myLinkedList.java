package com.erlich;

public class myLinkedList {
    Node head;

    public myLinkedList() {
        head = null;
    }

    public void addFront(int data) {
        head = new Node(data,head);
    }

    public void addBack(int data) {
        if (head == null) {
            addFront(data);
            return;
        }

        Node tmp = head;

        while (tmp.next != null) {
            tmp = tmp.next;
        }

        tmp.next = new Node(data);

    }

    public void showData() {
        Node tmp = head;
        while (tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }



}
