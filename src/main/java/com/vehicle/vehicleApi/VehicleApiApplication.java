package com.vehicle.vehicleApi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vehicle.vehicleApi.entity.AdminConfigureIns;
import com.vehicle.vehicleApi.service.VehicleService;




@SpringBootApplication
public class VehicleApiApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(VehicleApiApplication.class, args);

	}
	
	
	
	
}
