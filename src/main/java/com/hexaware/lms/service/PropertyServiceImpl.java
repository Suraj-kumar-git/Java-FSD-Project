package com.hexaware.lms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.lms.dto.PropertyDTO;
import com.hexaware.lms.entities.LoanApplication;
import com.hexaware.lms.entities.Property;
import com.hexaware.lms.repository.LoanRepository;
import com.hexaware.lms.repository.PropertyRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PropertyServiceImpl implements IPropertyService {

	private final PropertyRepository propertyRepo;

	@Autowired
    public PropertyServiceImpl(PropertyRepository propertyRepo) {
        this.propertyRepo = propertyRepo;
    }
    

	@Autowired
	LoanRepository loanRepo;

	@Override
	public void createProperty(PropertyDTO propertyDto) {
		Property property = new Property();
		property.setPropertyAddress(propertyDto.getPropertyAddress());
		property.setPropertyAreaInm2(propertyDto.getPropertyAreaInm2());
		property.setPropertyValue(propertyDto.getPropertyValue());
		property.setPropertyProof(propertyDto.getPropertyProof());

		LoanApplication loanApplication = loanRepo.findById(propertyDto.getLoanApplicationId()).orElse(null);
		property.setLoanApplication(loanApplication);
		propertyRepo.save(property);

	}

	@Override
	public Property viewPropertyForLoan(long loanId) {
		return propertyRepo.findByLoanId(loanId);
	}

}
