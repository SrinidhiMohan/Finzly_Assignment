package com.finzly.fxtradingmicroservice.exceptions;

public class TradeListNotAvailableException extends RuntimeException {
	TradeListNotAvailableException(String message){
		super(message);
	}
	TradeListNotAvailableException(){
		super();
	}
}
