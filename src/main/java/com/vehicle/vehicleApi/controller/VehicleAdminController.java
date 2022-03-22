package com.vehicle.vehicleApi.controller;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//import com.vehicle.vehicleApi.Repository.AdminConfigureInsRepository;
//import com.vehicle.vehicleApi.Repository.AdminPaymentRepository;
import com.vehicle.vehicleApi.entity.AdminConfigureIns;
import com.vehicle.vehicleApi.entity.AdminPayment;
import com.vehicle.vehicleApi.entity.ResponseObject;
import com.vehicle.vehicleApi.service.VehicleService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api/v2")
@Api(value = "Vehicle Renewal", description = "Operations for Renewal of the  vehicle ")
public class VehicleAdminController {
	
	@Autowired
	private VehicleService vehicleService;
	
	//get insurancelist
	@PostMapping("/adminconfig")
	public ResponseEntity<ResponseObject>save(@Valid @RequestBody AdminConfigureIns  e) {
		ResponseObject map =vehicleService.create(e);
		return new ResponseEntity<ResponseObject>(map, HttpStatus.CREATED);

	}
	@PutMapping("/adminconfig")
	public ResponseEntity<ResponseObject>update(@Valid @RequestBody AdminConfigureIns e) {
		ResponseObject map=vehicleService.change(e);
		return new ResponseEntity<ResponseObject>(map, HttpStatus.CREATED);
	}

	@DeleteMapping("/deleteadminconfig")
	public ResponseEntity<ResponseObject>delete( @RequestBody AdminConfigureIns e) {
		ResponseObject map=vehicleService.delete(e.getVenderid());
		return new ResponseEntity<ResponseObject>(map, HttpStatus.CREATED);
	}




	
	//get payment 
	@PostMapping("/adminpayment")
	public ResponseEntity<ResponseObject>save(@Valid @RequestBody AdminPayment e) {

		ResponseObject map=vehicleService.create(e);
		return new ResponseEntity<ResponseObject>(map, HttpStatus.CREATED);
	}
	
	
	@PutMapping("/adminpayment")
	public ResponseEntity<ResponseObject>update(@Valid @RequestBody AdminPayment e) {

		ResponseObject map=vehicleService.create(e);
		return new ResponseEntity<ResponseObject>(map, HttpStatus.CREATED);
	}

}
