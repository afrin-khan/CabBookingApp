package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.model.Customer;
import com.cg.service.ICustomerRepository;


@RestController
public class CustomerController
{
    @Autowired
    ICustomerRepository CS;
    
    @GetMapping("/viewCustomers")
    public List<Customer>viewCustomers()
    {
    	List<Customer>crList = CS.viewCustomers();
		return crList;
    }
	
    
    @PostMapping("/insertCustomer")
	public Customer insertCustomer(@RequestBody Customer c) 
	{
    	Customer c1 = CS.insertCustomer(c);
		return c1;
	}
    
    @GetMapping("/viewCustomer/{id}")
   	public Customer viewCustomer(@PathVariable("id") int CustomerId )
       {
    	Customer c = CS.viewCustomer(CustomerId);
   		return c;
   	}
    
    @DeleteMapping("/deleteCustomer/{id}")
	public Customer deleteCustomer(@PathVariable("id") int CustomerId )
	{
    	Customer c = CS.deleteCustomer(CustomerId);
		return c;
	}
    
    @PutMapping("/updateCustomer")
	public Customer updateCustomer(@RequestBody Customer c  ) 
	{
    	Customer c1 = CS.updateCustomer(c);
		return c1;
	}
    
    
}
