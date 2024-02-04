package com.hexaware.lms.service;

import java.util.List;

import com.hexaware.lms.dto.LoanTypeDTO;
import com.hexaware.lms.entities.LoanType;

public interface ILoanTypeService {
	List<LoanType> viewAvailableLoans();
	
	void createLoanType(LoanTypeDTO loanTypeDto);

	List<LoanType> searchDashboardLoansToApply(String loanType);
}
