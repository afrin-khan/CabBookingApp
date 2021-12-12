package com.cg.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.model.Driver;

public interface DriverDao  extends JpaRepository<Driver, Integer>
{

	
	@Query("Select d from Driver d where rating>=4.5")
	public List<Driver> viewBestDrivers();
}
