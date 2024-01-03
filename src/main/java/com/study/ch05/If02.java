package com.study.ch05;

import java.util.Scanner;

public class If02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        int y = 0;

        System.out.print("x와 y를 입력해주세요(띄어쓰기로 구분)");
        x = scanner.nextInt();
        y = scanner.nextInt();

        if (x == 0 || y == 0) {
            System.out.println("오류");
        } else if (x > 0 && y > 0) {
            System.out.println("1사분면입니다.");
        } else if (x < 0 && y > 0) {
            System.out.println("2사분면입니다.");
        } else if (x < 0 && y < 0) {
            System.out.println("3사분면입니다.");
        } else {
            System.out.println("4사분면입니다.");
        }


    }
}
