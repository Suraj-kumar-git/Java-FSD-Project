package com.hexaware.lms.service;

import java.util.List;

import com.hexaware.lms.dto.CustomerDTO;
import com.hexaware.lms.entities.Customer;

public interface ICustomerService {
	boolean login(String username, String password);

	boolean register(CustomerDTO customer);
	
	List<Customer> viewAllCustomers();
	
	Customer viewCustomerDetails(long customerId);
}
