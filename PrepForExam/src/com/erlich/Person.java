package com.erlich;

import java.util.ArrayList;

public class Person {
    public String name;

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person[] people = new Person[]{new Person("andrzej"),new Person("przemyslaw")};

        for (Person person : lenghtName(people,7)) {
            System.out.println(person.name);
        }
    }

    static Person[] lenghtName(Person[] arr, int len) {
        ArrayList<Person> people = new ArrayList<>();

        for(Person person: arr) {
            if (person.name.length() == len) {
                people.add(person);
            }
        }

        return people.toArray(new Person[people.size()]);
    }

}
