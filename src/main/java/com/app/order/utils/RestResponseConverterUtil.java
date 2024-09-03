package com.app.order.utils;

public class RestResponseConverterUtil {

    public static <T> ResponseEntity<T> success(T response) {
	return new ResponseEntity<>(response);
    }

    public static <T> ResponseEntity<T> success(String statusCode, String message, T response) {
	return new ResponseEntity<T>(statusCode, message, response);
    }

}
