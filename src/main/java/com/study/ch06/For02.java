package com.study.ch06;

import java.util.Scanner;

public class For02 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.print(i+1);
            if (i % 5 != 4) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            if (i % 5 != 4) {
                System.out.print(", ");
            }
            if (i % 5 == 4) {
                System.out.println();
            }
        }
        for (int i = 0; i < 5; i++) {
            int rv_i = 5 - 1 - i; // <- n번 반복 공식
            System.out.print(rv_i);
            if (rv_i % 5 != 0) {
                System.out.print(", ");
            }
            if (rv_i % 5 == 0) {
                System.out.println();
        }
    }
}
}
        /*
        0,1,2,3,4
        5,6,7,8,9
         */

