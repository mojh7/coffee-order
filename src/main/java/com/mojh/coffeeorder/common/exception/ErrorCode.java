package com.mojh.coffeeorder.common.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.*;

@Getter
public enum ErrorCode {

    // common
    COMMON_INTERNAL_SERVER_ERROR(INTERNAL_SERVER_ERROR, "COM0000", "시스템 오류입니다."),
    COMMON_BAD_REQUEST(BAD_REQUEST, "COM0001", "잘못된 요청입니다."),
    COMMON_INVALID_PARAMETERS(BAD_REQUEST, "COM0002", "유효하지 않은 파라미터입니다.");

    private final HttpStatus status;
    private final String code;
    private final String message;

    ErrorCode(HttpStatus status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }

}
