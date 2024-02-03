package com.hexaware.lms.dto;

public class LoanTypeDTO {
	
	private long loanTypeId;
	
	private String loanTypeName;
	
	private double loanInterestBaseRate;
	
	private double loanManagementFees;
	
	public LoanTypeDTO() {
		super();
	}

	public LoanTypeDTO(String loanTypeName, double loanInterestBaseRate, double loanManagementFees) {
		super();
		this.loanTypeName = loanTypeName;
		this.loanInterestBaseRate = loanInterestBaseRate;
		this.loanManagementFees = loanManagementFees;
	}

	public long getLoanTypeId() {
		return loanTypeId;
	}

	public void setLoanTypeId(long loanTypeId) {
		this.loanTypeId = loanTypeId;
	}

	public String getLoanTypeName() {
		return loanTypeName;
	}

	public void setLoanTypeName(String loanTypeName) {
		this.loanTypeName = loanTypeName;
	}

	public double getLoanInterestBaseRate() {
		return loanInterestBaseRate;
	}

	public void setLoanInterestBaseRate(double loanInterestBaseRate) {
		this.loanInterestBaseRate = loanInterestBaseRate;
	}

	public double getLoanManagementFees() {
		return loanManagementFees;
	}

	public void setLoanManagementFees(double loanManagementFees) {
		this.loanManagementFees = loanManagementFees;
	}

	@Override
	public String toString() {
		return "LoanTypeDTO [loanTypeId=" + loanTypeId + ", loanTypeName=" + loanTypeName + ", loanInterestBaseRate="
				+ loanInterestBaseRate + ", loanManagementFees=" + loanManagementFees + "]";
	}
	
	
}
