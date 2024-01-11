package com.study.ch17;

import java.util.HashMap;

public class HashMapMain {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("1번학생","김준일");
        map.put("2번학생","김준일");
        map.put("3번학생","김준일");
        map.put("4번학생","김준일");

        System.out.println(map);
        System.out.println(map.get("3번학생"));

    }
}
