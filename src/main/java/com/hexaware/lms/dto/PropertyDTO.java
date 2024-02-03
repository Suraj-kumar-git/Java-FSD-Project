package com.hexaware.lms.dto;

import java.util.Arrays;

import jakarta.persistence.Lob;

public class PropertyDTO {

	private int propertyId;

	private String propertyAddress;

	private double propertyAreaInm2;

	private double propertyValue;

	@Lob
	private byte[] propertyProof;

	private int loanApplicationId;

	public PropertyDTO() {
		super();
	}

	public PropertyDTO(String propertyAddress, double propertyAreaInm2, double propertyValue, byte[] propertyProof,
			int loanApplicationId) {
		super();
		this.propertyAddress = propertyAddress;
		this.propertyAreaInm2 = propertyAreaInm2;
		this.propertyValue = propertyValue;
		this.propertyProof = propertyProof;
		this.loanApplicationId = loanApplicationId;
	}

	public int getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}

	public String getPropertyAddress() {
		return propertyAddress;
	}

	public void setPropertyAddress(String propertyAddress) {
		this.propertyAddress = propertyAddress;
	}

	public double getPropertyAreaInm2() {
		return propertyAreaInm2;
	}

	public void setPropertyAreaInm2(double propertyAreaInm2) {
		this.propertyAreaInm2 = propertyAreaInm2;
	}

	public double getPropertyValue() {
		return propertyValue;
	}

	public void setPropertyValue(double propertyValue) {
		this.propertyValue = propertyValue;
	}

	public byte[] getPropertyProof() {
		return propertyProof;
	}

	public void setPropertyProof(byte[] propertyProof) {
		this.propertyProof = propertyProof;
	}

	public int getLoanApplicationId() {
		return loanApplicationId;
	}

	public void setLoanApplicationId(int loanApplicationId) {
		this.loanApplicationId = loanApplicationId;
	}

	@Override
	public String toString() {
		return "PropertyDTO [propertyId=" + propertyId + ", propertyAddress=" + propertyAddress + ", propertyAreaInm2="
				+ propertyAreaInm2 + ", propertyValue=" + propertyValue + ", propertyProof="
				+ Arrays.toString(propertyProof) + ", loanApplicationId=" + loanApplicationId + "]";
	}
	
	
}
