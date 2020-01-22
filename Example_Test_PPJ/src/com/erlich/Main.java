package com.erlich;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Person[] arr = {new Person("mark"), new Person("kuba"), new Person("bartek"), new Person("marek")};

        for (Person person : shortNam(arr, "ma")) {
            System.out.println(person.name);
        }

        Node nodeA = new Node(2);
        Node nodeB = new Node(3);
        Node nodeC = new Node(5);
        LinkedList<Integer> linkedList = new LinkedList<>();
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

