package com.study.ch16;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ArrayService {
    private String[] strArray;

    public void add(String str) { // add 함수가 호출될때마다 새로운 배열
        String[] newArray = new String[strArray.length + 1];
        for(int i = 0; i < strArray.length; i++) {
            newArray[i] = strArray[i]; //반복이 다돌면 newArray 로 옮기는과정
        }
        strArray = newArray;

        strArray[strArray.length -1] = str; // 값 넣어줌
    }
    //기존보다 크기가 1적은 배열을 새로 만든다.
    //매개변수로 받은 인덱스의 값을 기준으로 적은 index들은 그대로 옮기고 큰 인덱스들은 -1하여 옮긴다.
    //strArray의 배열을 새로운 배열로 만든다.
    public void remove(int index) {
        String[] newArray = new String[strArray.length -1];
        for(int i =0; i < strArray.length; i++) {
            newArray[i] = strArray[i < index ? i : i + 1]; //i가 인덱스보다 작을경우 그대로 //작지않으면 i + 1
        }
        strArray = newArray;
    }

    //선형탐색 알고리즘
    public int indexOf(String str) {
        if(str == null) {
            return -1; }
        for(int i = 0; i < strArray.length; i++) {
            if(strArray[i].equals(str)) {
                return  i;
            }
        }
        return -1;
    }

    public String toString() {
        String result = "Array[ ";

        for (int i = 0; i < strArray.length; i++) {
            result += strArray[i];
            if(i < strArray.length - 1) {
                result += ", ";
            }
        }
        result +=" ]";

        return result;
    }

}
