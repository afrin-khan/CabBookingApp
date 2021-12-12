package com.cg.service;

import java.util.List;

import com.cg.model.Cab;

public interface ICabService 
{

	public Cab insertCab(Cab cab);
	public Cab updateCab(Cab cab);
	public Cab deleteCab(int cabId);
	public List<Cab> viewCabsOfType(String carType);
	public int countCabsOfType(String carType);
	
}
