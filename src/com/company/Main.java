package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Print question
        System.out.println("Enter your name:");

        //Create scanner to read input
        Scanner in = new Scanner(System.in);

        //Get input and write it to string
        String name = in.nextLine();

        //Print answer
        System.out.println("Your name is " + name);

        //Same for age and surname

        //Surname
        System.out.println("Enter your surname");
        String surname = in.nextLine();
        System.out.println("Your surname is " + surname);

        //Age
        System.out.println("Enter your age");
        String age = in.nextLine();
        System.out.println("Your age is " + age);

        //All data in one string
        System.out.println("You are " + name + " " + surname + " and you are " + age + " year(s) old.");
    }
}
