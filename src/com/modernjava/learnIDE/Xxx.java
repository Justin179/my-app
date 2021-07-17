package com.modernjava.learnIDE;

// 新增一個java程式

// 宣告一個 int的變數

// 記錄某個 數字a

// 新增一個方法, 並回傳 數字a

// 新增一個main方法，呼叫該方法，並印出 數字a

public class Xxx {

    // 小範圍- 區域變數 local variable
    // 中範圍- 實體變數
    // 大範圍- 靜態變數 static

    // 變數 many
    static int leoAge = 25; // 靜態

     int leoAge2 = 25; // 實體

    // 方法 many
    public static int getLeoAge() {

        int xxx = 0;



        return leoAge ;
    }

    // 進入點 psvm
    public static void main(String[] args) {

        int age = getLeoAge();

        // sout
        System.out.println(age);

    }



}
