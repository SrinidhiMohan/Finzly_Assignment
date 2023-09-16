package com.finzly.fxtradingmicroservice.exceptions;

public class IdNotAvailableException extends RuntimeException {
	IdNotAvailableException(String message){
		super(message);
	}
	IdNotAvailableException(){
		super();
	}
}
