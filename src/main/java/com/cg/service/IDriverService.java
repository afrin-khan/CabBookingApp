package com.cg.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.model.Driver;

public interface IDriverService 
{

	public Driver insertDriver(Driver driver);
	public Driver updateDriver(Driver driver);
	public Driver deleteDriver(int driverId);
	public List<Driver> viewBestDrivers();
	public Driver viewDriver(int driverId);
	
}
