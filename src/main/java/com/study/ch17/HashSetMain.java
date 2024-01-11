package com.study.ch17;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class HashSetMain {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet();
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("김준일");
        nameList.add("김준일");
        nameList.add("김준이");
        nameList.add("김준이");


        System.out.println(nameList); //중복제거 로직으로 활용
        names.addAll(nameList); //둘다 컬렉션을 상속 받고있어서 사용가능하다.
        System.out.println(names);

        ArrayList<String> newNameList = new ArrayList<>();
        newNameList.addAll(names);
        System.out.println(newNameList.get(1));

            String findName =null;
            for(String name : names) {
                if(name.equals("김준삼")){
                    findName = name;
                    break;
                }
            }
        System.out.println(findName);
    }
}
