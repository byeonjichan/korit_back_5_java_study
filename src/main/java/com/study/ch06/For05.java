package com.study.ch06;

import java.util.IllformedLocaleException;

public class For05 {
    public static void main(String[] args) {
        for(int i= 0; i < 5; i++) {
            for (int j = 0; j < i+1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int b = 0; b < 5; b++) {
            for(int j = 0; j < 5-b; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
