package com.zensar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.bean.Customer;
import com.zensar.db.CustomerDAO;


@Service
public class CustomerService {

	@Autowired
	CustomerDAO customerdao;

	public Customer addCustomer(Customer customer) {
		return this.customerdao.save(customer);
	}

	public Customer updateCustomer(Customer customer) {
		return this.customerdao.save(customer);
	}

	public boolean deleteCustomer(Customer customer) {
		customerdao.delete(customer);
		return true;
	}

	public Customer viewCustomer(int custid) {
		return this.customerdao.findById(custid).get();
	}

	public List<Customer> viewALLCustomers() {
		return this.customerdao.findAll();

	}

}