package com.study.home;

public class Interface1 {
    public static void main(String[] args) {
        B b = new B();
        b.methodA();
        b.methodB();

    }
}

interface Ainter{
    int x=10; // 파이널 생략 가능
    final int y=20;
    abstract void methodA();
    void methodB(); //abstract 생략가능
}
class B implements Ainter{
    @Override
    public void methodA() {
        System.out.println("methodA()");
    }

    @Override
    public void methodB() {
        System.out.println("methodB()");
    }
}