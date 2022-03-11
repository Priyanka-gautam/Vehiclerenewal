package com.vehicle.vehicleApi.entity;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class ConfirmInsurance {
    private int id; 
    @NotNull
	private int bookingid;
    @NotNull
	private int transactionid;
    
    @NotEmpty
	private String paymentoption;
    
    @NotNull
    private int cardnumber;
    
    @NotEmpty
   	private String cardholdername;
    
	
//	public ConfirmInsurance( int bookingid,  int transactionid,  String paymentoption,
//			int cardnumber,  String cardholdername) {
//		super();
//		this.bookingid = bookingid;
//		this.transactionid = transactionid;
//		this.paymentoption = paymentoption;
//		this.cardnumber = cardnumber;
//		this.cardholdername = cardholdername;
//	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
	public int getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(int transactionid) {
		this.transactionid = transactionid;
	}
	public String getPaymentoption() {
		return paymentoption;
	}
	public void setPaymentoption(String paymentoption) {
		this.paymentoption = paymentoption;
	}

	public int getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(int cardnumber) {
		this.cardnumber = cardnumber;
	}
	public String getCardholdername() {
		return cardholdername;
	}
	public void setCardholdername(String cardholdername) {
		this.cardholdername = cardholdername;
	}
}
	