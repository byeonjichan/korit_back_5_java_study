package com.study.ch10;
//인터페이스는 기본적으로 추상메소드이다 . 다중상속이 가능하다.
public interface Power {
    boolean powerState = false;
    //변수 선언 불가 / 모든 선언이 상수 (final)
    String ERROR_CODE ="-9999";

    void setPowerOn();
    void setPowerOff();

    //반대로 default를 붙이면 일반메소드 생성.
    default void test() {

    }
}
