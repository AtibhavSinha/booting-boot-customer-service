package com.atibhav.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.atibhav.model.Customer;

@RestController
public class CustomerController {

	@RequestMapping(value="api/customers", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Customer>> getCustomers(){
		Customer customer1 = new Customer("Atibhav",1);
		Customer customer2 = new Customer("Sinha",1);
		List<Customer> customers = new ArrayList<>();
		customers.add(customer1);
		customers.add(customer2);
		return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
	}
}
