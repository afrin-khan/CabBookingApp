package com.cg.model;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="tripBooking_tbl")
public class TripBooking 
{
	@Id
	int tripBookingId;

	@Column(name="formlocation", length=20)
	String fromLocation;
	@Column(name="toLocation", length=20)
	String toLocation;
	@Column(name="fromDateTime", length=20)
	LocalDateTime fromDateTime;
	@Column(name="toDateTime", length=20)
	LocalDateTime toDateTime;
	@Column(name="status", length=20)
	boolean status;
	@Column(name="distanceInKm", length=20)
	float distanceInKm;
	@Column(name="bill", length=20)
	float bill;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="CustId")
	Customer customer;
	
	
	 @ManyToOne
     @JoinColumn(name="driverId")
      Driver driver;
		
	
	public TripBooking() {
		super();
	}


	public TripBooking(int tripBookingId, String fromLocation, String toLocation, LocalDateTime fromDateTime,
			LocalDateTime toDateTime, boolean status, float distanceInKm, float bill, Customer customer,
			Driver driver) {
		super();
		this.tripBookingId = tripBookingId;
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
		this.fromDateTime = fromDateTime;
		this.toDateTime = toDateTime;
		this.status = status;
		this.distanceInKm = distanceInKm;
		this.bill = bill;
		this.customer = customer;
		this.driver = driver;
	}


	public int getTripBookingId() {
		return tripBookingId;
	}


	public void setTripBookingId(int tripBookingId) {
		this.tripBookingId = tripBookingId;
	}


	public String getFromLocation() {
		return fromLocation;
	}


	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}


	public String getToLocation() {
		return toLocation;
	}


	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}


	public LocalDateTime getFromDateTime() {
		return fromDateTime;
	}


	public void setFromDateTime(LocalDateTime fromDateTime) {
		this.fromDateTime = fromDateTime;
	}


	public LocalDateTime getToDateTime() {
		return toDateTime;
	}


	public void setToDateTime(LocalDateTime toDateTime) {
		this.toDateTime = toDateTime;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public float getDistanceInKm() {
		return distanceInKm;
	}


	public void setDistanceInKm(float distanceInKm) {
		this.distanceInKm = distanceInKm;
	}


	public float getBill() {
		return bill;
	}


	public void setBill(float bill) {
		this.bill = bill;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public Driver getDriver() {
		return driver;
	}


	public void setDriver(Driver driver) {
		this.driver = driver;
	}


	@Override
	public String toString() {
		return "TripBooking [tripBookingId=" + tripBookingId + ", fromLocation=" + fromLocation + ", toLocation="
				+ toLocation + ", fromDateTime=" + fromDateTime + ", toDateTime=" + toDateTime + ", status=" + status
				+ ", distanceInKm=" + distanceInKm + ", bill=" + bill + ", customer=" + customer + ", driver=" + driver
				+ "]";
	}

	

}
