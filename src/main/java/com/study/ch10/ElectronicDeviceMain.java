package com.study.ch10;

public class ElectronicDeviceMain {
    public static void main(String[] args) {
        new RemoteController(); // 자체로 객체 생성됨

        ElectronicDevice electronicDevice = new ElectronicDevice() {

            // 익명클래스
            @Override
            void showDeviceState() {
                System.out.println("첫번째 기기 상태확인");
            }
        }; // 새로운 클래스를 재정의한것

        ElectronicDevice electronicDevice2 = new ElectronicDevice() {
            @Override
            void showDeviceState() {
                System.out.println("두번째 기기 상태확인");
            }
        };
        RemoteController remoteController = new RemoteController();

        ElectronicDevice[] electronicDevices =new ElectronicDevice[3];
        electronicDevices[0] = electronicDevice;
        electronicDevices[1] = electronicDevice2;
        electronicDevices[2] = remoteController;

        for(int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i].showDeviceState();
        }
    }
}
