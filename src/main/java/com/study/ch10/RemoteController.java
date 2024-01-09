package com.study.ch10;

public class RemoteController extends ElectronicDevice{

    @Override // ctrl+i 무조건 재정의 해야하는 것 단축키 , ctrl+o 오버라이드+오브젝트 단축키
    void showDeviceState() {
        System.out.println("리모컨의 상태를 확인합니다.");
    }
}
