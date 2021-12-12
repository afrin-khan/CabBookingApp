package com.cg.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.TripBookingDao;
import com.cg.model.Driver;
import com.cg.model.TripBooking;

@Service
public class ITripBookingRepository implements ITripBookingservice
{

	@Autowired
	TripBookingDao tdao;
	
	
	public TripBooking insertTripBooking(TripBooking tripBooking) 
	{
		TripBooking tb=tdao.save(tripBooking);
		return tb;
		
	}

	public TripBooking updateTripBooking(TripBooking tripBooking) 
	{
		TripBooking tb=tdao.save(tripBooking);
		return tb;
	}

	
	public TripBooking deleteTripBooking(int bookingId) 
	{
		TripBooking d=null;
		if(tdao.existsById(bookingId))
		{
			Optional<TripBooking> oe= tdao.findById(bookingId);
		d=oe.get();
		tdao.deleteById(bookingId);
		return d;
		}
		else
			return d;
	}
	
//	public TripBooking viewTrpBooking(int TripBooking)
//	{
//	Optional<TripBooking> od=tdao.findById(TripBooking);
//	TripBooking d=od.get();
//	return d;
//	}

	@Override
	public TripBooking viewTripBooking(int bookingId) {
		// TODO Auto-generated method stub
		
		Optional<TripBooking> od=tdao.findById(bookingId);
		TripBooking d=od.get();
		return d;
		//return null;
	}
}
