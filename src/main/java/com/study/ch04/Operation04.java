package com.study.ch04;

public class Operation04 {
    public static void main(String[] args) {
        /*
        * <<연산자>>
        *산술연산자 , 비교연산자 , 논리연산자, 조건연산자, 복합대입연산자
        *
        */
        /*
         * 논리연산자
         * && (곱) - AND
         * || (합) - OR
         * ! (부정) - NOT
         * true(1)
         * false(0)
         *
         *  ex) true && false => false
         *      true && true => true
         *      true || false => true
         *      false || false => false
         *     !false => true
         */

        int year=2000;
        boolean step1 = year > 0;
        boolean step2 = year < 4001;
        boolean step3 = year % 4 == 0;
        boolean step4 = year % 100 !=0;
        boolean step5 = year % 400 ==0;
        boolean result = step1 && step2 && (step3 && step4 || step5);

        System.out.println("결과 :"+ result);









        }
}
