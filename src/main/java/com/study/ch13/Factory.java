package com.study.ch13;

public class Factory {
                                // 팩토리 클래스가 유일한 클래스여야 하므로 <<
    private String factoryName; // 자기 자신 클래스를 스태틱 변수(instance)로 가지고 있어야한다.
    private static Factory instance;
    private int autoCount;
    private final int DEFAULT_NUMBER = 20240000;
    // 생성자는 private으로 외부 생성을 막아준다.
    private Factory() {
    }

    public static Factory getInstance() {
        if(instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public Car produce(String model) {
        autoCount++;
        return new Car(Integer.toString(DEFAULT_NUMBER + autoCount) , model);
    }
    @Override
    public String toString() {
        return "Factory{" +
                "factoryName='" + factoryName + '\'' +
                ", autoCount=" + autoCount +
                ", DEFAULT_NUMBER=" + DEFAULT_NUMBER +
                '}';
    }
}
