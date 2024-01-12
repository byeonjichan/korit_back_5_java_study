package com.study.ch14;

public class ObjectMain {
    public static void main(String[] args) {

        ObjectTest objectTest = new ObjectTest("변지찬","서구");
        System.out.println(objectTest.toString());
        System.out.println(objectTest); // Java 만 이상태로 호출시 동일하다

        ObjectTest objectTest1 = new ObjectTest("변지찬","서구");
        System.out.println(objectTest.equals(objectTest1));//instance 기준 메모리가 다르기 떄문에 다른 객체이다
        System.out.println(objectTest==objectTest1); // << 주소비교

        System.out.println(objectTest.getClass());
        System.out.println(objectTest1.getClass()); // instance of 대신 사용하려고 쓴다.
        System.out.println(ObjectTest.class); //static 으로 접근할땐 .class

        System.out.println(objectTest.hashCode()); //.hashCode() 10진수를 > 16진수로 바꿈 실제, 메모리 주소 값
        System.out.println(objectTest1.hashCode());
    }
}
