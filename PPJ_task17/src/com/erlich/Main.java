package com.erlich;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        File file = new File("test.txt");
//        try {
//            PrintWriter printWriter = new PrintWriter(file);
//            printWriter.println("random stuff");
//            printWriter.println(22);
//            printWriter.close();
//        } catch (FileNotFoundException e) {
//            System.err.println(e.getMessage());
//        }
//
////        try {
////            Scanner scanner = new Scanner(file);
////            String name = scanner.nextLine();
////            System.out.println(name);
////        } catch (FileNotFoundException e) {
////            System.err.println(e.getMessage());
////        }
//
//        try {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
//            String line = null;
//            while((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (FileNotFoundException e) {
//            e.getStackTrace();
//        } catch (IOException e) {
//            e.getStackTrace();
//        }
//
//
////        File file = new File("students.txt");
////
////        ArrayList<Student> students = new ArrayList<>();
////
////        students.add(new Student("Tom", 3));
////        students.add(new Student("Dave", 4));
////        students.add(new Student("Bill", 2));
////
////
//////        serialize collection
////
////
////        try {
////            FileOutputStream fileOutputStream = new FileOutputStream(file);
////            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
////            for (Student s : students) {
////                objectOutputStream.writeObject(s);
////            }
////            fileOutputStream.close();
////            objectOutputStream.close();
////        } catch (FileNotFoundException e) {
////            System.err.println(e.getMessage());
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////        //deserialize collection
////
////        try {
////            FileInputStream fileInputStream = new FileInputStream(file);
////            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
////            ArrayList<Student> students2 = new ArrayList<>();
////            try {
////                while (true) {
////                    Student student = (Student) objectInputStream.readObject();
////                    students2.add(student);
////                }
////            } catch (EOFException e) {}
////
////            for (Student s : students2) {
////                System.out.println(s.toString());
////            }
////
////        } catch (FileNotFoundException e) {
////            System.err.println(e.getMessage());
////        } catch (IOException e) {
////            e.printStackTrace();
////        } catch (ClassNotFoundException e) {
////            e.printStackTrace();
////        }
//
//    try {
//        File file = new File("test.txt");
//        FileInputStream fileInputStream = new FileInputStream(file);
//
//
//    } catch (FileNotFoundException e) {
//        e.getStackTrace();
//    }

        //        try {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
//            String line = null;
//            while((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (FileNotFoundException e) {
//            e.getStackTrace();
//        } catch (IOException e) {
//            e.getStackTrace();
//        }

//        try {
//            FileReader fileReader = new FileReader("D:\\javaProgramming\\PPJ_task16\\out\\production\\PPJ_task16\\com\\erlich\\Car.class");
//            int val;
//            String buffer = "";
//            while ((val = fileReader.read()) != -1) {
//                if ((val >= 'a' && val <= 'z') || (val >= 'A' && val <= 'Z') || (val >= '0' && val <= '9')) {
//                    buffer += (char)val;
//                } else {
//                    if (buffer.length() >= 4) {
//                        System.out.println(buffer);
//                        buffer = "";
//                    }
//                }
//            }
//        } catch (FileNotFoundException e) {
//            e.getStackTrace();
//        } catch (IOException e) {
//            e.getStackTrace();
//        }
//


        try {
            FileReader fileReader = new FileReader("D:\\javaProgramming\\PPJ_task16\\out\\production\\PPJ_task16\\com\\erlich\\Car.class");
            int val;
            String buffer = "";
            while ((val = fileReader.read()) != -1) {
                if ((val >= 'a' && val <='z') || (val >= 'A' && val <='Z') || (val >= '0' && val <='9')) {
                    buffer += (char)val;
                } else {
                    if (buffer.length() >=  4) {
                        System.out.println(buffer);
                        buffer = "";
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

































    }


}
