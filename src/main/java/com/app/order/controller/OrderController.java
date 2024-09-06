package com.app.order.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.order.constants.APIConstants;
import com.app.order.constants.APIConstants.CommonAPIConstants;
import com.app.order.utils.ResponseEntity;
import com.app.order.utils.RestResponseConverterUtil;

@RestController
@RequestMapping(APIConstants.ORDER)
public class OrderController {
    
    @PostMapping(CommonAPIConstants.CREATE)
    public ResponseEntity<?> placeOrder(){
	return new RestResponseConverterUtil().success(null);
    }

}
