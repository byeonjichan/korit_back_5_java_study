package com.study.home;

public class StringCompareExample {
    public static void main(String[] args) {

        String sentence1 = "사과";
        String sentence2 = new String("사과");
        String sentence3 = "망고";

        System.out.println(sentence1.equals(sentence2));
        System.out.println(sentence2.equals(sentence3));
    }
}
// 다음 코드에서 컴파일 에러가 발생하는곳을 찾아 수정해보세요