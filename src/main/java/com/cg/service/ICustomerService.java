package com.cg.service;

import java.util.List;

import com.cg.model.Customer;

public interface ICustomerService 
{
       
	public Customer insertCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public Customer deleteCustomer(int customerId );
	public Customer viewCustomer(int customerId);
	public List<Customer> viewCustomers();
	//public Customer validateCustomer(String userName, String password);
	
}
