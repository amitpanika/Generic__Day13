package com.bridgelabz;

import java.util.Scanner;

public class Generic {
    public static Integer int1, int2, int3;
    public static float flt1, flt2, flt3;
    public static String str1, str2, str3;

    public static void EnterNumber() {
        System.out.println("enter first number");
        Scanner scanner = new Scanner(System.in);
        int1 = scanner.nextInt();
        System.out.println("Ener the second number");
        int2 = scanner.nextInt();
        System.out.println("enter the third number");
        int3 = scanner.nextInt();
    }

    private static void EnterString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        str1 = scanner.nextLine();
        System.out.println("Enter the number");
        str2 = scanner.nextLine();
        System.out.println("Enter the number");
        str3 = scanner.nextLine();
    }

    public static void EnterFloatNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter float number");
        flt1 = scanner.nextFloat();
        System.out.println("Enter float number");
        flt2 = scanner.nextFloat();
        System.out.println("Enter float number");
        flt3 = scanner.nextFloat();
    }

    public static <E extends Comparable> E usegeneric(E a, E b, E c) {


        E max = a;
        if (b.compareTo(max) > 0) {
            max = b;

        }   if (c.compareTo(max) > 0) {
                max = c;
            }
            return max;

        }

    public static void main(String[] args) {
        EnterFloatNumber();
        EnterString();
        EnterNumber();
    }
    }

