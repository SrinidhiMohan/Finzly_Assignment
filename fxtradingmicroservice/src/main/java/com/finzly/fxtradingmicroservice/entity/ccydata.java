package com.finzly.fxtradingmicroservice.entity;
import javax.persistence.Entity;
import javax.persistence.Id;

//@Author: Srinidhi Mohan | This is the pojo that stores currency pairs data and their corresponding value.


@Entity
public class ccydata {
	
	private int id;
	private String ccy;
	private double amount;
	
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCcy() {
		return ccy;
	}
	public void setCcy(String ccy) {
		this.ccy = ccy;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "ccydata [id=" + id + ", ccy=" + ccy + ", amount=" + amount + "]";
	}
	
	
	
	

}
