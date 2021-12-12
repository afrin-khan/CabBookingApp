package com.cg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin extends User

{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	int adminId;
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

	public Admin() {
		super();
	}

	public Admin(int adminId, String userName, String password, String address, String mobileNumber, String emailId) {
		super();
		this.adminId = adminId;
		this.userName = userName;
		this.password = password;
		this.address = address;
		MobileNumber = mobileNumber;
		EmailId = emailId;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
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
		return "Admin [adminId=" + adminId + ", userName=" + userName + ", password=" + password + ", address="
				+ address + ", MobileNumber=" + MobileNumber + ", EmailId=" + EmailId + "]";
	}


    
	
}
