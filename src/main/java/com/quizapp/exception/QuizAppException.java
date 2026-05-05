package com.quizapp.exception;

import lombok.Getter;

@Getter
public class QuizAppException extends RuntimeException {
    private final ErrorCode errorCode;
    private final int httpStatus;
    
    public QuizAppException(String message, ErrorCode errorCode, int httpStatus) {
        super(message);
        this.errorCode = errorCode;
        this.httpStatus = httpStatus;
    }
    
    public QuizAppException(String message, ErrorCode errorCode) {
        this(message, errorCode, 400);
    }
}
