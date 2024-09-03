package com.app.order.exception;

import lombok.Data;

@Data
public class ErrorResponse {

    public static final int BAD_REQUEST = 400;
    public static final int NOT_FOUND = 404;
    public static final int DUPLICATE = 409;
    public static final int STOAGE_EXCEEDED = 413;
    public static final int INTERNAL_SERVER_ERROR = 500;

    private int errorCode;
    private String message;

}
