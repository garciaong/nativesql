package com.garcia.nativesql.queryinterface;

import java.util.List;

import com.garcia.nativesql.entity.Car;

import io.github.gasparbarancelli.NativeQuery;
import io.github.gasparbarancelli.NativeQueryParam;

public interface CarNativeQuery extends NativeQuery {

	List<Car> findAllCars();
	
	List<Car> findModelByBrand(@NativeQueryParam(value = "brand")String brand);
	
	List<Car> findByBrandAndModel(@NativeQueryParam(value = "brand")String brand, 
			@NativeQueryParam(value = "model")String model);
}
