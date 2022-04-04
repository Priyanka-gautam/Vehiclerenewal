package com.vehicle.vehicleApi.controller;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	/**
	 * This Post Request is used to register a user
	 * 
	 * userid will generate automatically
	 *  
	 * @return reponseobject this status code with message value
	 */
 
	@PostMapping("/userregistration")
	public ResponseEntity<ResponseObject>save(@Valid @RequestBody UserRegistration  addUser) {
		ResponseObject map =vehicleService.create(addUser);
		return new ResponseEntity<ResponseObject>(map, HttpStatus.CREATED);
		}
	
	
	@PutMapping("/userupdate")
	public ResponseEntity<ResponseObject>update(@Valid @RequestBody UserRegistration  e) {
		ResponseObject map =vehicleService.updateUser(e);
		return new ResponseEntity<ResponseObject>(map, HttpStatus.CREATED);
		}
	
	/**
	 * This get Request is used to  search insurance
	 * 
	 *  FindbyVehicletype used to find the insurance vendors by vehicle type
	 *  Admin configureIns api will be called here
	 *  
	 * @return reponseobject this status code with message value
	 */
	
	@GetMapping("/seachinsurance")
	public List<AdminConfigureIns> findInsurance( @Valid @RequestBody SearchInsurance searchInsurance) {
		return vehicleService.findbyVehicletype(searchInsurance);
   }
	
	
	/**
	 * This Post Request is used to book insurance 
	 * 
	 * bookingid will generate automatically
	 *  amount of the vehicle insurance  also show
	 *  
	 * @return reponseobject this status code with message value
	 */
	@PostMapping("/bookinginsurance")
	public ResponseEntity<ResponseObject>  save(@Valid  @RequestBody BookingInsurance  e) {
		ResponseObject map =vehicleService.bookInsurance(e);
		return new ResponseEntity<ResponseObject>(map, HttpStatus.CREATED);
		}	
	
	
	/**
	 * This Post Request is used to confirm insurance 
	 * 
	 * transaction id will generate automatically
	 *  
	 * @return reponseobject this status code with message value
	 */
	  
		@PostMapping("/confirminsurance")
		public ResponseEntity<ResponseObject>  save(@Valid @RequestBody ConfirmInsurance  e) {
		ResponseObject map =vehicleService.confirmIns(e);
	    return new ResponseEntity<ResponseObject>(map, HttpStatus.CREATED);
			}
		
		
		/**
		 * This Post Request is used to resume booking insurance 
		 *  
		 * @return reponseobject this status code with message value
		 */
		@PostMapping("/resumebooking")
		public GetBookingInsurance findInsurance( @RequestBody ResumeBooking resumeBooking) {
			return vehicleService.findbyBookingid(resumeBooking.getBookingid());
	   }

			
}