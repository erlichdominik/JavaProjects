package com.erlich;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();

        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Adelaide");
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit);

        visit(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> stringIterator = linkedList.iterator();
        while (stringIterator.hasNext()) {
            System.out.println("Now visiting: " + stringIterator.next());
        }
        System.out.println("==================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int comperison = stringListIterator.next().compareTo(newCity);

            if (comperison == 0) {
                System.out.println("New city " + newCity + " is already in use");
                return false;
            } else if (comperison > 0) {
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comperison < 0) {
                //move to the next city, which we already did in line 44
                //we dont need to add city here because we gonna do it
                //in another iteration of the loop
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean movingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()) {
            System.out.println("List is empty");
            return;
        } else {
            System.out.println("Now visiting: " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Holiday over");
                    quit = true;
                    break;
                case 1:
                    if (!movingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        movingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting: " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        movingForward = false;
                    }
                    break;
                case 2:
                    if (movingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        movingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting: " + listIterator.previous());
                    } else {
                        System.out.println("Reached start of the list");
                        movingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println(
                "Available actions:\n" +
                        "0. quit\n" +
                        "1. go next\n" +
                        "2. go previous\n" +
                        "3. print menu\n"
        );
    }
}
