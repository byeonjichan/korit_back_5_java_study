package com.study.ch20;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Status {
    OK(200,"정상적인 요청"),
    BADREQUEST(400,"비정상 적인 요청");

    private int code;
    private String statusName;
}
