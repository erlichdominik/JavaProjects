package com.erlich;

public class myStack {
    Node top;

    public myStack() {
        top = null;
    }

    public void push(int data) {
        Node tmp = new Node(data,top);
        top = tmp;
    }

    public int pop() {
        Node tmp = top;

        if (tmp == null) {
            System.out.println("Stack is empty");
            return -1;
        }

        top = tmp.next;
        return tmp.data;

    }

    public void showStack() {
        Node tmp = top;

        while(tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }

}
