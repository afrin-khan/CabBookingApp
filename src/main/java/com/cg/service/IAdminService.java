package com.cg.service;

import java.util.List;

import com.cg.model.Admin;
import com.cg.model.TripBooking;

public interface IAdminService 
{

	public Admin insertAdmin(Admin admin);
	public Admin updateAdmin(Admin admin);
	public Admin deleteAdmin(int adminId );
	//public List<TripBooking> getAllTrips(int customerId);
	//public List<TripBooking> getTripCabwise();
	
	
}
