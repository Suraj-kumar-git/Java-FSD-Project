package com.hexaware.lms.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hexaware.lms.dto.LoanTypeDTO;
import com.hexaware.lms.entities.LoanType;

@SpringBootTest
class LoanTypeServiceImplTest {

	@Autowired
	ILoanTypeService serviceTest;
	
	@Test
	void testViewAvailableLoans() {
		List<LoanType> loans=serviceTest.viewAvailableLoans();
		assertNotNull(loans);
	}

	@Test
	void testCreateLoanType() {
		LoanTypeDTO loanTypeDto = new LoanTypeDTO("HOME LOAN",8.5,200.0);
		serviceTest.createLoanType(loanTypeDto);
	}

}
