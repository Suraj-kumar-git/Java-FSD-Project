package com.hexaware.lms.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

@Entity
public class LoanType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long loanTypeId;
	private String loanTypeName;
	@Column(name="interestRate")
	private double loanInterestBaseRate;
	
	private double loanManagementFees;
	
	@OneToMany(mappedBy="loanType")
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
	@Override
	public String toString() {
		return "LoanType [loanTypeId=" + loanTypeId + ", loanTypeName=" + loanTypeName + ", loanInterestBaseRate="
				+ loanInterestBaseRate + ", loanManagementFees=" + loanManagementFees + ", appliedLoans=" + appliedLoans
				+ "]";
	}
	

}
