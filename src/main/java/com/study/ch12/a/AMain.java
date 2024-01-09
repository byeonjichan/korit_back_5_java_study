package com.study.ch12.a;

public class AMain {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("김준일");
        System.out.println(student.getName());  //값을 가져올때
        student.setAddress(" ");
        System.out.println(student.getAddress());
    }
}
