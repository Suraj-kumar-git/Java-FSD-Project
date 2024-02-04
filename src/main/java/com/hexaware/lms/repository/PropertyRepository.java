package com.hexaware.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hexaware.lms.entities.Property;

@Repository
public interface PropertyRepository extends JpaRepository<Property, Long> {
	
	@Query("SELECT p FROM Property p WHERE p.loanApplication.loanId = :loanId")
	Property findByLoanId(@Param("loanId") Long loanId);

}
