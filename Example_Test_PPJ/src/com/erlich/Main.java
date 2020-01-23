package com.erlich;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
//        Person[] arr = {new Person("mark"), new Person("kuba"), new Person("bartek"), new Person("marek")};
//
//        for (Person person : shortNam(arr, "ma")) {
//            System.out.println(person.name);
////        }
//
//        Node nodeA = new Node(2);
//        Node nodeB = new Node(3);
//        Node nodeC = new Node(5);

//        myLinkedList myLinkedList = new myLinkedList();
//        myLinkedList.addFront(2);
//        myLinkedList.addFront(3);
//        myLinkedList.addFront(5);
//
//        System.out.println(myLinkedList.sum());
//        System.out.println(sum(myLinkedList.head));

        int[] arr = new int[]{1,2,3};
        System.out.println(arr[2]);
    }

    public static int sum(Node head) {
        int sum = 0;
        Node tmp = head;

        while(tmp != null) {
            sum+= tmp.data;
            tmp = tmp.next;
        }
        return sum;
    }


    public static Person[] shortNam(Person[] arr, String sub) {

        ArrayList<Person> people = new ArrayList<>();

        for (Person person : arr) {
            if (person.name.contains(sub)) {
                people.add(person);
            }
        }

        return people.toArray(new Person[people.size()]);
    }

}

