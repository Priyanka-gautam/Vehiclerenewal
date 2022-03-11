package com.vehicle.vehicleApi.controller;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle.vehicleApi.entity.AdminConfigureIns;
import com.vehicle.vehicleApi.entity.BookingInsurance;
import com.vehicle.vehicleApi.entity.ConfirmInsurance;
import com.vehicle.vehicleApi.entity.ResponseObject;
import com.vehicle.vehicleApi.entity.ResumeBooking;
import com.vehicle.vehicleApi.entity.SearchInsurance;
import com.vehicle.vehicleApi.entity.UserRegistration;
import com.vehicle.vehicleApi.service.VehicleService;

@RestController
@RequestMapping("/api/v2")
public class VehicleController {
	@Autowired
	private VehicleService vehicleService;
	
	
     //	for registering user
	@PostMapping("/userregistration")
	public ResponseEntity<ResponseObject>save( @RequestBody UserRegistration  e) {

		ResponseObject map =vehicleService.create(e);
		return new ResponseEntity<ResponseObject>(map, HttpStatus.CREATED);
		}
	
	    //get by vehicletype
	@GetMapping("/seachinsurance")
	public AdminConfigureIns findInsurance( @RequestBody AdminConfigureIns searchInsurance) {
		return vehicleService.findbyVehicletype(searchInsurance);
   }
	 // booking insurance
	@PostMapping("/bookinginsurance")
	public ResponseEntity<ResponseObject>  save( @RequestBody BookingInsurance  e) {
		ResponseObject map =vehicleService.bookInsurance(e);
	
		return new ResponseEntity<ResponseObject>(map, HttpStatus.CREATED);
		}
	
	     // confirm insurance
		@PostMapping("/confirminsurance")
		public ResponseEntity<ResponseObject>  save( @RequestBody ConfirmInsurance  e) {
			ResponseObject map =vehicleService.create(e);
			return new ResponseEntity<ResponseObject>(map, HttpStatus.CREATED);
			}
		
		@PostMapping("/resumebooking")
		public ResponseEntity<ResponseObject>  save(@Valid @RequestBody ResumeBooking  e) {
			ResponseObject map =vehicleService.create(e);
			return new ResponseEntity<ResponseObject>(map, HttpStatus.CREATED);
			}
}