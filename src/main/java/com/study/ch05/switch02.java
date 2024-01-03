package com.study.ch05;

import javax.lang.model.type.IntersectionType;
import java.util.Scanner;

public class switch02 {
    public static boolean select(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("여기서 멈출까요?(y/n): ");
        String value = scanner.next();
        return "y".equals(value) || "Y".equals(value);

    }
    public static void main(String[] args) {
        int num = 1;

        System.out.println("게임 시작");
        switch (num) {
            case 1:
                System.out.println("1단계 시작");
                if(select()){
                    break;
                }
            case 2:
                System.out.println("2단계 시작");
                if(select()){
                    break;
                }
            case 3:
                System.out.println("3단계 시작");
                if(select()){
                     break;
                }
            case 4:
                System.out.println("4단계 시작");
                if(select()){
                    break;
                }
            case 5:
                System.out.println("마지막단계 시작");

        }
    }
}
