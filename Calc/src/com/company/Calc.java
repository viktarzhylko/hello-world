package com.company;

import java.util.Scanner;

public class Calc {
    private static Scanner read;

    public static void main(String[] args) {

        read = new Scanner(System.in);

        double x;
        double y;
        String operator;

        System.out.print("-> ");


        x = Double.parseDouble(args[0]);
        operator = args[1];
        y = Double.parseDouble(args[2]);

        if (operator.equals("*")){
            System.out.println("= " + (x * y));
        }
        if (operator.equals("/")){
            System.out.println("= " + (x / y));
        }
        if (operator.equals("+")){
            System.out.println("= " + (x + y));
        }
        if (operator.equals("-")){
            System.out.println("= " + (x - y));
        }


    }
}
