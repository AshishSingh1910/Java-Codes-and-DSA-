package com.company;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
//        Take 2 numbers as input and print the largest number.
        System.out.println("print two numbers");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        if (num1>num2){
            System.out.println(num1 + " is largest number");
        } else {
            System.out.println(num2 + " is Largest number");
        }
    }
}
