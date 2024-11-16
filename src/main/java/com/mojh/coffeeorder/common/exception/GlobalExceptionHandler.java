package com.mojh.coffeeorder.common.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConversionException;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static com.mojh.coffeeorder.common.exception.ErrorCode.COMMON_BAD_REQUEST;
import static com.mojh.coffeeorder.common.exception.ErrorCode.COMMON_INTERNAL_SERVER_ERROR;
import static com.mojh.coffeeorder.common.exception.ErrorCode.COMMON_INVALID_PARAMETERS;
import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.METHOD_NOT_ALLOWED;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CoffeeOrderAppException.class)
    public ResponseEntity<ErrorResponse<?>> handleCustomException(CoffeeOrderAppException ex) {
        logError(ex);
        return ResponseEntity.status(ex.getErrorCode().getStatus())
                             .body(ErrorResponse.of(ex));
    }

    @ResponseStatus(BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse<?>> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult()
          .getAllErrors()
          .forEach(error -> errors.put(((FieldError) error).getField(), error.getDefaultMessage()));
        logError(ex);

        return ResponseEntity.status(COMMON_INVALID_PARAMETERS.getStatus())
                             .body(ErrorResponse.of(COMMON_INVALID_PARAMETERS, errors));
    }

    @ExceptionHandler(BindException.class)
    public ResponseEntity<ErrorResponse<?>> handleBindException(BindException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult()
          .getAllErrors()
          .forEach(error -> {
              if (error instanceof FieldError) {
                  FieldError fieldError = (FieldError) error;
                  if(fieldError.isBindingFailure()) {
                      errors.put(fieldError.getField(), COMMON_INVALID_PARAMETERS.getMessage());
                  } else {
                      errors.put(fieldError.getField(), fieldError.getDefaultMessage());
                  }
              } else {
                  errors.put(error.getObjectName(), error.getDefaultMessage());
              }
          });
        logError(ex);

        return ResponseEntity.status(COMMON_INVALID_PARAMETERS.getStatus())
                             .body(ErrorResponse.of(COMMON_INVALID_PARAMETERS, errors));
    }

    @ExceptionHandler(HttpMessageConversionException.class)
    public ResponseEntity<ErrorResponse<String>> handleHttpMessageConversionException(HttpMessageConversionException ex) {
        logError(ex);
        return ResponseEntity.status(COMMON_BAD_REQUEST.getStatus())
                             .body(ErrorResponse.of(COMMON_BAD_REQUEST));
    }

    @ResponseStatus(BAD_REQUEST)
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ErrorResponse<String>> handleIllegalArgumentException(IllegalArgumentException ex) {
        logError(ex);
        return ResponseEntity.status(COMMON_BAD_REQUEST.getStatus())
                             .body(ErrorResponse.of(COMMON_BAD_REQUEST));
    }

    @ResponseStatus(BAD_REQUEST)
    @ExceptionHandler(IllegalStateException.class)
    public ResponseEntity<ErrorResponse<String>> handleIllegalStateException(IllegalStateException ex) {
        logError(ex);
        return ResponseEntity.status(COMMON_BAD_REQUEST.getStatus())
                             .body(ErrorResponse.of(COMMON_BAD_REQUEST));
    }

    @ResponseStatus(BAD_REQUEST)
    @ExceptionHandler(IllegalAccessException.class)
    public ResponseEntity<ErrorResponse<String>> handleIllegalAccessException(IllegalAccessException ex) {
        logError(ex);
        return ResponseEntity.status(COMMON_BAD_REQUEST.getStatus())
                             .body(ErrorResponse.of(COMMON_BAD_REQUEST));
    }

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public ResponseEntity<ErrorResponse<?>> handleHttpRequestMethodNotSupportedException
            (HttpRequestMethodNotSupportedException ex) {
        logError(ex);
        Set<HttpMethod> supportedMethods = ex.getSupportedHttpMethods();

        if (supportedMethods == null) {
            return ResponseEntity.status(METHOD_NOT_ALLOWED)
                                 .body(ErrorResponse.of(ex.getMessage()));
        }

        return ResponseEntity.status(METHOD_NOT_ALLOWED)
                             .allow(supportedMethods.toArray(HttpMethod[]::new))
                             .body(ErrorResponse.of(ex.getMessage()));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse<String>> handleException(Exception ex) {
        logError(ex, COMMON_INTERNAL_SERVER_ERROR.name());
        return ResponseEntity.status(COMMON_INTERNAL_SERVER_ERROR.getStatus())
                             .body(ErrorResponse.of(COMMON_INTERNAL_SERVER_ERROR));
    }

    private void logError(Exception ex) {
        log.error(ex.getClass().getSimpleName(), ex);
    }

    private void logError(Exception ex, String detailMessage) {
        String message = String.format("%s (%s) ", ex.getClass()
                                                     .getSimpleName(), detailMessage);
        log.error(message, ex);
    }
}
