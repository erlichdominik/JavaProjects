package com.erlich;

public class changeBytes {
    public static void main(String[] args) {
        changeByte(5, 2);
    }

    static int changeByte(int n, int i) {
        return (n & (0xF) << ((i - 1)*8));
    }

//    static int changeByte(int n, int i) {
//        return (n & (0XFF << ((i - 1) * 8))) ^ (0xFF << ((i - 1) * 8));
//    }
}
