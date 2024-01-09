package com.study.ch13;
//싱글톤 사용하는 이유 - 유일한 객체를 하나만 만들어야 할 때 ,
public class TestMain {
    public static void main(String[] args) {
        A a = new A();
        A2 a2 = new A2();
        Company company = Company.getInstance();

        a.a(company);
        a2.a2(company);

    }
}
