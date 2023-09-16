package com.finzly.fxtradingmicroservice.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.finzly.fxtradingmicroservice.entity.ccydata;
import com.finzly.fxtradingmicroservice.entity.exchangedata;
import com.finzly.fxtradingmicroservice.service.FxtradingMicroserviceService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class FxtradingMicroserviceController {
	
	Logger logger = LoggerFactory.getLogger(FxtradingMicroserviceController.class);

	@Autowired
	FxtradingMicroserviceService fxtradingservice;

	
	// @Author: Srinidhi Mohan : Add ccy data in db
	@PostMapping("addCcyData")
	public String addCcyData(@RequestBody ccydata ccydata) {
		logger.info("Adding ccy data into database");
		return fxtradingservice.addCcyData(ccydata);
	}
	// @Author: Srinidhi Mohan : gets all currency pair from db if not exists then throws ccy list not available exception
	@GetMapping("getAllCurrencyPair")
	public List<ccydata> getAllCurrencyPair() {
		logger.info("Fetching all Currency pair from database");
		return fxtradingservice.getAllCurrencyPair();

	}
    //@Author: Srinidhi Mohan: gets all trades that happened if no trade exists throws trade list not available exception 
	@GetMapping("getAllExchanges")
	public List<exchangedata> getAllExchanges() {
		logger.info("Fetching all exchanges from data base");
		return fxtradingservice.getAllExchanges();
	}
    // @author : Srinidhi Mohan: adds exchange data into db.Validation is done in Service layer
	@PostMapping("addExchangeData")
	public String addExchanges(@RequestBody exchangedata exchangedata) {
		logger.info("Adding exchange data into data base");
		return fxtradingservice.addExchanges(exchangedata);
	}
    // @author : Srinidhi Mohan: deletes trades by id and custom exception is thrown when trying to delete an id which is not available
	@DeleteMapping("deleteTrade/{id}")
	public String deleteTradeById(@PathVariable int id) {
		logger.warn("Deleting the trade from database");
		return fxtradingservice.deleteTradeById(id);
	}
	// @author : Srinidhi Mohan: deletes ccy by id and custom exception is thrown when trying to delete an id which is not available
	@DeleteMapping("deleteCcy/{id}")
	public String deleteCcyById(@PathVariable int id) {
		logger.warn("Deleting the ccy from data base");
		return fxtradingservice.deleteCcyById(id);
	}
}
