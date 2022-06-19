package com.bridgelabz;

import java.util.Scanner;

public class MaximumString {

    public static String str1, str2, str3;

    private static void EnterString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        str1 = scanner.nextLine();
        System.out.println("Enter the number");
        str2 = scanner.nextLine();
        System.out.println("Enter the number");
        str3 = scanner.nextLine();
    }

    private static void maxString(String str1, String str2, String str3) {
        if ((str1.length() > str2.length()) && (str1.length() > str3.length())) {
            System.out.println("Maximum String is " + str1);
        } else if ((str3.length() > str2.length()) && (str3.length() > str2.length())) {
            System.out.println("Maximum String is " + str3);
        } else {
            System.out.println("Maximum String is " + str2);
        }
    }


    public static void main(String[] args) {
        EnterString();
        maxString(str1, str2, str3);
    }

}

