package com.study.home;

import java.util.Scanner;

public class UpDownGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int matchValue = 0;
        int value = 0;

        matchValue = (int) (Math.random() * 30) + 1;
        while (count < 10) {
            System.out.print("맞출 숫자 입력 : ");
            value = scanner.nextInt();
            if (value > matchValue) {
                System.out.println("업");
            } else if (value < matchValue) {
                System.out.println("다운");
            } else {
                System.out.println("정답입니다.!");
            }
            break;
        }
        count++;
        if (count == 10) {
            System.out.println("게임 오버. 정답은 " + matchValue + "였습니다.");
        }
    }
}
