package com.springboot.FXTrading.controller;

import java.text.DecimalFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.FXTrading.exception.TradeAlreadyExistsException;
import com.springboot.FXTrading.exception.TradeNotExistsException;
import com.springboot.FXTrading.model.Trade;
import com.springboot.FXTrading.service.TradeService;

@RestController
@RequestMapping("trade")
public class TradeController {
	@Autowired
	TradeService service;

	// This method is responsible for booking trade by passing the values of
	// customer name, currency pair, rate and amount

	@PostMapping("book")
	public Object bookTrade(@RequestBody Trade trade) {
		boolean isAdded = service.bookTrade(trade);
		if (isAdded) {
			return trade.toString();
		} else {
			throw new TradeAlreadyExistsException("Trade Already Exixts");
		}
	}

	// This method is responsible for list all the trades that has been booked
	@GetMapping("list")
	public ResponseEntity<Object> getAllTrades() {

		List<Trade> list = service.getAllTrade();
		if (!list.isEmpty()) {
			return new ResponseEntity<Object>(list,HttpStatus.FOUND);
		} else {
			throw new TradeNotExistsException("Trade Not Exists");
		}

	}

}
