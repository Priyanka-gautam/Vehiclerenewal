package com.vehicle.vehicleApi.entity;



import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

public class UserRegistration {

	private int id;
	
	@NotNull
	private int userid;
	@NotEmpty
	private  String name;	
	@NotEmpty
	private  String idprooftype;
	@NotNull
//	@Range(min= 1, max= 10 ,message="please fill the idnumber")
	private int idproofnumber; 
	@NotNull
//	@Range(min= 1, max= 10 ,message="please fill the idnumber")
	private int vehiclenumber;
	@NotEmpty
	private String vehicletype ;
	
	public UserRegistration() {
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdprooftype() {
		return idprooftype;
	}

	public void setIdproof(String idprooftype) {
		this.idprooftype = idprooftype;
	}

	public int getIdproofnumber() {
		return idproofnumber;
	}

	public void setIdproofnumber(int idproofnumber) {
		this.idproofnumber = idproofnumber;
	}

	public int getVehiclenumber() {
		return vehiclenumber;
	}

	public void setVehiclenumber(int vehiclenumber) {
		this.vehiclenumber = vehiclenumber;
	}

	public String getVehicletype() {
		return vehicletype;
	}

	public void setVehicletype(String vehicletype) {
		this.vehicletype = vehicletype;
	}

	
}