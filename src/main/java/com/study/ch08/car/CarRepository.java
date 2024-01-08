package com.study.ch08.car;
// 데이터베이스 연결, 배열을 가지고 있어야함.
public class CarRepository {
    final Car[] cars; //저 값이 final 파이널을 붙여준다

    CarRepository(Car[] cars){
        this.cars = cars;
    }
    int getEmptyIndex() {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == null) {
                return i;
            }
        }
            return -1;
        }


        void insert (Car car){
            cars[getEmptyIndex()] = car;
        }
        Car[] getCarDatas() {
            int carCount = 0;
            for (int i = 0; i < cars.length; i++) {
                if (cars[i] != null) {
                    carCount++;
                }
            }
            Car[] newCars = new Car[carCount];
            int j = 0;
            for (int i = 0; i < cars.length; i++) {
                if(cars[i] != null) {
                    newCars[j] = cars[i];
                    j++;
            }
        }
            return newCars;
    }
}
