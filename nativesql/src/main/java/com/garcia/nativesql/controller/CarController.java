package com.garcia.nativesql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.garcia.nativesql.entity.Car;
import com.garcia.nativesql.queryinterface.CarNativeQuery;

@RestController
@RequestMapping("/car")
public class CarController {

	@Autowired
	private CarNativeQuery carNativeQuery;

	@GetMapping("/list")
	public List<Car> findAllCars() {
		return carNativeQuery.findAllCars();
	}
	
	@GetMapping("/brand")
	public List<Car> findModelByBrand(@RequestParam("brand") String brand) {
		return carNativeQuery.findModelByBrand(brand);
	}
	
	@GetMapping("/{brand}")
	public List<Car> findModelByBrand(@PathVariable("brand") String brand, 
			@RequestParam(value = "model", required = false) String model) {
		return carNativeQuery.findByBrandAndModel(brand, model);
	}

}
