package com.finzly.fxtradingmicroservice.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.finzly.fxtradingmicroservice.dao.FxtradingMicroserviceDao;
import com.finzly.fxtradingmicroservice.entity.ccydata;
import com.finzly.fxtradingmicroservice.entity.exchangedata;
import com.finzly.fxtradingmicroservice.exceptions.GlobalExceptionHandler;

@Service
public class FxtradingMicroserviceService {
	// This is beyond which the user won't be allowed to trade the amount

	private static final double maxTradingAmt = Double.MAX_VALUE;
	@Autowired
	FxtradingMicroserviceDao fxtradingdao;

	public String addCcyData(ccydata ccydata) {
		if (ccydata.getCcy().isEmpty() || ccydata.getAmount() == 0 || ccydata.getCcy() == " "
				|| Double.isNaN(ccydata.getAmount())) {
			return "Please enter proper currency pair. ";
		} else {
			return fxtradingdao.addCcyData(ccydata);
		}

	}

	public List<ccydata> getAllCurrencyPair() {
		if (fxtradingdao.getAllCurrencyPair().isEmpty()) {
			GlobalExceptionHandler.getCcyListNotAvailableException("Ccy List is Empty");
		}
		return fxtradingdao.getAllCurrencyPair();

	}

	public String addExchanges(exchangedata exchangedata) {
		// Validation for from and to

		boolean fromToValidation = false;
		if (FxtradingMicroserviceService.isValidName(exchangedata.getFrom())
				&& FxtradingMicroserviceService.isValidName(exchangedata.getTo())) {
			fromToValidation = true;
		} else {
			return "Kindly enter proper From and to";
		}

		// Validation for rate

		boolean rateValidation = true;
		if (exchangedata.getAmount() == 0 || Double.isNaN(exchangedata.getAmount())) {
			rateValidation = false;
			return "Kindly Enter Proper amount to trade";
		}

		// Checks to see if the trade already exists
		if (!(fxtradingdao.getAllExchanges().isEmpty())) {
			List<exchangedata> exchanges = getAllExchanges();
			for (exchangedata exchangedata2 : exchanges) {
				if (exchangedata2.getFrom().equalsIgnoreCase(exchangedata.getFrom())
						&& exchangedata2.getTo().equalsIgnoreCase(exchangedata.getTo())) {
					GlobalExceptionHandler.getTradeAlreadyExistsException("The Trade Already Exists !!");
				}
			}
		}

		// Validation for Currency pair
		List<ccydata> currencypairs = getAllCurrencyPair();
		int count = 0; // Count is set so that if currency pair exists it proceeds with adding the
						// exchanges else it will print currency pair not available
		double ccyAmount = 0;
		for (ccydata ccydata : currencypairs) { // to iterate the ccydata to check for currency pair
			if (ccydata.getCcy().equalsIgnoreCase(exchangedata.getCcy().trim())) {
				ccyAmount = ccydata.getAmount();
				double exchangeAmount = exchangedata.getAmount();
				double convertedAmount = exchangeAmount * ccyAmount;
				if (convertedAmount < maxTradingAmt) {
					exchangedata.setConvertedamount(convertedAmount);
					count++;
				} else {
					return "The trading amount exceeded the trading limit. Kindly enter amount within Trading limit";
				}

			}
		}
		if (count > 0 && fromToValidation && rateValidation) {
			return fxtradingdao.addExchanges(exchangedata);

		} else {
			return "Currency pair not available";
		}
	}

	public List<exchangedata> getAllExchanges() {
		if (fxtradingdao.getAllExchanges().isEmpty()) {
			GlobalExceptionHandler.getTradeListNotAvailableException("No trade available till now!");
			;
		}
		return fxtradingdao.getAllExchanges();
	}

	public String deleteTradeById(int id) {
		List<exchangedata> exchangedata1 = fxtradingdao.getAllExchanges();
		for (exchangedata exchangedata : exchangedata1) {
			if (exchangedata.getId() != id) {
				GlobalExceptionHandler.getIdNotAvailableException("Id not available to delete");
			}
		}
		ccydata ccydata1 = new ccydata();

		return fxtradingdao.deleteTradeById(id);
	}

	public String deleteCcyById(int id) {
		List<ccydata> ccydata1 = fxtradingdao.getAllCurrencyPair();
		for (ccydata ccydata : ccydata1) {
			if (ccydata.getId() != id) {
				GlobalExceptionHandler.getIdNotAvailableException("Id not available to delete");
			}
		}
		return fxtradingdao.deleteCcyById(id);
	}

	private static boolean isValidName(String name) {
		return name.matches("^[a-zA-Z. ]+$") && !(name.isEmpty()) && !(name.equals(" ") && !(name == null));
	}

}
