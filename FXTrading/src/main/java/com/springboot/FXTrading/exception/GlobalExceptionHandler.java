package com.springboot.FXTrading.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(TradeAlreadyExistsException.class)
	public String tradeAlreadyExistsException(TradeAlreadyExistsException ex) {
		return ex.getMessage();
	}

	@ExceptionHandler(TradeNotExistsException.class)
	public String tradeNotExistsException(TradeNotExistsException ex) {
		return ex.getMessage();
	}
	
	@ExceptionHandler(InvalidTradeInfoException.class)
	public String invalidTradeInfoException(InvalidTradeInfoException ex) {
		return ex.getMessage();
	}

}
