package com.springboot.FXTrading.controller;

import java.text.DecimalFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.FXTrading.model.Trade;
import com.springboot.FXTrading.service.TradeService;

@RestController
@RequestMapping("trade")
public class TradeController {
	@Autowired
	TradeService service;
	
	// This method is responsible for booking trade by passing the values of customer name, currency pair, rate and amount
	
	@PostMapping("book")
	public Object bookTrade(@RequestBody Trade trade) {
		boolean isAdded = service.bookTrade(trade);
		if(isAdded) {
			return "Trade for " + trade.getCurrencyPair() +" has been booked with rate " + trade.getRate() 
					+". The amount of Rs " + formatAmount(trade.getAmount() * trade.getRate())
					+ "will be transferred in 2 working days to "+ trade.getCustomerName() +"..";
		}else {
			return "Trade not booked. Kindly enter the details properly\n"
					+ "Follow the following rules while entering details\n "
					+ "1.Currency pair must be USDINR \n"
					+ "2. Amount can't be zero or negative and can't exceed the trading limit";
		}
	}
	 private String formatAmount(double amount) {
	        DecimalFormat df = new DecimalFormat("##,##,##,##,##,##,##,##,##,##,##,##,##,##,##,###.00");
	        return "INR " + df.format(amount);
	    }
	 
	 // This method is responsible for list all the trades that has been booked
	@GetMapping("list")
	public ResponseEntity<Object> getAllTrades(){
		
		List<Trade> list = service.getAllTrade();
		if(list.isEmpty()) {
			return new ResponseEntity<Object>( HttpStatus.NO_CONTENT);
		}else {
			return new ResponseEntity<Object>( list,HttpStatus.FOUND);
		}
		
	}

}
