package com.app.order.exception;

import java.util.ArrayList;
import java.util.List;

public class OrderException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private List<ErrorResponse> errorResponses = new ArrayList<>();

    public OrderException() {
	super();
    }

    public OrderException(String message) {
	super(message);
    }

    public OrderException(String message, Throwable cause) {
	super(message, cause);
    }

    public OrderException(ErrorResponse errorResponse) {
	this();
	addErrorResponse(errorResponse);
    }

    public OrderException(String message, ErrorResponse errorResponse) {
	super(message);
	addErrorResponse(errorResponse);
    }

    public void addErrorResponse(ErrorResponse errorResponse) {
	errorResponses.add(errorResponse);
    }

    public List<ErrorResponse> getErrorResponses() {
	return errorResponses;
    }

}
