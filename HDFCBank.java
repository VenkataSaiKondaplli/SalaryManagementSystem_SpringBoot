package com.sai.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class HDFCBank {
	@Id
	private long accountNumber;
	private String fullName;
	private String gender;
	private String password;
	private double amount;
	private String address;
	private long mobileNumber;
	private boolean active;
	
	public HDFCBank() {
		// TODO Auto-generated constructor stub
	}

	public HDFCBank(long accountNumber, String fullName, String gender, String password, double amount, String address,
			long mobileNumber, boolean active) {
		super();
		this.accountNumber = accountNumber;
		this.fullName = fullName;
		this.gender = gender;
		this.password = password;
		this.amount = amount;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.active = active;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	
	
}
