package com.study.ch08.car;

import javax.imageio.plugins.tiff.BaselineTIFFTagSet;
import java.nio.charset.Charset;
import java.util.Scanner;

public class CarMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String selecteedMenu = null;
        boolean loopFlag = true;

        Car[] cars = new Car[3];
        CarRepository carRepository = new CarRepository(cars);
        CarService carService = new CarService(carRepository);

        while(loopFlag) {
            System.out.println("자동차 관리 프로그램");
            System.out.println("1. 자동차 등록");
            System.out.println("2. 자동차 조회");
            System.out.println("q. 프로그램 종료");
            System.out.println("메뉴 선택>>");
            selecteedMenu = scanner.nextLine();
            if("q".equalsIgnoreCase(selecteedMenu)) {
                System.out.println("프로그램을 종료중..."); //만약 q와 같다면 프로그램 종료<< equalsIgnore <<대소문자 구분없이
                loopFlag = false;

            } else if ("1".equals(selecteedMenu)){
                System.out.println("<<< 자동차 등록 페이지 >>>");
                int emptyCount = 0;

                String model = null;
                String color = null;

                for(int i =0; i < cars.length; i++) {
                    if(cars[i] == null) {
                        emptyCount++;
                    }
                }
                if(carService.isFull()) {
                    System.out.println("더이상 등록할 수 없습니다.");
                    continue;
                }
                System.out.print("모델명 >>> ");
                model = scanner.nextLine();
                System.out.print("색상 >>> ");
                color = scanner.nextLine();

                Car car = new Car(model , color); // entity
                carService.append(car);


            } else if ("2".equals(selecteedMenu)) {
                System.out.println("<<< 자동차 조회 페이지 >>>");
                carService.printCarList();

            } else {
                System.out.println("다시 입력하세요.");
            }
        }
        System.out.println("프로그램이 종료되었습니다.");
    }

}
