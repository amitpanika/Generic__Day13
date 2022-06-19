package com.bridgelabz;

import java.util.Scanner;

public class MaximumInteger {

    public static Integer int1, int2, int3;

    public static void EnterNumber() {
         System.out.println("enter first number");
         Scanner scanner = new Scanner(System.in);
         int1 = scanner.nextInt();
         System.out.println("Ener the second number");
         int2 = scanner.nextInt();
         System.out.println("enter the third number");
         int3 = scanner.nextInt();
    }

    public static void main(String[] args) {
        System.out.println("Enter the number");
        EnterNumber();
        maxIntegers(int1, int2, int3);
        System.out.println("enter first number");
        Scanner scanner = new Scanner(System.in);
        int1 = scanner.nextInt();
        System.out.println("Ener the second number");
        int2 = scanner.nextInt();
        System.out.println("enter the third number");
        int3 = scanner.nextInt();
    }

    private static void maxIntegers(Integer int1, Integer int2, Integer int3) {
        if (int1 > int2 && int1 > int3) {
            System.out.println("Maximum integer is " + int1);
        } else if (int2 > int1 & int2 > int3) {
            System.out.println("Maximum integer is " + int2);
        } else
            System.out.println("Maximum integer is " + int3);
    }
}
