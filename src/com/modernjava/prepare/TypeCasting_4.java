package com.modernjava.prepare;

public class TypeCasting_4 {

    // 最大 8 byte: long, double
    // 次大 4 byte: int, float
    // 2 byte: char, short
    // 1 byte: byte

    // 小的塞到大的
    // byte -> short -> char -> int -> long -> float -> double

    // 大的塞到小的
    // double -> float -> long -> int -> char -> short -> byte

    public static void main(String[] args) {
        // 小塞到大，會自動轉
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

        // 大塞到小，要手動轉
        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble2; // Manual casting: double to int

        System.out.println(myDouble2);   // Outputs 9.78
        System.out.println(myInt2);      // Outputs 9


//        byte a = 1;
//        short b = 2;
//        b = a;
//        a = b;




    }
}
