package com.erlich;

public class MyString {

    public static void main(String[] args) {
        MyString myString = new MyString();
        System.out.println(myString.getLength());

    }

    private String string;

    public MyString(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public MyString() {
        this("");
    }

    private int getLength() {
        return string.length();
    }

    private char getChar(int n) {
        if (n > 0 && n < string.length()) {
            return string.charAt(n);
        } else {
            throw new IllegalArgumentException("index is not correct");
        }
    }

    private void append(String s) {
        string += s;
    }

    private void append(int rep, String s) {
        String tmp = "";

        for (int i = 0; i < rep; i++) {
            tmp += s;
        }

        string += tmp;
    }

    private void prepand(String s) {
        String tmp = s + string;
        string = tmp;
    }

    private void insert(int pos, String s) {
        if (pos > 0 && pos < string.length()) {
            
        } else {
            throw new IllegalArgumentException("wrong position");
        }
    }

}
