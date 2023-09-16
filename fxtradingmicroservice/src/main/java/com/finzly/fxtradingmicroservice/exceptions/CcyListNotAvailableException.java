package com.finzly.fxtradingmicroservice.exceptions;

public class CcyListNotAvailableException extends RuntimeException {
	CcyListNotAvailableException(String message){
		super(message);
	}
	CcyListNotAvailableException(){
		super();
	}
	

}
