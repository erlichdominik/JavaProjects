package com.erlich;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Fruit watermellon = new Fruit("Watermellon", 153859);
        Fruit apple = new Fruit("Apple", 6);
        Fruit[] fruits = new Fruit[]{watermellon,apple};
        saveFruits(fruits);
        ArrayList<Fruit> fruitArrayList = new ArrayList<>();
        for(Fruit fruit : readFruits()) {
            fruitArrayList.add(fruit);
        }
        for (Fruit fruit : fruitArrayList) {
            System.out.println(fruit.toString());
        }

        System.out.println("=======================");

        DataRegex dataRegex = new DataRegex("2002-10-12");
        dataRegex.getDate();

        EmailRegex emailRegex = new EmailRegex("dominik@gmail.com");
        emailRegex.getMail();
    }

    public static void saveFruits(Fruit[] fruits) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Fruit.txt"));
            bufferedWriter.write(fruits[0].toString());
            bufferedWriter.write(fruits[1].toString());
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Fruit[] readFruits() {
        ArrayList<Fruit> fruits = new ArrayList<>();
        try {
            File file = new File("Fruit.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader("Fruit.txt"));
            String line;
            String[] lines;

            while((line = bufferedReader.readLine()) != null) {
                lines = line.split(" ");
                fruits.add(new Fruit(lines[0],Integer.parseInt(lines[1])));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fruits.toArray(new Fruit[fruits.size()]);
    }
}
