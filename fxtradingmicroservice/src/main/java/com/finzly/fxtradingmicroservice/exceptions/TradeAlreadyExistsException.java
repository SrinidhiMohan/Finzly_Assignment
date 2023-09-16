package com.finzly.fxtradingmicroservice.exceptions;

public class TradeAlreadyExistsException extends RuntimeException {
	TradeAlreadyExistsException(String message){
		super(message);
	}
	TradeAlreadyExistsException(){
		super();
	}
}
