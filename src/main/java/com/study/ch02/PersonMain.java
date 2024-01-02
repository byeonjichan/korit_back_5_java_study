package com.study.ch02;

public class PersonMain {

    public static void main(String[] args) {
        Person p = new Person();
        // int a = 10;
        p.name = "김준일";
        p.age = 30;

        Person p2 = new Person();
        p2.name = "김준이";
        p2.age = 31;
        //참조 자료형
        System.out.println("이름:"+ p.name);
        System.out.println("나이:"+p.age);
        System.out.println("이름:"+p2.name);
        System.out.println("나이:"+p2.age);


    }
}
