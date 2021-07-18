package com.modernjava.beginner;

// 1新增一個java程式
// 2宣告一個 int的變數
// 3記錄某個 數字a
// 4新增一個方法, 並回傳 數字a
// 5新增一個main方法，呼叫該方法，並印出 數字a

public class VariableEx1 {

    // 小範圍- 區域變數 local variable
    // 中範圍- 實體變數
    // 大範圍- 靜態變數 static

    // 靜態變數
    static int leoAge = 25; // 靜態

    // 實體變數
    int leoAge2 = 25; // 實體

    // 靜態方法
    public static int getLeoAge() {
        // 區域變數
        int num = 0;

        return leoAge ;
    }

    // main方法 (程式進入點) psvm
    public static void main(String[] args) {

        // 呼叫 getLeoAge() 取得年齡
        int age = getLeoAge();

        // 印出取得的年齡 sout
        System.out.println(age);

    }



}
