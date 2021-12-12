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

import com.cg.model.Cab;
import com.cg.service.ICabRepository;

@RestController
public class CabController 
{

	@Autowired
	ICabRepository CRS;
	
	@GetMapping("/viewCabs/{carType}")
	public List<Cab> viewCabsOfType(@PathVariable("carType") String carType) {
		List<Cab>cList = CRS.viewCabsOfType(carType);
		return cList;
		
	}

	@GetMapping("/countCabs/{carType}")
	public int countCabsOfType(@PathVariable("carType") String carType) { 
		int cb = CRS.countCabsOfType(carType);
		return cb;
	
	}
	
	@PostMapping("/insertCab")
	public Cab insertCab(@RequestBody Cab cab) {
		Cab cb= CRS.insertCab(cab);
		return cb;
	}
	
	@PutMapping("/updateCab")
	public Cab updateCab(@RequestBody Cab cab) {
		Cab cb= CRS.updateCab(cab);
		return cb;
	}
	
	@DeleteMapping("/deleteCab/{cabId}")
	public Cab deleteCab(@PathVariable("cabId")int cabId) {
		Cab cb= CRS.deleteCab(cabId);
		return cb;
	}
	
}
