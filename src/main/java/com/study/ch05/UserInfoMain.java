package com.study.ch05;

import java.util.Scanner;

public class UserInfoMain {
    public static void main(String[] args) {
        //이름 : 김준일
        //나이: 31
        //연락처 :01099881916
        //학년 : 4
        //주소 :부산 동래구

        Scanner scanner = new Scanner(System.in);
        System.out.print("이름: ");
        String name = scanner.next();

        System.out.print("나이: ");
        int age = scanner.nextInt();

        System.out.print("연락처: ");
        String phone = scanner.next();

        System.out.print("학년: ");
        int grade = scanner.nextInt();

        System.out.print("주소: ");
        scanner.nextLine();
        String address = scanner.nextLine();

        System.out.println("이름: "+ name);
        System.out.println("나이: "+ age);
        System.out.println("연락처: "+ phone );
        System.out.println("학년: "+ grade);
        System.out.println("주소: "+ address);
    }
}
