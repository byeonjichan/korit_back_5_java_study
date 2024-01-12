package com.study.ch19;

public class BuilderMain {
    public static void main(String[] args) {
        //빌더 패턴
//        Car car = Car.builder() //.builder(static 메소드)  /객체 생성
//                .color("블랙")
//                .model("아반떼")
//                .build();
        Car.CarBuilder carBuilder =Car.builder(); // Car 클래스 안에 CarBuilder 생성자를 생성
        Car car2 = carBuilder.Build();

        Car car = Car.builder().model("아반떼").color("블랙").Build();

        System.out.println(car);

        Member member = Member.builder().name("ㅇ").phone("0100000").build();
    }

}
