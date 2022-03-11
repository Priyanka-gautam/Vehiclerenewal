package com.vehicle.vehicleApi.entity;

public class Message {

	public String successStatus = "200";
	
	public String Userregistration= "User has been registered successfully";
	public String AdminConfigurelns= "Insurance list has been added successfully";
	public String BookingInsurance= "You have successfully Booked";
	public String confirmBooking= "your vehicle renewal has done";
	public String resumeBooking= "your booking has been resumed and your renewal has done";
	
	//errormessage
	private String errormessage= "400";
	private String useralreadyexist= "vehicle number and addressproof already exist";
	private String adminConfigurelnsalredayexist= "please check the vendername";
	private String Bookingalreadyexist="userid and vehiclenumber alraedy exist";
	private String bookingalreadyresumed=" userid and booking id is already exist";
	

	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getSuccessStatus() {
		return successStatus;
	}
	public void setSuccessStatus(String successStatus) {
		this.successStatus = successStatus;
	}
	public String getUserregistration() {
		return Userregistration;
	}
	public void setUserregistration(String userregistration) {
		Userregistration = userregistration;
	}
	public String getAdminConfigurelns() {
		return AdminConfigurelns;
	}
	public void setAdminConfigurelns(String adminConfigurelns) {
		AdminConfigurelns = adminConfigurelns;
	}
	public String getBookingInsurance() {
		return BookingInsurance;
	}
	public void setBookingInsurance(String bookingInsurance) {
		BookingInsurance = bookingInsurance;
	}
	public String getConfirmBooking() {
		return confirmBooking;
	}
	public void setConfirmBooking(String confirmBooking) {
		this.confirmBooking = confirmBooking;
	}
	public String getResumeBooking() {
		return resumeBooking;
	}
	public void setResumeBooking(String resumeBooking) {
		this.resumeBooking = resumeBooking;
	}
	public String getErrormessage() {
		return errormessage;
	}
	public void setErrormessage(String errormessage) {
		this.errormessage = errormessage;
	}
	public String getUseralreadyexist() {
		return useralreadyexist;
	}
	public void setUseralreadyexist(String useralreadyexist) {
		this.useralreadyexist = useralreadyexist;
	}
	public String getAdminConfigurelnsalredayexist() {
		return adminConfigurelnsalredayexist;
	}
	public void setAdminConfigurelnsalredayexist(String adminConfigurelnsalredayexist) {
		this.adminConfigurelnsalredayexist = adminConfigurelnsalredayexist;
	}
	public String getBookingalreadyexist() {
		return Bookingalreadyexist;
	}
	public void setBookingalreadyexist(String bookingalreadyexist) {
		Bookingalreadyexist = bookingalreadyexist;
	}
	public String getBookingalreadyresumed() {
		return bookingalreadyresumed;
	}
	public void setBookingalreadyresumed(String bookingalreadyresumed) {
		this.bookingalreadyresumed = bookingalreadyresumed;
	}

	
}
