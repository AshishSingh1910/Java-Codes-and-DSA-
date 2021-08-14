package com.company;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
//        Write a program to input principle, time and rate (P, T, R) from user and find Simple Interest.
        Scanner in = new Scanner(System.in);

        System.out.println("Enter principle, time and rate for Simple Interest:");
        int P = in.nextInt();
        int T = in.nextInt();
        int R = in.nextInt();

        int A = (1 + R * T);
        int B = P * A;
        System.out.println("Simple Interest :" + B);
    }
}
