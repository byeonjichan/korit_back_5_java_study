package com.study.ch13;
// Company 클래스를 싱글톤을 적용하여 구현하시오.

public class Company {
    private static Company instance;
    private String name;

    private Company() {}

    public static Company getInstance() {
        if(instance == null) {
            instance = new Company();
        }
        return instance;
    }
}
