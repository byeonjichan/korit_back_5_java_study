package com.study.home;

public class ValueConvertExample {
    public static void main(String[] args) {

        String str = "100";
        int data1 = 200;
        int result = 0;

        result = 100 + Integer.parseInt(str) + data1;

        System.out.println("숫자 합: " + result);
    }
}
