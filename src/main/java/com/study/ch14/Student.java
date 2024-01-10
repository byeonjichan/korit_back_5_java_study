package com.study.ch14;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
//@Setter  @Data 한개에 다들어가있음
//@Getter
//@EqualsAndHashCode
//@ToString

public class Student {
    private String name;
    private String phone;
    private String addresss;
    private int age;
}
