package com.study.home;
public class ShapeMain {
    public static void main(String[] args) {
            Shape shapes[] = new Shape[3];
            //부모의 객체배열 요소에 자식값 넣기 -> 업캐스팅
            shapes[0]=new Rect();
            shapes[1]=new Circle();
            shapes[2]=new Line();

            for (int i = 0; i<3; i++) {
                shapes[i].drow();
                //쉐이프에 있는 각각의 드로우 호출
                //상속받는 자식클래스가 오버라이딩한 메소드만 호출할수있다
        }
    }
}
abstract class Shape{
    abstract void drow();
}class Rect extends Shape{
    void drow() {
        System.out.println("사각형을 그리다");
    }
}class Circle extends Shape{
    void drow() {
        System.out.println("원을 그리다");
    }
}class Line extends Shape{
    void drow() {
        System.out.println("선을 그리다");
    }
}
