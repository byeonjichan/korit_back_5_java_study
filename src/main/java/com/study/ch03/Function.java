package com.study.ch03;

public class Function {
    public static void main(String[] args) {
        System.out.println(fx1(1,2,3,4,5)); //함수 호출 (콜)
        fx2("김준일");
        fx3();
    }

    //함수 정의
    static int fx1(int a ,int b, int c , int d, int e){
        return a + b * c - d * e;
    }

    static void fx2(String name){
        System.out.println("이름은 "+ name +" 입니다.");
    }

    static void fx3(){

        }

}


