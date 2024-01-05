package com.study.ch07;

public class UserMain01 {
    public static void main(String[] args) {
        User01 user1 = new User01("aaa", "1234");
        User01 user2 = new User01("bbb", "1234", "김준이", "skjil1218@gmail.com");

        user1.showInfo();
        user2.showInfo();

        user1.setName("변지찬");
        user1.setEmail("jaekyong14@naver.com");

        user1.showInfo();


    }
}
