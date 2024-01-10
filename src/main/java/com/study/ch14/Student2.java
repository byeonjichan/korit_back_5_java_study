package com.study.ch14;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor //필수 ArgsConstructor 생성 / N0ArgsConstructor 랑은 사용이 안된다
@Data

public class Student2 {
    private final String name; // final 은 setter 쓸 수 없음
    private String address;
    @NonNull // null 만 아니면 된다 / setter 로 값 바꿀수있음
    private String phone;

}
