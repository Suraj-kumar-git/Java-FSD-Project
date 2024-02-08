package com.hexaware.lms.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hexaware.lms.dto.PropertyDTO;
import com.hexaware.lms.entities.Property;

@SpringBootTest
class PropertyServiceImplTest {
	
	@Autowired
	IPropertyService serviceTest;
	
	Logger log = LoggerFactory.getLogger(AdminServiceImplTest.class);
	
	Logger logger = LoggerFactory.getLogger(PropertyServiceImplTest.class);

	@Test
	void testCreateProperty() {
		String propertyAddress = "Bhopal";
        double propertyAreaInm2 = 150.5;
        double propertyValue = 250000.0;
        byte[] propertyProof = {};
        int loanApplicationId = 12345;

        PropertyDTO propertyDto = new PropertyDTO(
            propertyAddress, propertyAreaInm2, propertyValue,
            propertyProof, loanApplicationId
        );
		logger.info("Test running for creating property: "+propertyDto);
		serviceTest.createProperty(propertyDto);
	}

	@Test
	void testViewPropertyForLoan() {
		long loanID=2001;
		logger.info("Test running for viewing property of laon: "+loanID);
		Property property =serviceTest.viewPropertyForLoan(loanID);
		logger.info("Property found Id: "+property.getPropertyId());
		assertNotNull(property);
	}

}
