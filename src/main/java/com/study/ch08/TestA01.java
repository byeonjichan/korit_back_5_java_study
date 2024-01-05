package com.study.ch08;

public class TestA01 {

    public static void main(String[] args) {
        int num = 10;
        int num2 = 20;
        int[] nums = new int[3]; // int배열은 0 , 자료형은 null

        TestB01 bClass = new TestB01(); //b클래스 객체 생성
        bClass.add(nums,num,num2); // 비클래스에서 애드라는 함수를 실행
        bClass.showArrayDatas(nums);

        bClass.add(nums, 20 ,40);
        bClass.showArrayDatas(nums);
    }
}
