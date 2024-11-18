package com.mojh.coffeeorder.common.exception;

import lombok.Getter;

@Getter
public class ErrorResponse<T> {
    private final String code;
    private final T message;

    private ErrorResponse(String code, T message) {
        this.code = code;
        this.message = message;
    }

    public static ErrorResponse of(CoffeeOrderAppException ex) {
        return new ErrorResponse(ex.getErrorCode().getCode(), ex.getErrorCode().getMessage());
    }

    public static ErrorResponse of(ErrorCode errorCode) {
        return new ErrorResponse(errorCode.getCode(), errorCode.getMessage());
    }

    public static <T> ErrorResponse of(ErrorCode errorCode, T message) {
        return new ErrorResponse(errorCode.getCode(), message);
    }

    public static <T> ErrorResponse of(String code, T message) {
        return new ErrorResponse(code, message);
    }

    public static <T> ErrorResponse of(T message) {
        return new ErrorResponse(null, message);
    }

}