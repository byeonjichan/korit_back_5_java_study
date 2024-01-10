package com.study.ch16;

public class ArrayMain {
    public static void main(String[] args) {
        String[] initStrArray = new String[0];
        ArrayService arrayService = new ArrayService(initStrArray);
        arrayService.add("변지찬1");
        arrayService.add("변지찬2");
        arrayService.add("변지찬3");
        arrayService.add("변지찬4");
        arrayService.add("변지찬5");

        System.out.println(arrayService.toString());

        System.out.println(arrayService.indexOf("변지찬3"));
    }
}
