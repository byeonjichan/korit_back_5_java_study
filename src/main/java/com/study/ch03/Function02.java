package com.study.ch03;

public class Function02 {

    // 매개변수 x , 리턴 x
    public static void fx01(){
        // void -> 비어있는 , 공허한
        System.out.println("fx01 함수 실행");
        System.out.println();
    }
    public static  void fx02(int age, String name){
        System.out.println("fx02 함수 실행");
        System.out.println("나이: "+ age);
        System.out.println("이름: "+ name);
        System.out.println();
    }
    public static  void fx02(String name, int age){
        System.out.println("fx02 함수 실행");
        System.out.println("이름: "+ name);
        System.out.println("나이: "+ age);
        System.out.println();
    } // 함수(메서드)의 오버로딩 ↑↑ (함수명이 같지만 매개변수의 자료형이 다르면 함수정의가 가능하다.)
    public static int fx03(){
        System.out.println("fx03 함수 실행");
        return 100;
    }
    public static String fx04(String name, int age) {
        return name + ", " + age;
    }
    public static void main(String[] args) {
        fx01();
        fx02(28,"변지찬");
        fx02("변지찬",28);
        int num = fx03();
        System.out.println(fx03());
        String result = fx04("변지찬" , 28);
        System.out.println(result);
    }
}
