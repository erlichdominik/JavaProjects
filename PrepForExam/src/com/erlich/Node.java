package com.erlich;

public class Node {
    int value;
    Node next;

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    static int last2(Node head) {
        Node tmp = head;
        int sum = 0;
        while (tmp.next != null) {
            sum = tmp.value + tmp.next.value;
            tmp = tmp.next;
        }
        return sum;
    }

}
