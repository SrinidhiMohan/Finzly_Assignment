package com.finzly.fxtradingmicroservice.exceptions;

import org.springframework.stereotype.Component;

@Component
public class GlobalExceptionHandler {

	// This exception is thrown when we are trying to add already existing ccy data
	public static void getCcyAlreadyExistsException(String message) {
		throw new CcyAlreadyExistsException(message);
	}

	// This exception is thrown when we are trying to fetch ccy data when no ccy is
	// present
	public static void getCcyListNotAvailableException(String message) {
		throw new CcyListNotAvailableException(message);
	}

	// This exception is thrown when we are trying to insert id which is already
	// existing or trying to delete a id which is not existing
	public static void getIdNotAvailableException(String message) {
		throw new IdNotAvailableException(message);
	}

	// This exception is thrown when same trade is booked twice
	public static void getTradeAlreadyExistsException(String message) {
		throw new TradeAlreadyExistsException(message);
	}

	// This exception is thrown when we try to get all trades when there no trade is
	// already available.
	public static void getTradeListNotAvailableException(String message) {
		throw new TradeListNotAvailableException(message);
	}
}
