package com.vehicle.vehicleApi.entity;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class AdminPayment{
	private int id ;
	@NotNull
	private int gst ;
	@NotNull
	private int cst ;
	@NotNull
    private int offer ;
	

	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGst() {
		return gst;
	}
	public void setGst(int gst) {
		this.gst = gst;
	}
	public int getCst() {
		return cst;
	}
	public void setCst(int cst) {
		this.cst = cst;
	}
	public int getOffer() {
		return offer;
	}
	public void setOffer(int offer) {
		this.offer = offer;
	}
	
	
}
