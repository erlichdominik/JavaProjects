package com.erlich;

import java.io.*;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        File file = new File("test.txt");

        try {
            PrintWriter output = new PrintWriter(file);
            //FileOutputStream output = new FileOutputStream(file);
            output.write("Mike Rak");
            output.write(42);
            output.close();
        } catch (IOException e) {
            System.out.println(e);
        }


        try {
            Scanner scanner = new Scanner(file);
            String name = scanner.nextLine();
            String age = scanner.nextLine();
            System.out.println(name + " " + age);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
