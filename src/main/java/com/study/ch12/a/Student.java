package com.study.ch12.a;

import com.study.ch05.Input;

public class Student {
    private String name;
    private String address;


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public Student() {

    }
    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void  setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void test() {

    }
    private int add(int a,int b) {
        return a + b;
    }


}
