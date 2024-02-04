package com.hexaware.lms.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hexaware.lms.dto.LoanApplicationDTO;
import com.hexaware.lms.dto.PropertyDTO;
import com.hexaware.lms.entities.LoanApplication;

@SpringBootTest
class LoanServiceImplTest {

	@Autowired
	ILoanService serviceTest;

	@Test
	void testApplyLoan() {
		LoanApplicationDTO loanDto = new LoanApplicationDTO(100000.0, 24, 1, 2, 3);
		PropertyDTO propertyDto = new PropertyDTO();
		LoanApplication newLoan= serviceTest.applyLoan(loanDto,propertyDto);
		assertNotNull(newLoan);
	}

}
