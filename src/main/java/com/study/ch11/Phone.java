package com.study.ch11;

public class Phone {
    static int autoCount = 0;
    int serialNumber;

    @Override //함수화 시키는것.
    public String toString() {
        return "Phone{" +
                "serialNumber=" + serialNumber +
                ", company=" + company.toString();
    }

    Company company;

    public Phone(Company company) {
        autoCount++;
        this.serialNumber = 20240000;
        this.serialNumber += autoCount;
        this.company = company;
    }
}
