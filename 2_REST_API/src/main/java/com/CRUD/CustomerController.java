package com.CRUD;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	@GetMapping("/") 
	public Customer getCustomer() {
		Customer cust = new Customer();
		cust.setId(1);
		cust.setName("Anju");
		cust.setEmail("Ak@gmail.com");
		cust.setPno(9973820581l);
		return cust;
	}
}
