package com.company;


import java.util.Scanner;

public class EmailApp {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Please enter your first name: ");
        String firstName = scanner1.next();

        System.out.println("Enter last name: ");
        String lastName = scanner2.next();
        Mail mail = new Mail(firstName, lastName);

    }
}
