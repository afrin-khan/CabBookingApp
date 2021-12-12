package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.DriverDao;
import com.cg.model.ApiResponse;
import com.cg.model.Driver;
import com.cg.model.Login;

@Service
public class IDriverRepository implements IDriverService 
{

	@Autowired
	DriverDao Ddao;
	
	public Driver insertDriver(Driver driver)
	{
	Driver d=Ddao.save(driver);
	return d;
	}
	
	public Driver updateDriver(Driver driver)
	{
	Driver d=Ddao.save(driver);
	return d;
	}
	
	public Driver deleteDriver(int driverId)
	{
	Driver d=null;
	if(Ddao.existsById(driverId))
	{
	Optional<Driver> oe= Ddao.findById(driverId);
	d=oe.get();
	Ddao.deleteById(driverId);
	return d;
	}
	else
	return d;
	}
	
	public List<Driver> viewBestDrivers()
	{
	List<Driver> dList=Ddao.viewBestDrivers();
	return dList;
	}
	
	public Driver viewDriver(int driverId)
	{
	Optional<Driver> od= Ddao.findById(driverId);
	Driver d=od.get();
	return d;
	}
	
	
	
}
