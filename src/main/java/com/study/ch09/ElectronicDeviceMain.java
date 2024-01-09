package com.study.ch09;

public class ElectronicDeviceMain {

    public static void main(String[] args) {
        ElectronicDevice[] electronicDevice = new ElectronicDevice[10];


        for (int i = 0; i < electronicDevice.length; i++) {
            electronicDevice[i] = i % 2 == 0 ? new Computer() : new SmartPhone();
        }
        for (int i = 0; i < electronicDevice.length; i++) {
            electronicDevice[i].showDeviceState();
        }

        System.out.println();

        for (int i = 0; i < electronicDevice.length; i++) {
            electronicDevice[i].setPowerOn();
        }
        System.out.println();

        for (int i = 0; i < electronicDevice.length; i++) {
            electronicDevice[i].showDeviceState();
        }
        for (int i =0; i < electronicDevice.length; i++) {
            if(electronicDevice[i] instanceof Computer) { //<< 다운캐스팅 후 메소드 호출을 한 코드
            Computer computer = (Computer) electronicDevice[i];
            computer.playGame();
            }  else if (electronicDevice[i] instanceof SmartPhone) {
                SmartPhone smartPhone = (SmartPhone) electronicDevice[i];
                smartPhone.call();
            }
        }
    }
}
