package com.erlich;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        RPNStack rpnStack = new RPNStack();
        try {
            FileReader fileReader = new FileReader("D:\\javaProgramming\\PPJ_Task_20\\src\\com\\erlich\\text.txt");
            BufferedReader br = new BufferedReader(fileReader);
            String[] out = br.readLine().split(" ");

            for (String s : out) {
                switch (s) {
                    case "*": {
                        double d1 = rpnStack.pop();
                        double d2 = rpnStack.pop();
                        rpnStack.push(d1 * d2);
                    }
                    break;
                    case "+": {
                        double d1 = rpnStack.pop();
                        double d2 = rpnStack.pop();
                        rpnStack.push(d1 + d2);
                    }
                    break;
                    case "-": {
                        double d2 = rpnStack.pop();
                        double d1 = rpnStack.pop();
                        rpnStack.push(d1 - d2);
                    }
                    break;
                    case "/": {
                        double d2 = rpnStack.pop();
                        double d1 = rpnStack.pop();
                        rpnStack.push(d1 / d2);
                    }
                    break;
                    default:
                        rpnStack.push(Double.parseDouble(s));
                        System.out.println("random text");
                }
            }
            System.out.println(rpnStack.pop());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
