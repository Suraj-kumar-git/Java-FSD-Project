package com.hexaware.lms.service;

import java.util.List;

import com.hexaware.lms.dto.LoanApplicationDTO;
import com.hexaware.lms.dto.PropertyDTO;
import com.hexaware.lms.entities.LoanApplication;
import com.hexaware.lms.entities.LoanType;

public interface ILoanService {
	
	LoanApplication applyLoan(LoanApplicationDTO loan, PropertyDTO propertyDto); //DONE

	double interestCalculator(double principal, double rate, int tenure);

	double emiCalculator(double principal, double rate, int tenure);

	List<LoanApplication> filterAppliedLoanByType(long customerId,String loanType);

	List<LoanApplication> filterAppliedLoanByStatus(long customerId,String status);

	LoanApplication searchAppliedLoan(long loanId); //DONE
	
	void customerUpdateLoanStatus(long loanId, String status);  //DONE

	List<LoanApplication> allAppliedLoansOfCustomer(long customerId); //DONE

	List<LoanApplication> allAppliedLoansOfCustomerForAdmin();
}
