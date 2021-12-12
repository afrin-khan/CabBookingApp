package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.model.Driver;
import com.cg.service.IDriverRepository;

@RestController
public class DriverController 
{

	@Autowired
	IDriverRepository DS;

	@PostMapping("/insertDriver")
	public Driver insertDriver(@RequestBody Driver driver)
	{
	return DS.insertDriver(driver);
	}
	@PutMapping("/updateDriver")
	public Driver updateDriver(@RequestBody Driver driver)
	{
	return DS.updateDriver(driver);
	}
	@DeleteMapping("/deleteDriver/{id}")
	public Driver deleteDriver(@PathVariable("id")int driverId)
	{
	return DS.deleteDriver(driverId);
	}
	@GetMapping("/viewBestDrivers")
	public List<Driver> viewBestDrivers()
	{
	return DS.viewBestDrivers();
	}
	@GetMapping("/viewDriver/{id}")
	public Driver viewDriver(@PathVariable("id")int driverId)
	{
	return DS.viewDriver(driverId);
	}
	
}
