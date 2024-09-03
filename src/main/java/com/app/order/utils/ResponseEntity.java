package com.app.order.utils;

import java.util.ArrayList;
import java.util.List;

import com.app.order.exception.ErrorResponse;

import lombok.Data;

@Data
public class ResponseEntity<T> {

    private String statusCode;

    private String message;

    private T response;

    private List<ErrorResponse> errorResponse = new ArrayList<>();

    private String requestId;

    private static final String SUCCESS_STATUS_CODE = "200";
    private static final String SUCCESS_STATUS_MSG = "OK";
    private static final String ERROR_STATUS_CODE = "500";
    private static final String ERROR_STATUS_MSG = "Internal Server Error";

    public ResponseEntity(T response) {
	this(SUCCESS_STATUS_CODE, SUCCESS_STATUS_MSG, response);
    }

    public ResponseEntity(String statusCode, String message, T response) {
	super();
	this.statusCode = statusCode;
	this.message = message;
	this.response = response;
    }
}
