package com.hexaware.lms.service;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hexaware.lms.dto.LoanTypeDTO;

@SpringBootTest
class LoanTypeServiceImplTest {

	@Autowired
	ILoanTypeService serviceTest;
	@Test
	void testViewAvailableLoans() {
		
	}

	@Test
	void testCreateLoanType() {
		LoanTypeDTO loanTypeDto = new LoanTypeDTO("HOME LOAN",8.5,200.0);
		serviceTest.createLoanType(loanTypeDto);
	}

}
