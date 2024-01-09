package com.study.ch10;

// [ 추상화 ] (공통점을 뽑아낸다)
//1. 추상 클래스 - abstract class
//2. 인터페이스 - interface
public abstract class ElectronicDevice {
    boolean powerState;

    void setPowerOn() {
        powerState = true;
    }
    void setPowerOff() {
        powerState = false;
    }
    abstract void showDeviceState(); //(추상 메소드)- 인터페이스와 추상클래스에서만 적용 일반클래스 사용x/ 중괄호 지우고 세미클론을 붙임
}

