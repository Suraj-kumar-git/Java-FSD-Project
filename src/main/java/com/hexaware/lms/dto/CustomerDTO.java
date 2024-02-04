package com.hexaware.lms.dto;

import java.time.LocalDate;
import java.util.Arrays;

public class CustomerDTO {
	private long customerId;

	private String customerFirstName;

	private String customerLastName;

	private long phoneNumer;

	private String email;

	private String password;

	private LocalDate dateOfBirth;

	private String address;

	private String country;

	private String state;

	private int creditScore;

	private String panCardNumber;

	private byte[] idProof;

	private String role;

	public CustomerDTO() {
		super();
	}

	public CustomerDTO(String customerFirstName, String customerLastName, long phoneNumer, String email,
			String password, LocalDate dateOfBirth, String address, String state, int creditScore, String panCardNumber,
			byte[] idProof) {
		super();
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.phoneNumer = phoneNumer;
		this.email = email;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.state = state;
		this.creditScore = creditScore;
		this.panCardNumber = panCardNumber;
		this.idProof = idProof;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public long getPhoneNumer() {
		return phoneNumer;
	}

	public void setPhoneNumer(long phoneNumer) {
		this.phoneNumer = phoneNumer;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getCreditScore() {
		return creditScore;
	}

	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}

	public String getPanCardNumber() {
		return panCardNumber;
	}

	public void setPanCardNumber(String panCardNumber) {
		this.panCardNumber = panCardNumber;
	}

	public byte[] getIdProof() {
		return idProof;
	}

	public void setIdProof(byte[] idProof) {
		this.idProof = idProof;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "CustomerDTO [customerId=" + customerId + ", customerFirstName=" + customerFirstName
				+ ", customerLastName=" + customerLastName + ", phoneNumer=" + phoneNumer + ", email=" + email
				+ ", password=" + password + ", dateOfBirth=" + dateOfBirth + ", address=" + address + ", country="
				+ country + ", state=" + state + ", creditScore=" + creditScore + ", panCardNumber=" + panCardNumber
				+ ", idProof=" + Arrays.toString(idProof) + ", role=" + role + "]";
	}
	
	

}