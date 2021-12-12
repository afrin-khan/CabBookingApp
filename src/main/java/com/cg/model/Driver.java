package com.cg.model;

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
@Table(name="driver_tbl")
public class Driver extends User
{
	
	@Id
	int driverId;
	@Column(name="licenceNo" , length=20)
	String licenceNo;
	@Column(name="rating")
	float rating;
	
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
     
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="cabId")
 	Cab cab;
	
	public Driver() {
		super();
	}

	public Driver(int driverId, String licenceNo, float rating, String userName, String password, String address,
			String mobileNumber, String emailId, Cab cab) {
		super();
		this.driverId = driverId;
		this.licenceNo = licenceNo;
		this.rating = rating;
		this.userName = userName;
		this.password = password;
		this.address = address;
		MobileNumber = mobileNumber;
		EmailId = emailId;
		this.cab = cab;
	}

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public String getLicenceNo() {
		return licenceNo;
	}

	public void setLicenceNo(String licenceNo) {
		this.licenceNo = licenceNo;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
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

	public Cab getCab() {
		return cab;
	}

	public void setCab(Cab cab) {
		this.cab = cab;
	}

	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", licenceNo=" + licenceNo + ", rating=" + rating + ", userName="
				+ userName + ", password=" + password + ", address=" + address + ", MobileNumber=" + MobileNumber
				+ ", EmailId=" + EmailId + ", cab=" + cab + "]";
	}

	

	
}
