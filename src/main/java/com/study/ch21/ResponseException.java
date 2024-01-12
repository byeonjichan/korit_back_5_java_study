package com.study.ch21;

import lombok.Getter;

import java.util.Map;
@Getter

public class ResponseException extends RuntimeException { //Exception 이 붙으면 무조건 예외 클래스
    private Map<String, Object> errorMap;

    public ResponseException(String message) {
        super(message);
    }

    public ResponseException(String message,Map<String, Object> errorMap ) {
        super(message);
        this.errorMap = errorMap;
    }
}
