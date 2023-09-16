package com.finzly.fxtradingmicroservice.exceptions;

public class CcyAlreadyExistsException extends RuntimeException{
	CcyAlreadyExistsException(String message){
		super(message);
	}
	CcyAlreadyExistsException(){
		super();
	}
}
