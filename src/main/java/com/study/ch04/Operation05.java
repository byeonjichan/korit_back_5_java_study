package com.study.ch04;

public class Operation05 {
    public static void main(String[] args) {
        /*
        * <<연산자>>
        *산술연산자 , 비교연산자 , 논리연산자, 조건연산자, 복합대입연산자
        *
        * 조건연산자(삼항연산자)
        *
        * a > 0 ? "양수" : a == 0 ? "0" : "음수"
         */

        int x = -1;
        int y = -3;

        String result = x == 0 || y == 0 ? "오류" :
                        x > 0 && y > 0 ? "1사분면" :
                        x < 0 && y > 0 ? "2사분면" :
                        x < 0 && y < 0 ? "3사분면" :
                        x > 0 && y < 0 ? "4사분면" : "";

        String result2 = x == 0 || y == 0 ? "오류" :
                (x > 0 ? (y > 0 ? "1사분면" : "4사분면"):
                        (y > 0 ? "2사분면" : "3사분면"));

        System.out.println(result2);







    }
}
