package com.hexaware.lms.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

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
		LoanApplicationDTO loan = new LoanApplicationDTO();
		PropertyDTO property = new PropertyDTO();

		loan.setCustomerId(1052);
		loan.setLoanTypeId(3);
		loan.setPrincipal(97384735);
		loan.setTenureInMonths(48);
		loan.setLoanApplyDate(LocalDate.now());
		loan.setInterestRate(17);
		loan.setStatus("PENDING");

		property.setPropertyAddress("Bhopal");
		property.setPropertyAreaInm2(100000);
		property.setPropertyValue(1232423);
		property.setPropertyProof(new byte[5]);
		LoanApplication newLoan= serviceTest.applyLoan(loan,property);
		assertEquals(loan.getPrincipal(),newLoan.getPrincipal());
	}

}
