package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
//        Write a program to print factorial of a number, also take input.
        System.out.println("Print a number whose factor you want to find out..");

        Scanner in = new Scanner(System.in);
        long num = in.nextLong();
        int fact = 1;

       while(num!=0){
           fact *= num;
           num --;

       }
        System.out.println("The Factorial of a number :" + fact);
    }
}
