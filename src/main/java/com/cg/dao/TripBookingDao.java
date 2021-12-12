package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.model.TripBooking;

@Repository
public interface TripBookingDao extends JpaRepository<TripBooking, Integer> {

}
