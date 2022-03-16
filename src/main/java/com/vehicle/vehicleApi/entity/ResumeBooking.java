package com.vehicle.vehicleApi.entity;

import javax.validation.constraints.NotNull;

public class ResumeBooking {
	private int id;
	@NotNull
	private int bookingid;
	@NotNull
	private int userid;
	
	
	
	public ResumeBooking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResumeBooking(int bookingid, int userid) {
		super();
		this.bookingid = bookingid;
		this.userid = userid;
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
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	
	
}
