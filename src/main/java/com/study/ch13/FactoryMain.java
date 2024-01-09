package com.study.ch13;

import java.util.Scanner;

public class FactoryMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        FactoryService1 factoryService1 = new FactoryService1(scanner);
        FactoryService2 factoryService2 = new FactoryService2(scanner);

        factoryService1.create();
        factoryService2.create();


    }
}
