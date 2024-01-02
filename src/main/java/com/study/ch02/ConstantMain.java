package com.study.ch02;

public class ConstantMain {
    public static void main(String[] args) {
        // 상수
        // 대문자로만 표기한다.
        // 최초 한번만 대입이 가능하다.
        // 무조건 초기화가 되어야 한다.
        final String FILE_PATH = "c:/aws/project";
        System.out.println(FILE_PATH);
    }
}
