package com.company;

import java.util.Scanner;

public class Mail {
    private String companyDomain = "company.com";
    private String firstName;
    private String lastName;
    private String password;
    private String department;

    //first & lastName constructor
    public Mail(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created for -> " + this.firstName
         + " "+ this.lastName);

        this.department = setDepartment();
        System.out.println("Department is " + this.department);

        this.password = randomPassword(8);
        System.out.println("Your password is: " + this.password);

        String userEmail = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companyDomain;


        System.out.println("Your email is " + userEmail);
    }

    private String setDepartment() {
        System.out.println("Please enter your department:\n1, for sales\n2, for Accounting\n3, for development\n4, for HR\n");
        Scanner scannerIn = new Scanner(System.in);
        int choice = scannerIn.nextInt();
        switch (choice) {
            case 1:
                return "sales";
            case 2:
                return "accounting";
            case 3:
                return "development";
            case 4:
                return "HR";
            default:
                return "No Department";
        }
    }

    //generate random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&?()";
        char[] pw = new char[length];

        for (int i = 0; i < length; i++)
        {
            int rand = (int) (Math.random() * passwordSet.length());
            pw[i] = passwordSet.charAt(rand);
        }
        return new String(pw);
    }

}
