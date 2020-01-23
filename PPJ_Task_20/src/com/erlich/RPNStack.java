package com.erlich;

public class RPNStack {
    private Node top;

    public RPNStack() {
        this.top = null;
    }

    public void push(double d) {
        Node tmp = new Node(d,top);
        top = tmp;
    }

    public double pop(){
        Node tmp = top;
        if(tmp == null) {
            System.out.println("Stack is already empty");
            return -1;
        }
        top = tmp.next;
        return tmp.val;
    }

    public boolean empty() {
        return top == null;
    }
}
