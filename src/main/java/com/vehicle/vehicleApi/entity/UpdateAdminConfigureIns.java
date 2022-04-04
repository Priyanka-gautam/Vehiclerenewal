package com.vehicle.vehicleApi.entity;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class UpdateAdminConfigureIns {

	@NotEmpty
	private String vendorname;
	
	@NotEmpty
	private String venderid;
	
	@NotNull
	private int amount;

	public String getVendorname() {
		return vendorname;
	}

	public void setVendorname(String vendorname) {
		this.vendorname = vendorname;
	}

	public String getVenderid() {
		return venderid;
	}

	public void setVenderid(String venderid) {
		this.venderid = venderid;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}
