package com.hexaware.lms.dto;

import java.time.LocalDate;

import com.hexaware.lms.entities.Customer;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class LoanApplicationDTO {
	
	private long loanId;

	private double principal;
	
	private double interestRate;
	
	private int tenureInMonths;
	
	private String status;
	
	private LocalDate loanApplyDate;
	
	private int loanTypeId;
	
	private int propertyId;
	
	private int customerId;

	public LoanApplicationDTO() {
		super();
	}

	public LoanApplicationDTO(double principal, int tenureInMonths,int loanTypeId,int propertyId,
			int customerId) {
		super();
		this.principal = principal;
		this.tenureInMonths = tenureInMonths;
		this.loanTypeId = loanTypeId;
		this.propertyId = propertyId;
		this.customerId = customerId;
	}

	public long getLoanId() {
		return loanId;
	}

	public void setLoanId(long loanId) {
		this.loanId = loanId;
	}

	public double getPrincipal() {
		return principal;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public int getTenureInMonths() {
		return tenureInMonths;
	}

	public void setTenureInMonths(int tenureInMonths) {
		this.tenureInMonths = tenureInMonths;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getLoanApplyDate() {
		return loanApplyDate;
	}

	public void setLoanApplyDate(LocalDate loanApplyDate) {
		this.loanApplyDate = loanApplyDate;
	}

	public int getLoanTypeId() {
		return loanTypeId;
	}

	public void setLoanTypeId(int loanTypeId) {
		this.loanTypeId = loanTypeId;
	}

	public int getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "LoanApplicationDTO [loanId=" + loanId + ", principal=" + principal + ", interestRate=" + interestRate
				+ ", tenureInMonths=" + tenureInMonths+ ", status=" + status
				+ ", loanApplyDate=" + loanApplyDate + ", loanTypeId=" + loanTypeId + ", propertyId=" + propertyId
				+ ", customerId=" + customerId + "]";
	}
	
	
}
