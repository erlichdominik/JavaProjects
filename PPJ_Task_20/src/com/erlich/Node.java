package com.erlich;

public class Node {
    double val;
    Node next;

    Node(double val, Node next) {
        this.val = val;
        this.next =  next;
    }

    Node(double val) {
        this(val,null);
    }
}
