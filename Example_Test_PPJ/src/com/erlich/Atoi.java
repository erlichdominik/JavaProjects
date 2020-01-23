package com.erlich;

public class Atoi {
    public static void main(String[] args) {
        System.out.println(atoi("22"));
    }

    public static int atoi(String str) {
        int tmp = 0;
        try {
            tmp = (int)Double.parseDouble(str);
        } catch (NumberFormatException e) {
            e.getMessage();
        }
        return tmp;
    }
}
