package com.study.ch06;

public class Continue {
    public static void main(String[] args) {
        // 지금까지만 실행하고 다음반복으로 넘어감
        for(int i=0; i < 10; i++) {
            System.out.println("i: " +i);
            if(i % 2 !=0) {
                continue;
            }
            System.out.println("for문 마지막");
        }
    }
}
