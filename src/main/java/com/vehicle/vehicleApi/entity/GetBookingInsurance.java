package com.vehicle.vehicleApi.entity;

public class GetBookingInsurance {

	private int userid;
	private int venderid;
	private String vehicletype; 
	private int vehiclenumber;
	private int bookingid;
	private int totalamount;
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
	
}
