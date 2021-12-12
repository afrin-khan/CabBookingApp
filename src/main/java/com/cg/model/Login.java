package com.cg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="login")
public class Login extends User
{

	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    int userId;
	    @Column(name="username", length=20)
	    String userName;
	    
	    @Column(name="password", length=20)
	    @JsonIgnore
		String password;
	    @Column(name="address", length=20)
		String address;
	    @Column(name="MobileNumber", length=20)
		String MobileNumber;
	    @Column(name="EmailId", length=20)
		String EmailId;
		public Login() {
			super();
		}
	
		
		public Login(int userId, String userName, String password, String address, String mobileNumber,
				String emailId) {
			super();
			this.userId = userId;
			this.userName = userName;
			this.password = password;
			this.address = address;
			MobileNumber = mobileNumber;
			EmailId = emailId;
		}


		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
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
			return "Login [userId=" + userId + ", userName=" + userName + ", password=" + password + ", address="
					+ address + ", MobileNumber=" + MobileNumber + ", EmailId=" + EmailId + "]";
		}
	
	
}
