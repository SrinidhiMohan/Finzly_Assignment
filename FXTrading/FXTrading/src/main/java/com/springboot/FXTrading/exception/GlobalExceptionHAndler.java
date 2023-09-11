package com.springboot.FXTrading.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHAndler {

	
	@ExceptionHandler(TradeNotExistsException.class)
	public String tradeNotExistsExcption(TradeNotExistsException ex) {
		return ex.getMessage();
	}
	@ExceptionHandler(TradeAlreadyExistsException.class)
	public String tradeAlreadyExistsExcption(TradeAlreadyExistsException ex) {
		return ex.getMessage();
	}
	
}
