package com.bridgelabz;

import java.util.Scanner;

public class MaximumFloat {

    public static float flt1, flt2, flt3;

    public static void EnterNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter float number");
        flt1 = scanner.nextFloat();
        System.out.println("Enter float number");
        flt2 = scanner.nextFloat();
        System.out.println("Enter float number");
        flt3 = scanner.nextFloat();
    }
    public static void findMaximumFloatNumber(){
        if (flt1 > flt2 && flt1 > flt3) {
            System.out.println("Maximum integer is " + flt1);
        } else if (flt2 > flt1 & flt2 > flt3) {
            System.out.println("Maximum integer is " + flt2);
        } else
            System.out.println("Maximum integer is " + flt3);
    }

    public static void main(String[] args) {
        EnterNumber();
        findMaximumFloatNumber();
    }
}
