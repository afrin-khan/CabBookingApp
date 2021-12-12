package com.cg.service;

import java.util.List;

import com.cg.model.Driver;
import com.cg.model.TripBooking;

public interface ITripBookingservice 
{

	public TripBooking insertTripBooking(TripBooking tripBooking);
	public TripBooking updateTripBooking(TripBooking tripBooking);
	public TripBooking deleteTripBooking(int bookingId);
    public TripBooking viewTripBooking(int bookingId);
	//public List<TripBooking> viewAllTripsCustomer(int customerId);
	
	
}
