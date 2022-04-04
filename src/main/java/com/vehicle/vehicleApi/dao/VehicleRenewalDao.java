package com.vehicle.vehicleApi.dao;

import com.vehicle.vehicleApi.entity.AdminConfigureIns;
import com.vehicle.vehicleApi.entity.AdminPayment;
import com.vehicle.vehicleApi.entity.BookingInsurance;
import com.vehicle.vehicleApi.entity.ConfirmInsurance;
import com.vehicle.vehicleApi.entity.ResponseObject;
import com.vehicle.vehicleApi.entity.UserRegistration;

public interface VehicleRenewalDao {

	public ResponseObject create(final UserRegistration userRegistration);
	public ResponseObject create(final AdminConfigureIns adminConfigurelns) ;
	 public ResponseObject update (AdminPayment adminPayment);
	public ResponseObject confirmIns(ConfirmInsurance confirmInsurance);
	public ResponseObject bookInsurance(BookingInsurance bookingInsurance);
	public ResponseObject addPayment(AdminPayment adminPayment);
	 public ResponseObject delete(int venderid);
	ResponseObject change(AdminConfigureIns adminConfigurelns);
	
}
