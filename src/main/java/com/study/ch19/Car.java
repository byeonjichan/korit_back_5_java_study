package com.study.ch19;

import lombok.Builder;
import lombok.ToString;
// ** 시험 나옴 **
// @Builder
@ToString
public class Car {
    private String model;
    private String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public static CarBuilder builder() { //CarBuilder static 메소드를 리턴하는 builder 메소드
        return new CarBuilder();
    }

    public static class CarBuilder { // CarBuilder 클래스 생성
        private String model;
        private String color;

        public Car Build() {
            return new Car(model, color);
        }
        public CarBuilder model(String model) {
            this.model = model;
            return this;
        }
        public CarBuilder color(String color) {
            this.color = color;
            return this;
        }
    }
}
