package com.app.order.constants;

public interface APIConstants {

    String ORDER = "/order";

    public static interface HeaderConstants {

	String USER_ID = "User-Id";

    }

    public static interface CommonAPIConstants {

	String CREATE = "/create";
	String GET = "/get";
	String UPDATE = "/update";
	String DELETE = "/delete";
	String ID = "/{id}";
	String ALL = "/all";

    }

}
