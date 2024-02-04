package com.hexaware.lms.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class LoanType{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long loanTypeId;
	private String loanTypeName;
	@Column(name="interestRate")
	private double loanInterestBaseRate;
	
	private double loanManagementFees;
	
	@OneToMany(mappedBy="loanType",cascade=CascadeType.ALL)
	private List<LoanApplication> appliedLoans = new ArrayList<>();
	public LoanType() {
		super();
	}
	public LoanType(String loanTypeName, double loanInterestBaseRate, double loanManagementFees) {
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
	public List<LoanApplication> getAppliedLoans() {
		return appliedLoans;
	}
	public void setAppliedLoans(List<LoanApplication> appliedLoans) {
		this.appliedLoans = appliedLoans;
	}
	

}
