package com.erlich;

public class Main {

    public static void main(String[] args) {
	    myLinkedList myLinkedList = new myLinkedList();

	    myLinkedList.addBack(4);
	    myLinkedList.addBack(5);
	    myLinkedList.addFront(3);
        myLinkedList.addFront(2);
        myLinkedList.addFront(1);

        myLinkedList.showData();

        System.out.println("----------------------");

        myStack myStack = new myStack();

        myStack.push(4);
        myStack.push(2);
        myStack.push(1);

        myStack.pop();

        myStack.push(5);

        myStack.showStack();


    }
}
