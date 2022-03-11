package com.vehicle.vehicleApi.entity;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class BookingInsurance {

	private int id;
	@NotNull
	private int userid;
	@NotNull
	private int  venderid;
	@NotEmpty
	private String vehicletype;
	@NotNull
	private int vehiclenumber;
	@NotNull
    private int bookingid;
    
	public BookingInsurance(int userid, int venderid, String vehicletype, int vehiclenumber, int bookingid) {
		super();
		this.userid = userid;
		this.venderid = venderid;
		this.vehicletype = vehicletype;
		this.vehiclenumber = vehiclenumber;
		this.bookingid = bookingid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getVenderid() {
		return venderid;
	}
	public void setVenderid(int venderid) {
		this.venderid = venderid;
	}
	public String getVehicletype() {
		return vehicletype;
	}
	public void setVehicletype(String vehicletype) {
		this.vehicletype = vehicletype;
	}
	public int getVehiclenumber() {
		return vehiclenumber;
	}
	public void setVehiclenumber(int vehiclenumber) {
		this.vehiclenumber = vehiclenumber;
	}
	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
	public int maxidnumber() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

	
}
