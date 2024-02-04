package com.hexaware.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.lms.dto.CustomerDTO;
import com.hexaware.lms.dto.LoanApplicationDTO;
import com.hexaware.lms.dto.LoanApplicationRequestDTO;
import com.hexaware.lms.dto.PropertyDTO;
import com.hexaware.lms.entities.LoanApplication;
import com.hexaware.lms.entities.LoanType;
import com.hexaware.lms.service.ICustomerService;
import com.hexaware.lms.service.ILoanService;
import com.hexaware.lms.service.ILoanTypeService;
import com.hexaware.lms.service.IPropertyService;

@RestController
@RequestMapping("/api/customer")
public class CustomerRestController {
	
	@Autowired
	ICustomerService customerService;
	
	@Autowired
	IPropertyService propService;
	
	@Autowired
	ILoanService loanService;
	
	@Autowired
	ILoanTypeService loanTypeService;
	
	@PostMapping("/register")
	public boolean registerCustomer(@RequestBody CustomerDTO customerDTO) {
		return customerService.register(customerDTO);
	}
	
	@PostMapping("/login/{username}/{password}")
	public boolean login(@PathVariable (name="username") String username,@PathVariable(name="password") String password) {
		return customerService.login(username,password);
	}
	
	@PostMapping("/loan-application/applyLoan/propertyDetails")
	public String propertyDetails(@RequestBody PropertyDTO propertyDto) {
		propService.createProperty(propertyDto);
		return "Your property record has been uploaded";
	}
	
	@PostMapping(value="/loan-application/applyLoan",consumes="application/json")
	public LoanApplication applyLoan(@RequestBody LoanApplicationRequestDTO loanRequest) {
		return loanService.applyLoan(loanRequest.getLoanApplicationDto(),loanRequest.getPropertyDto());
	}
	
	@GetMapping("/searchLoanById/{loanId}")
	public LoanApplication searchLoanById(@PathVariable long loanId) {
		return loanService.searchAppliedLoan(loanId);
	}
	
	@GetMapping("/viewAllAppliedLoans/{customerId}")
	public List<LoanApplication> viewAllAppliedLoans(@PathVariable long customerId){
		return loanService.allAppliedLoansOfCustomer(customerId);
	}
	
	@GetMapping("/dashboard")
	public List<LoanType> viewAllAvailableLoans() {
		return loanTypeService.viewAvailableLoans();
	}
	
	@GetMapping("/dashboard/{loanType}")
	public List<LoanType> filterDashboardLoans(@PathVariable String loanType){
		return loanTypeService.searchDashboardLoansToApply(loanType);
	}
}
