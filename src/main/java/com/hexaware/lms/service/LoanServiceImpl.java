package com.hexaware.lms.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.lms.dto.LoanApplicationDTO;
import com.hexaware.lms.dto.PropertyDTO;
import com.hexaware.lms.entities.Customer;
import com.hexaware.lms.entities.LoanApplication;
import com.hexaware.lms.entities.LoanType;
import com.hexaware.lms.entities.Property;
import com.hexaware.lms.repository.CustomerRepository;
import com.hexaware.lms.repository.LoanRepository;
import com.hexaware.lms.repository.LoanTypeRepository;
import com.hexaware.lms.repository.PropertyRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class LoanServiceImpl implements ILoanService{

	
	private final PropertyRepository propertyRepo;
	@Autowired
    public LoanServiceImpl(PropertyRepository propertyRepo) {
        this.propertyRepo = propertyRepo;
    }
	
	@Autowired
	LoanTypeRepository loanTypeRepo;
	
	@Autowired
	CustomerRepository custRepo;
	
	@Autowired
	LoanRepository loanRepo;
	
	@Override
	public LoanApplication applyLoan(LoanApplicationDTO loanDto,PropertyDTO propertyDto) {
		long loanTypeId=loanDto.getLoanTypeId();
		long customerId =loanDto.getCustomerId();
		
		LoanType loanType = loanTypeRepo.findById(loanTypeId).orElse(null);
		double interestRate = loanTypeRepo.findLoanInterestBaseRateByLoanId(loanDto.getLoanTypeId());
		Customer customer = custRepo.findById(customerId).orElse(null);
		LocalDate loanApplicationDate = LocalDate.now();
		
		LoanApplication loan = new LoanApplication();
		loan.setCustomer(customer);
		loan.setLoanType(loanType);
		loan.setPrincipal(loanDto.getPrincipal());
		loan.setTenureInMonths(loanDto.getTenureInMonths());
		loan.setLoanApplyDate(loanApplicationDate);
		loan.setInterestRate(interestRate);
		loan.setStatus("PENDING");
		
		Property property = new Property();
		property.setPropertyAddress(propertyDto.getPropertyAddress());
		property.setPropertyAreaInm2(propertyDto.getPropertyAreaInm2());
		property.setPropertyValue(propertyDto.getPropertyValue());
		property.setPropertyProof(propertyDto.getPropertyProof());
		property.setLoanApplication(loan);
		loan.setProperty(property);
		return loanRepo.save(loan);
	}

	@Override
	public double interestCalculator(double principal, double rate, int tenure) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double emiCalculator(double principal, double rate, int tenure) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<LoanApplication> filterAppliedLoanByType(long customerId,String loanType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LoanApplication> filterAppliedLoanByStatus(long customerId,String status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LoanApplication searchAppliedLoan(long loanId) {
		return loanRepo.findByLoanId(loanId);
	}

	@Override
	public List<LoanApplication> allAppliedLoansOfCustomer(long customerId) {
		return loanRepo.findAllByCustomerCustomerId(customerId);
	}
	
	@Override
	public List<LoanApplication> allAppliedLoansOfCustomerForAdmin() {
		return loanRepo.findAll();
	}
	
	@Override
	public void customerUpdateLoanStatus(long loanId, String status) {
		loanRepo.updateLoanStatus(status, loanId);
	}
	
}
