package com.erlich;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main{



        public static void main (String[]args){

//        Rectangle rectangle1 = new Rectangle(2,4);
//        Rectangle rectangle2 = new Rectangle(5.5,7.7);
//
//        Circle circle1 = new Circle(6);
//        Circle circle2 = new Circle(2);
//
//        Figure[] figures;
//        figures = new Figure[] {rectangle1,rectangle2,circle1,circle2};
//
//        System.out.println(figures[0].show());
//        System.out.println(figures[1].show());
//        System.out.println(figures[2].show());
//        System.out.println(figures[3].show());
//        System.out.println(figures[2].drawAtPoint(new Point(2,5)));
//
//        try {
//            raiseArrayIndexOutOfBoundsException();
//            raiseFileNotFoundException();
//            raiseException();
//        } catch (ArrayIndexOutOfBoundsException e) {
//            e.getStackTrace();
//        } catch (FileNotFoundException e) {
//            e.getStackTrace();
//        } catch (Exception e) {
//            e.getStackTrace();
//        }
//
//        try {
//            FileWriter fileWriter = new FileWriter("test.txt");
//            fileWriter.write("When the dragon's away, the micew will play");
//            String buffer = "";
//            int val;
//            fileWriter.close();
//            FileReader fileReader = new FileReader("test.txt");
//            while ((val = fileReader.read()) != -1) {
//                buffer += (char) val;
//            }
//            fileReader.close();
//            System.out.println(buffer);
//        } catch (IOException e) {
//            e.getStackTrace();
//        }
//        String s1 = "PPJ123TEST";
//        System.out.println(s1.substring(3,5));

        }

        public static void raiseArrayIndexOutOfBoundsException () throws ArrayIndexOutOfBoundsException {
            throw new ArrayIndexOutOfBoundsException();
        }

        public static void raiseFileNotFoundException () throws FileNotFoundException {
            throw new FileNotFoundException();
        }

        public static void raiseException () throws Exception {
            System.out.println("Wrong unit");
            throw new Exception();
        }


    }

