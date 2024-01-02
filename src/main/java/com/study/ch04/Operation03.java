package com.study.ch04;

public class Operation03 {
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

        System.out.println("논리연산자");
        System.out.println(505 % 5 == 0 && 505 % 50 != 0);
        System.out.println(!(505 % 5 == 0 || 505 % 50 == 0));
        int age = 30;
        System.out.println(age < 40 && age > 20 && age !=30);





        }
}
