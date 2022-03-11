package com.vehicle.vehicleApi.entity;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class SearchInsurance {
 private int id;
 
 @NotNull
 private int userid;
 @NotEmpty
 private String vehicletype;
 @NotNull
 private int vehiclenumber;
 
public SearchInsurance() {
	super();
	// TODO Auto-generated constructor stub
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

}
