package com.hexaware.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.lms.dto.AdminDTO;
import com.hexaware.lms.dto.LoanTypeDTO;
import com.hexaware.lms.entities.LoanApplication;
import com.hexaware.lms.service.IAdminService;
import com.hexaware.lms.service.ILoanService;
import com.hexaware.lms.service.ILoanTypeService;

@RestController
@RequestMapping("/api/admin")
public class AdminRestController {
	
	@Autowired
	IAdminService adminService;
	
	@Autowired
	ILoanTypeService loanTypeService;
	
	@Autowired
	ILoanService loanService;
	
	@PostMapping("/createLoanType")
	public String createNewLoanType(@RequestBody LoanTypeDTO loanTypeDto) {
		loanTypeService.createLoanType(loanTypeDto);
		return "Loan Type created";
	}
	
	@PostMapping("/createNewAdmin")
	public boolean createNewAdmin(@RequestBody AdminDTO adminDto) {
		return adminService.register(adminDto);
	}
	
	@PostMapping("/login/{username}/{password}")
	public boolean login(@PathVariable (name="username") String username,@PathVariable(name="password") String password) {
		return adminService.login(username,password);
	}
	
	@PutMapping("/update-customer-loan-status/{loanId}/{status}")
	public void updateLoanStatus(@PathVariable long loanId,@PathVariable String status) {
		loanService.customerUpdateLoanStatus(loanId, status);
	}
	
	@GetMapping(value="/viewAllLoans",produces="application/json")
	public List<LoanApplication> viewAllLoans() {
		return loanService.allAppliedLoansOfCustomerForAdmin();
	}
}
