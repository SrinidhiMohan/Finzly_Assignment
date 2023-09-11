package com.springboot.FXTrading.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.FXTrading.model.Trade;

@Service
public class TradeService {
	
	private static int tradeCount = 0;
	List<Trade> list=new ArrayList<>();

	public boolean bookTrade(Trade trade) {
		// Rate value is hardcoded here as 66 and can be changed in future accordingly to current rate. 
		// Validations are done for the entered values. if validated trade is booked or else message will be displayed accordingly.
		if(!(trade.getCurrencyPair().equalsIgnoreCase("USDINR")) || trade.getAmount()<=0 || trade.getAmount()> trade.getTradingAmountLimit() || trade.getCustomerName().isEmpty() || trade.getCurrencyPair().isEmpty() || trade.getRate()!=66)  {
			return false;
		}else {
			tradeCount++;
			trade.setTradeID(tradeCount);
			trade.setTradeConfirmed(true);
			list.add(trade);
			return true;
		}
	
	}
	public List<Trade> getAllTrade(){
		return list;
	}
}
