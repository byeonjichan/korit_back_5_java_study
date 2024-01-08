package com.study.ch08.car;

import java.util.spi.AbstractResourceBundleProvider;

// CarRepository 의 데이터를 가지고 로직을 만듬 , CarRepository를 가져와야한다.
public class CarService {
    CarRepository carRepository;

    //생성자는 리턴자료형,값이없다 .
    CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    boolean isFull() {
        return carRepository.getEmptyIndex() == -1;
    }
        void  append(Car car) {
            carRepository.insert(car);
            }
        void printCarList() {
            Car[] cars = carRepository.getCarDatas();
            if(cars.length == 0) {
                System.out.println("등록된 차량이 없습니다.");
                return;
            }
            for(int i = 0; i < cars.length; i++) {
                System.out.println(cars[i].toString());
        }
    }
}




