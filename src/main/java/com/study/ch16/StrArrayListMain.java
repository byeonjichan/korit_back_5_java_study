package com.study.ch16;

import java.util.ArrayList;

public class StrArrayListMain {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("a");
        strList.add("b");
        strList.add("c");
        strList.add("d");

        System.out.println(strList);
        System.out.println(strList.get(1));
        System.out.println(strList.indexOf("c"));
        strList.remove(1);
        System.out.println(strList);
    }
}
