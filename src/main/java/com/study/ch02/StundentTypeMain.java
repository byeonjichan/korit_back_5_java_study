package com.study.ch02;

public class StundentTypeMain {
    public static void main(String[] args) {
        StudentType b = new StudentType();
        b.name = "김준일";
        b.studentYeal = 1;
        b.address="부산 동래구";
        System.out.println("이름 :" + b.name);
        System.out.println("학년 :" + b.studentYeal + "학년");
        System.out.println("주소 :" + b.address);

//        Person 전주환 = new Person();
//        StudentType 전주환학생 = (StudentType) 전주환;
        StudentType 전주환학생 = new StudentType();
        Person 전주환사람 = 전주환학생;
        StudentType 전주환학생2 = (StudentType) 전주환사람;


    }
}
