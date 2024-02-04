package com.hexaware.lms.service;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hexaware.lms.dto.PropertyDTO;

@SpringBootTest
class PropertyServiceImplTest {
	
	@Autowired
	IPropertyService serviceTest;

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
		
		serviceTest.createProperty(propertyDto);
	}

	@Test
	void testViewPropertyOfCustomer() {
		
	}

}
