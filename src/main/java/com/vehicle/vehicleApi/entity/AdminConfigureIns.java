package com.vehicle.vehicleApi.entity;

import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class AdminConfigureIns {
	private long id;
	@NotEmpty
	private String vendorname;
	@NotNull
	private int venderid;
	@NotNull
	private int amount;
	@NotEmpty
	private String vehicletype;
	

	public AdminConfigureIns( String vendorname,  int venderid,  int amount,
			 String vehicletype) {
		super();
		this.vendorname = vendorname;
		this.venderid = venderid;
		this.amount = amount;
		this.vehicletype = vehicletype;
	}
	
	public AdminConfigureIns() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getVendorname() {
		return vendorname;
	}
	public void setVendorname(String vendorname) {
		this.vendorname = vendorname;
	}
	public int getVenderid() {
		return venderid;
	}
	public void setVenderid(int venderid) {
		this.venderid = venderid;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getVehicletype() {
		return vehicletype;
	}
	public void setVehicletype(String vehicletype) {
		this.vehicletype = vehicletype;
	}
//	@Override
//	  public String toString() {
//	    return "AdminConfigureIns [ vendorname=" + vendorname + ", venderid=" +venderid + ", amount=" + amount + "]";
//	  }
//
//	

//	public static List<AdminConfigureIns> findByvendorname(boolean b) {
//	// TODO Auto-generated method stub
//		return null;
//	}
//
//
//
//	public static List<AdminConfigureIns> findByvehicletype(boolean b) {
////		 TODO Auto-generated method stub
//		return null;
//	}
//	

}
