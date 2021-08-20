package com.company;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
//        Take name as input and print a greeting message for that name.
        System.out.println("what's Your Name?");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.println("Hey, " + name + " Welcome to the world of Programming.");

    }
}
