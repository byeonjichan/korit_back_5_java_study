package com.study.ch21;

import java.util.ArrayList;
import java.util.List;

public class ExceptionMain2 {
    public static void main(String[] args) {

        List<String> nameList = new ArrayList<>();
        nameList.add("김준일");
        nameList.add("김준이");
        nameList.add(null);
        nameList.add("김준사");

        try {
            for (int i = 0; i < 5; i++) {
                String name = nameList.get(i);
                    if (name.equals("김준사")) {
                        System.out.println("김준사를 찾음");
                        }
                    }
                } catch (NullPointerException e) {
                } catch (IndexOutOfBoundsException e) {
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                System.out.println("이거는 무조건 실행됨");
                }
                System.out.println("프로그램 정상 종료");
    }
}


