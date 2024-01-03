package com.study.ch05;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        int num = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("번호선택: ");
        num = scanner.nextInt();

        switch (num) {
            case 0:
                System.out.println("0선택");
                break;
            case 1:
                System.out.println("1선택");
                break;
            case 2:
                System.out.println("2선택");
                break;
            default:
                System.out.println("오류");

        }
    }
}
