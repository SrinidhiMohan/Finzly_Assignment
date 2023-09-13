package com.springboot.FXTrading.exception;

public class TradeNotExistsException extends RuntimeException {

	public TradeNotExistsException(String msg) {
		super(msg);
	}
}
