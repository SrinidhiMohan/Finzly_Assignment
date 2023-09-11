package com.springboot.FXTrading.exception;

public class TradeAlreadyExistsException extends RuntimeException {

	public TradeAlreadyExistsException(String msg) {
		super(msg);
	}
	
}
