package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.model.TripBooking;
import com.cg.service.ITripBookingRepository;

@RestController
public class TripBookingController
{
	@Autowired
	ITripBookingRepository ts;

	@PostMapping("/insertTripBooking")
	public TripBooking insertDriver(@RequestBody TripBooking tripbooking)
	{
		return ts.insertTripBooking(tripbooking);
	}
	@PutMapping("/updateTripBooking")
	public TripBooking updateDriver(@RequestBody TripBooking tripBooking)
	{
		return ts.updateTripBooking(tripBooking);
	}
	@DeleteMapping("/deleteTripBooking/{id}")
	public TripBooking deleteTripBooking(@PathVariable("id")int bookingId)
	{
		return ts.deleteTripBooking(bookingId);
	}
	
	@GetMapping("/ViewBooking/{id}")
	public TripBooking viewTripBooking(@PathVariable("id") int bookingId)
	{
		return ts.viewTripBooking(bookingId);
	}
}
