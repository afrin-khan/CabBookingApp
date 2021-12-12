package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.cg.dao.CabDao;
import com.cg.model.Cab;

@Service
public class ICabRepository implements ICabService
{

	@Autowired
	CabDao Cdao;
	
	
	public Cab insertCab(Cab cab) {
		Cab cb= Cdao.save(cab);
		return cb;
	}
	
	public Cab updateCab(Cab cab) {
		Cab cb= Cdao.save(cab);
		return cb;
	}
	
	public Cab deleteCab(int cabId) {
		if(Cdao.existsById(cabId)) {
			Optional<Cab> op = Cdao.findById(cabId);
			Cab cb=op.get();
			Cdao.deleteById(cabId);
			
			return cb;
		}
		return null;
	}
	
	public List<Cab> viewCabsOfType(@PathVariable("carType")String carType) 
	{
		List<Cab>cList = Cdao.viewCabsOfType(carType);
		return cList;
		
	}
	
	public int countCabsOfType(@PathVariable("carType") String carType) {
		int cb =Cdao.countCabsOfType(carType);
		return cb;
	}
}
