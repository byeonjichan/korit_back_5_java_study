package com.study.ch06;

public class For01 {
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++) {
            //초기문 , 조건문 , 후처리문
            System.out.println("i: "+i);
        }
        // for 반복횟수가 정해져있고 일정간격으로 반복되면서 증가될때(반복횟수 중심)
        // while (조건 중심)
        int i = 0;
        while(i < 10) {
            System.out.println("i: "+i);
            i++;
        }
    }
}
