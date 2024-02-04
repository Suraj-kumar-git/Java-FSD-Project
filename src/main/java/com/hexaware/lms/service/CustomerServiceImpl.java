package com.hexaware.lms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.lms.dto.CustomerDTO;
import com.hexaware.lms.entities.Customer;
import com.hexaware.lms.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	CustomerRepository repo;
	
	@Override
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean register(CustomerDTO customerDTO) {
		Customer customer = new Customer();
		customer.setCustomerFirstName(customerDTO.getCustomerFirstName());
		customer.setCustomerLastName(customerDTO.getCustomerLastName());
		customer.setEmail(customerDTO.getEmail());
		customer.setPhoneNumer(customerDTO.getPhoneNumer());
		customer.setPassword(customerDTO.getPassword());
		customer.setDateOfBirth(customerDTO.getDateOfBirth());
		customer.setAddress(customerDTO.getAddress());
		customer.setCountry("India");
		customer.setState(customerDTO.getState());
		customer.setCreditScore(customerDTO.getCreditScore());
		customer.setPanCardNumber(customerDTO.getPanCardNumber());
		customer.setIdProof(customerDTO.getIdProof());
		customer.setRole("Regular");
		
		Customer addedCustomer = repo.save(customer);
		if(addedCustomer != null) {
			return true;
		}
		return false;
	}

	@Override
	public List<Customer> viewAllCustomers() {
		return repo.findAll();
	}

	@Override
	public Customer viewCustomerDetails(long customerId) {
		return repo.findById(customerId).orElse(null);		
	}

}
