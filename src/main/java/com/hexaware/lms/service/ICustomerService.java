package com.hexaware.lms.service;

import java.util.List;

import com.hexaware.lms.entities.Customer;
import com.hexaware.lms.entities.LoanApplication;

public interface ICustomerService {
	boolean login(String role, String username, String password);

	boolean register(Customer customer);
	
	double interestCalculator(double principal, double rate, int tenure);

	double emiCalculator(double principal, double rate, int tenure);

	List<LoanApplication> customerViewAllLoans();
	
	List<LoanApplication> searchAvaiableLoans(String loanType);
	
	List<LoanApplication> filterAvailableLoansByType(String loanType);
	
	List<LoanApplication> filterLoanByType(String loanType);
	
	List<LoanApplication> filterLoanByStatus(String status);
	
	LoanApplication applyLoan(LoanApplication loan);
}
