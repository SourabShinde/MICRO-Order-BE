package com.app.order.utils;

import org.springframework.util.StringUtils;

public class Utilities {

    public static boolean isNotBlank(String string) {
	return StringUtils.hasText(string);
    }

}
