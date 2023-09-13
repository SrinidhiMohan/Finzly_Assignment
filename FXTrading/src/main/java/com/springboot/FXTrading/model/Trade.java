package com.springboot.FXTrading.model;

import java.text.DecimalFormat;

public class Trade {
	private static double tradingAmountLimit = 1.7976931348623157E+308;
	private int tradeID;
	private String customerName;
	private String currencyPair;
	private double rate;
	private double amount;
	private boolean tradeConfirmed = false;
	
	public Trade() {
		
	}
	
	public Trade(String customerName, String currencyPair, double rate, double amount) {
		this.customerName = customerName;
		this.currencyPair = currencyPair;
		this.rate = rate;
		this.amount = amount;	
		this.tradeConfirmed = true;
	}

	public int getTradeID() {
		return tradeID;
	}
	public  void setTradeID(int tradeID) {
		this.tradeID = tradeID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCurrencyPair() {
		return currencyPair;
	}

	public void setCurrencyPair(String currencyPair) {
		this.currencyPair = currencyPair;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public boolean isTradeConfirmed() {
		return tradeConfirmed;
	}

	public void setTradeConfirmed(boolean tradeConfirmed) {
		this.tradeConfirmed = tradeConfirmed;
	}
	
	public static double getTradingAmountLimit() {
		return tradingAmountLimit;
	}
	

	 @Override
	public String toString() {
		return "Trade for " + getCurrencyPair() +" has been booked with rate " + getRate() 
		+". The amount of Rs " + formatAmount(getAmount() * getRate())
		+ "will be transferred in 2 working days to "+ getCustomerName() +"..";
	}

	private String formatAmount(double amount) {
	        DecimalFormat df = new DecimalFormat("##,##,##,##,##,##,##,##,##,##,##,##,##,##,##,###.00");
	        return "INR " + df.format(amount);
	    }
	 
	

}
