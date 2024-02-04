package com.hexaware.lms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.hexaware.lms.entities.LoanApplication;

public interface LoanRepository extends JpaRepository<LoanApplication,Long> {
	
	LoanApplication findByLoanId(long loanId);
	
	List<LoanApplication> findAllByCustomerCustomerId(long customerId);
	
	@Query("update LoanApplication lp set lp.status=?1 where lp.loanId=?2")
	@Modifying
	void updateLoanStatus(String status,long loanId);
}
