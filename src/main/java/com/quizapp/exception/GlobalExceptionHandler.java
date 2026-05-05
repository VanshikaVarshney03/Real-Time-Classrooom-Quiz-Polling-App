package com.quizapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {
    
    @ExceptionHandler(QuizAppException.class)
    public ResponseEntity<ErrorResponse> handleQuizAppException(QuizAppException ex, WebRequest request) {
        ErrorResponse errorResponse = ErrorResponse.builder()
            .errorCode(ex.getErrorCode().getCode())
            .message(ex.getMessage())
            .timestamp(System.currentTimeMillis())
            .path(request.getDescription(false).replace("uri=", ""))
            .build();
        
        HttpStatus status = HttpStatus.BAD_REQUEST;
        if (ex.getHttpStatus() == 404) {
            status = HttpStatus.NOT_FOUND;
        } else if (ex.getHttpStatus() == 409) {
            status = HttpStatus.CONFLICT;
        } else if (ex.getHttpStatus() == 400) {
            status = HttpStatus.BAD_REQUEST;
        }
        
        return new ResponseEntity<>(errorResponse, status);
    }
    
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleGlobalException(Exception ex, WebRequest request) {
        ErrorResponse errorResponse = ErrorResponse.builder()
            .errorCode(ErrorCode.INTERNAL_SERVER_ERROR.getCode())
            .message("An unexpected error occurred: " + ex.getMessage())
            .timestamp(System.currentTimeMillis())
            .path(request.getDescription(false).replace("uri=", ""))
            .build();
        
        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
