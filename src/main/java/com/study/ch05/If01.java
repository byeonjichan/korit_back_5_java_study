package com.study.ch05;

public class If01 {
    public static void main(String[] args) {
        //조건문
        int i = 2;

        if(i > 3) {
            System.out.println("i가 3보다 큽니다.");
            System.out.println("if문 종료");
        } else if(i == 3) {
                System.out.println("i가 3입니다.");
        } else {
            System.out.println("i가 3보다 작습니다.");
        }
        String tempsStr = i > 3 ? print("i가 3보다 큽니다") : "";
    }

    public static String print(String str){
        System.out.println(str);
        return str;
    }

}
