package com.cg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer extends User
{
     @Id
     //@GeneratedValue(strategy=GenerationType.AUTO)
     //@OneToOne(mappedBy="TripBooking")
     @Column(name="CustId")
	 int CustomerId;
     @Column(name="userName", length=20)
     String userName;
     @Column(name="password", length=20)
 	String password;
     @Column(name="address", length=20)
 	String address;
     @Column(name="MobileNumber", length=20)
 	String MobileNumber;
     @Column(name="EmailId", length=20)
 	String EmailId;

	public Customer() {
		super();
	}

	public Customer(int customerId, String userName, String password, String address, String mobileNumber,
			String emailId) {
		super();
		CustomerId = customerId;
		this.userName = userName;
		this.password = password;
		this.address = address;
		MobileNumber = mobileNumber;
		EmailId = emailId;
	}

	public int getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNumber() {
		return MobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return EmailId;
	}

	public void setEmailId(String emailId) {
		EmailId = emailId;
	}

	@Override
	public String toString() {
		return "Customer [CustomerId=" + CustomerId + ", userName=" + userName + ", password=" + password + ", address="
				+ address + ", MobileNumber=" + MobileNumber + ", EmailId=" + EmailId + "]";
	}

	
     
	
}
