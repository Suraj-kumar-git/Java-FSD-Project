package com.hexaware.lms.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hexaware.lms.dto.CustomerDTO;
import com.hexaware.lms.entities.Customer;

@SpringBootTest
class CustomerServiceImplTest {

	@Autowired
	ICustomerService serviceTest;

	@Test
	void testLogin() {
//		String username="suraj@kumar.com";
//		String password="password123";
//		assertTrue(serviceTest.login(username, password));
	}

	@Test
	void testRegister() {
		CustomerDTO customer = new CustomerDTO();
		customer.setCustomerFirstName("Suraj");
		customer.setCustomerLastName("Kumar");
		customer.setEmail("Suraj@kumar.com");
		customer.setPhoneNumer(7352442612L);
		customer.setPassword("password123");
		customer.setDateOfBirth(LocalDate.of(2010, 10, 10));
		customer.setAddress("Muzaffarpur");
		customer.setCountry("India");
		customer.setState("Bihar");
		customer.setCreditScore(345);
		customer.setPanCardNumber("PAN123");
		customer.setIdProof(new byte[5]);
		customer.setRole("Regular");

		boolean isRegistered = serviceTest.register(customer);
		assertTrue(isRegistered);
	}

	@Test
	void testViewAllCustomers() {
		List<Customer> customers = serviceTest.viewAllCustomers();
		System.out.println("\n\n***********************\n");
		System.out.println(customers.get(0).getCustomerFirstName());
		System.out.println("\n\n");
		assertNotNull(customers);
	}

	@Test
	void testViewCustomerDetails() {
		long customerId=1001;
		Customer customer = serviceTest.viewCustomerDetails(customerId);
		assertNotNull(customer);
	}

}
