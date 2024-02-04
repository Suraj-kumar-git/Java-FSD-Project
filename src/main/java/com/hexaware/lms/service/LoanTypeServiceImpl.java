package com.hexaware.lms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.lms.dto.LoanTypeDTO;
import com.hexaware.lms.entities.LoanType;
import com.hexaware.lms.repository.LoanTypeRepository;

@Service
public class LoanTypeServiceImpl implements ILoanTypeService {

	@Autowired
	LoanTypeRepository repo;
	
	@Override
	public List<LoanType> viewAvailableLoans() {
		return repo.findAll();
	}

	@Override
	public void createLoanType(LoanTypeDTO loanTypeDto) {
		LoanType loanType = new LoanType();
		loanType.setLoanTypeName(loanTypeDto.getLoanTypeName());
		loanType.setLoanInterestBaseRate(loanTypeDto.getLoanInterestBaseRate());
		loanType.setLoanManagementFees(loanTypeDto.getLoanManagementFees());
		repo.save(loanType);
	}
	
	@Override
	public List<LoanType> searchDashboardLoansToApply(String loanType) {
		return repo.findAllByLoanTypeName(loanType);
	}

}
