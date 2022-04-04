package com.vehicle.vehicleApi.constant;

public class VehicleRenewalConstant {
	public static final String insertUserSql="INSERT INTO tbl_user(userid,name,idprooftype,idproofnumber,vehiclenumber,vehicletype) VALUES(?,?,?,?,?,?)";
    public static final String userInsertSql = "update tbl_user set name=?, idprooftype=?, idproofnumber=?, vehiclenumber=?, vehicletype=? where userid=?";
	public static final String countOfVehicleNumbersql="select count(vehiclenumber) from tbl_user where vehiclenumber=";
	public static final String countOfIdproofNumber="select count(idproofnumber) from tbl_user where idproofnumber=";
	public static final String addInsureSql="INSERT INTO new_adminconfig(vendorname,venderid,vehicletype,amount) VALUES(?,?,?,?)";
	public static final String updateInsQuery ="update new_adminconfig set vendorname=?, vehichletype=?, amount=? where venderid=?";
	public static final String countOfVendorNameSql="select count(vendorname) from new_adminconfig where vendorname=";
	public static final String countOfVenderId="select count(vender) from new_adminconfig where venderid=";
	public static final String queryV="select count(vendorname) from new_adminconfig where vendorname= ?";
	public static final String vehicleTypeQuery="select count(vehicletype) from new_adminconfig where vendorname=? and vehicletype=?";
	public static final String deleteQuery="delete from new_adminconfig where venderid=?";
	public static final String paymentSql = "INSERT INTO tbl_payment(gst,cst,offer) VALUES(?,?,?)";
	public static final String updatepaymentQuery ="update tbl_payment set gst=?, cst=?, offer=? where id=?";
	public static final String countOfGstSql ="select count(gst) from  tbl_payment where vendorname=";
	public static final String countOfCst ="select count(cst) from  tbl_payment where amount=";
	public static final String countOfOffer="select count(offer) from  tbl_payment where amount=";
	public static final String bookInusranceSql="INSERT INTO tbl_bookinginsurance(userid,venderid,vehicletype,vehiclenumber,bookingid,totalamount) VALUES(?,?,?,?,?,?)";
	public static final String sqlForMaxId = "select max(id) from tbl_bookinginsurance";
	public static final  String  sqlForGst = "select gst from tbl_payment where id=1";
	public static final  String  sqlForCst= "select cst from tbl_payment where id=1";
	public static final  String  sqlForOffer = "select offer from tbl_payment where id=1";
	public static final  String sqlForVenderId= "select amount from new_adminconfig where venderid=";
	public static final  String countOfUser ="select count(userid) from tbl_bookinginsurance where vehiclenumber=";
	public static final  String countOfVehicleNumber ="select count(vehiclenumber) from tbl_bookinginsurance where vehiclenumber=";
    public static final  String  confirmInsuranceSql="INSERT INTO tbl_confirminsurance(bookingid,transactionid,paymentoption, cardtype, cardnumber, cardholdername,amount) VALUES(?,?,?,?,?,?,?)";
	public static final   String sqlforMaxid = "select max(id) from tbl_confirminsurance";
	public static final   String countOfBookingId ="select count(bookingid) from tbl_confirminsurance where bookingid=";
}
