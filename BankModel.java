package com.sai.Model;

public class BankModel {
	
	private long accountNumber;
	private String fullName;
	private String gender;
	private String password;
	private String confirmPassword;
	private double amount;
	private String address;
	private long mobileNumber;
	
	public BankModel() {
		// TODO Auto-generated constructor stub
	}

	public BankModel(long accountNumber, String fullName, String gender, String password, String confirmPassword,
			double amount, String address, long mobileNumber) {
		super();
		this.accountNumber = accountNumber;
		this.fullName = fullName;
		this.gender = gender;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.amount = amount;
		this.address = address;
		this.mobileNumber = mobileNumber;
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

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
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
	
	
	
	
	

}
