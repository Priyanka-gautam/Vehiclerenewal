package com.vehicle.vehicleApi.entity;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ConfirmInsurance {
	
    private int id; 
    @NotNull
	private int bookingid;
    @NotNull
	private int transactionid;
    @NotEmpty
	private String paymentoption;
    @NotEmpty
    private String cardtype;
    @NotEmpty
    @Size(min = 12, max = 12, message = "cardnumber should have  12 characters")
    private String cardnumber;
    @NotEmpty
   	private String cardholdername;
    @NotNull
     private int amount;
	public ConfirmInsurance( int bookingid,  int transactionid,  String paymentoption,
			 String cardtype, String cardnumber,String cardholdername, int amount) {
		super();
		this.bookingid = bookingid;
		this.transactionid = transactionid;
		this.paymentoption = paymentoption;
		this.cardtype = cardtype;
		this.cardnumber = cardnumber;
		this.cardholdername = cardholdername;
		this.amount = amount;
	}
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
	public String getCardtype() {
		return cardtype;
	}
	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}
	public String getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}
	public String getCardholdername() {
		return cardholdername;
	}
	public void setCardholdername(String cardholdername) {
		this.cardholdername = cardholdername;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
 
}
	