package com.generic;

public class printDataTypes<X, Y, Z> {
    X[] a;
    Y[] b;
    Z[] c;

    public printDataTypes(Z[] c, Y[] b, X[] a) {
        this.c = c;
        this.b = b;
        this.a = a;
    }


    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 4, 5, 6,};
        String[] b = {"amit", "akash", "manish"};
        Double[] c = {2.5, 2.8, 3.6, 8.4,};
        printdatatype(a);
        printdatatype(b);
        printdatatype(c);

    }

    private static <T> void printdatatype(T[] a) {
        for (T i : a) {
            System.out.println(i);
        }
    }

}
