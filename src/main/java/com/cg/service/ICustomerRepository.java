package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.CustomerDao;
import com.cg.model.Customer;
import com.cg.model.Driver;

@Service
public class ICustomerRepository implements ICustomerService
{

	@Autowired
	CustomerDao Cdao;
	
	public List<Customer>viewCustomers()
	{
		List<Customer>cList=Cdao.findAll();
		System.out.println(cList);
		return cList;
		
	}
	
	public Customer insertCustomer(Customer c)
	{
		Customer c1 = Cdao.save(c);
		return c1;
	}
	
	public Customer viewCustomer(int id)
	{
		Optional<Customer> op= Cdao.findById(id);
		Customer c= op.get();
		return c;
	}
	
	public Customer deleteCustomer(int CustomerId)
	 {
		
//		Customer c=null;
//		if(Cdao.existsById(CustomerId))
//		{
//		Optional<Customer> oe= Cdao.findById(CustomerId);
//		c=oe.get();
//		Cdao.deleteById(CustomerId);
//		return c;
//		}
//		else
//		return c;
		 if(Cdao.existsById(CustomerId))
		 {
			 Optional<Customer> op=Cdao.findById(CustomerId);
			 Customer c1= op.get();
			 Cdao.deleteById(CustomerId);
			 return c1;
		 }
		 else
		 return null;
	 }
	

	 public Customer updateCustomer(Customer c )
	 {
		 Customer c1=Cdao.save(c);
		 return c1;
	 }
	
}
