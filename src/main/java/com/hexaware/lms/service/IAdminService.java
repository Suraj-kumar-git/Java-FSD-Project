package com.hexaware.lms.service;

import java.util.List;

import com.hexaware.lms.entities.Admin;
import com.hexaware.lms.entities.Customer;
import com.hexaware.lms.entities.LoanApplication;

public interface IAdminService {
	boolean login(String role, String username, String password);

	boolean register(Admin admin);

	List<LoanApplication> adminViewAllLoans();

	List<LoanApplication> searchLoans(String loanType);

	Customer searchCustomer(String username);

	List<LoanApplication> loanApplicationsForAdmin();

	List<LoanApplication> filterLoansByStatus(String status);

	List<Customer> viewAllCustomers();

	Customer viewCustomerDetails(String username);

	List<LoanApplication> viewLoansOfCustomer(String username);

	void updateLoanStatus(String username, String status);
	
	void createAdmin(Admin admin);

}
