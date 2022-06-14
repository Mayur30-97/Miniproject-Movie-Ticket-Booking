package com.zensar.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.bean.Customer;
import com.zensar.service.CustomerService;


@RestController
public class CustomerController {
	@Autowired
	CustomerService service;

	@PostMapping(value = "/addcustomer")
	public Customer f1(@RequestBody Customer customer) {
		return this.service.addCustomer(customer);
	}

	@PutMapping(value = "/updatecustomer")
	public Customer f2(@RequestBody Customer customer) {
		return this.service.updateCustomer(customer);
	}

	@DeleteMapping(value = "/deletecustomer")
	public boolean f3(@RequestBody Customer customer) {
		return this.service.deleteCustomer(customer);

	}

	@GetMapping(value = "/viewcustomer/{custid}")
	public Customer f4(@PathVariable(name = "custid") int customerid) {
		return this.service.viewCustomer(customerid);
	}

	@GetMapping(value = "/viewcustomers/{movieid}")
	public List<Customer> f5(@PathVariable(name = "movieid") int movieid) {
		return this.service.viewALLCustomers();
	}

}