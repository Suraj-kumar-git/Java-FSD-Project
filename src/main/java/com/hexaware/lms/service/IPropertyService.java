package com.hexaware.lms.service;

import com.hexaware.lms.dto.PropertyDTO;
import com.hexaware.lms.entities.Property;

public interface IPropertyService {
	
	void createProperty(PropertyDTO propertyDto);
	
	Property viewPropertyForLoan(long loanId);
}
