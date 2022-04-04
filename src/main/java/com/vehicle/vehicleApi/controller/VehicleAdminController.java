package com.vehicle.vehicleApi.controller;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import com.vehicle.vehicleApi.Repository.AdminPaymentRepository;
import com.vehicle.vehicleApi.entity.AdminConfigureIns;
import com.vehicle.vehicleApi.entity.AdminPayment;
import com.vehicle.vehicleApi.entity.ResponseObject;
import com.vehicle.vehicleApi.service.VehicleService;
import io.swagger.annotations.Api;
@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api/v2")
@Api(value = "Vehicle Renewal", description = "Operations for Renewal of the  vehicle ")
public class VehicleAdminController {
	
	@Autowired
	private VehicleService vehicleService;
	
	/**
	 * This Post Request is used to add insurance vendors
	 * 
	 * same vendor for two wheeler and four wheeler
	 *  vendor id will be generated automatically 
	 *  By the vendorid  get all the insurance vendors details
	 * 
	 * @return reponseobject this status code with message value
	 */
	@PostMapping("/adminconfig")
	public ResponseEntity<ResponseObject>save(@Valid @RequestBody AdminConfigureIns  e) {
		ResponseObject map =vehicleService.create(e);
		return new ResponseEntity<ResponseObject>(map, HttpStatus.CREATED);

	}
	
	/**
	 * This Put Request is used to update insurance vendors
	 * 
	 * same vendor for two wheeler and four wheeler
	 * 
	 * @return reponseobject this status code with message value
	 * 
	 */
	@PutMapping("/adminconfig")
	public ResponseEntity<ResponseObject>update(@Valid @RequestBody AdminConfigureIns e) {
		ResponseObject map=vehicleService.change(e);
		return new ResponseEntity<ResponseObject>(map, HttpStatus.CREATED);
	} 
	
	
	/**
	 * This Delete Request is used to delete the insurance vendors
	 * 
	 * By the vendor id delete the insurance
	 * 
	 * @return reponseobject this status code with message value
	
	 */
	@DeleteMapping("/deleteadminconfig")
	public ResponseEntity<ResponseObject>delete( @RequestBody AdminConfigureIns e) {
		ResponseObject map=vehicleService.delete(e.getVenderid());
		return new ResponseEntity<ResponseObject>(map, HttpStatus.CREATED);
	}

	
	/**
	 * This Post Request is used to add payment rule
	 * 
	 * adding gst, cst and offer
	 *  
	 * @return reponseobject this status code with message value 
	 */
	 
	@PostMapping("/adminpayment")
	public ResponseEntity<ResponseObject>save(@Valid @RequestBody AdminPayment e ) {
		ResponseObject map=vehicleService.addPayment(e );
		return new ResponseEntity<ResponseObject>(map, HttpStatus.CREATED);
	}
	
	/**
	 * This Put Request is used to update payment rule
	 * 
	 * @return reponseobject this status code with message value
	 * 
	 */
	@PutMapping("/adminpayment")
	public ResponseEntity<ResponseObject>update(@Valid @RequestBody AdminPayment e) {
		ResponseObject map=vehicleService.update(e);
		return new ResponseEntity<ResponseObject>(map, HttpStatus.CREATED);
	}

}
