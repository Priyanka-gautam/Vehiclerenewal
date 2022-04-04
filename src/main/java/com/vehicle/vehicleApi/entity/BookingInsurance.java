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
	@NotNull
	   private int totalamount;
    


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
	public int getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(int totalamount) {
		this.totalamount = totalamount;
	}
	public int maxidnumber() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

	
}
