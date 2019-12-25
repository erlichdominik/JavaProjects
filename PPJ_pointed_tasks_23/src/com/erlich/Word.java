package com.erlich;

public class Word {
    private String textStorage;
    private int textLength;

    public Word() {
        this.textStorage = "";
        this.textLength = 0;
    }

    public void addChar(char c) {
        textStorage += c;
    }
    public String toString() {
        return textStorage;
    }
    public int length() {
        return textLength;
    }

}
