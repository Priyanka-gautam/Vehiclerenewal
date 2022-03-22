package com.vehicle.vehicleApi.controller;
import java.util.List;

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
import com.vehicle.vehicleApi.entity.GetBookingInsurance;
import com.vehicle.vehicleApi.entity.ResponseObject;
import com.vehicle.vehicleApi.entity.ResumeBooking;
import com.vehicle.vehicleApi.entity.SearchInsurance;
import com.vehicle.vehicleApi.entity.UserRegistration;
import com.vehicle.vehicleApi.service.VehicleService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/v2")
@Api(value = "Vehicle Renewal", description = "Operations for Renewal of the  vehicle ")
public class VehicleController {
	@Autowired
	private VehicleService vehicleService;
	
     //	for registering user
	@PostMapping("/userregistration")
	public ResponseEntity<ResponseObject>save(@Valid @RequestBody UserRegistration  e) {

		ResponseObject map =vehicleService.create(e);
		return new ResponseEntity<ResponseObject>(map, HttpStatus.CREATED);
		}
	
	    //get by vehicletype
	@GetMapping("/seachinsurance")
	public List<AdminConfigureIns> findInsurance( @Valid @RequestBody SearchInsurance searchInsurance) {
		return vehicleService.findbyVehicletype(searchInsurance);
   }
	
	
//	 // booking insurance
	@PostMapping("/bookinginsurance")
	public ResponseEntity<ResponseObject>  save(@Valid  @RequestBody BookingInsurance  e) {
		ResponseObject map =vehicleService.bookInsurance(e);
	
		return new ResponseEntity<ResponseObject>(map, HttpStatus.CREATED);
		}	
	     // confirm insurance
		@PostMapping("/confirminsurance")
		public ResponseEntity<ResponseObject>  save(@Valid @RequestBody ConfirmInsurance  e) {
			ResponseObject map =vehicleService.create(e);
			return new ResponseEntity<ResponseObject>(map, HttpStatus.CREATED);
			}
		
		@PostMapping("/resumebooking")
		public GetBookingInsurance findInsurance( @RequestBody ResumeBooking resumeBooking) {
			return vehicleService.findbyBookingid(resumeBooking.getBookingid());
	   }

			
}