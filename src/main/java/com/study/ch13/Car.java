package com.study.ch13;

public class Car {
    private String serialNumber;
    private String model;

    public Car(String serialNumber, String model) {
        this.serialNumber = serialNumber;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "serialNumber='" + serialNumber + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
