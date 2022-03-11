package com.vehicle.vehicleApi.entity;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class AdminPayment{
	private int id ;
	@NotNull
	@Min(value=1, message=" please fill gst")
	private int gst ;
	@NotNull
	@Min(value=1, message=" please fill cst")
	private int cst ;
	@NotNull
	@Min(value=1, message=" please fill offer")
	private int offer ;
	
	public AdminPayment(int gst, int cst, int offer) {
		super();
		this.gst = gst;
		this.cst = cst;
		this.offer = offer;
	}
	
//	public AdminPayment(int id,  int gst, int cst,  int offer) {
//		super();
//		this.id = id;
//		this.gst = gst;
//		this.cst = cst;
//		this.offer = offer;
//	}

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
