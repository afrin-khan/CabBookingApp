package com.cg.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cg.model.Cab;

public interface CabDao extends JpaRepository<Cab, Integer> 
{
	 @Query("select c from Cab c where c.carType IN :c1")
		public List<Cab> viewCabsOfType(@Param("c1")String carType);
	    
	    @Query("select count(c) from Cab c where c.carType IN :c2")
	    public int countCabsOfType(@Param("c2")String carType);

}
