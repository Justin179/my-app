package com.modernjava.beginner;

public class 程式執行順序1 {

    // 可以用這支程式，了解一下程式執行的順序

    public static void main(String[] args) {
        System.out.println(1);

         method1();

        System.out.println(3);

        method2();

        System.out.println(5);
    }


    public static void method1(){
        System.out.println(2);
    }

    public static void method2(){
        System.out.println(4);
    }

}
