package com.study.ch18;

public class AdditionImpl implements Addition {

    @Override // 재정의를 하면서 변수명은 상관 x  자료형이 중요!!
    public int add(int x, int y) {
        System.out.println("AdditionImpl 에서 호출한 add 메소드");
        return x + y;
    }
}
