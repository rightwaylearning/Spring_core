package com.customer.info.customercrudoperation.service;

import java.util.Optional;

import com.customer.info.customercrudoperation.entity.Customer;

public interface CustomerServices {

	// save single object if object is exits then update
	public Customer save(Customer customer);
	
	// save bulk object
	public Iterable<Customer> saveAll(Iterable<Customer> lsit);
	
	// find by Id
	public Optional<Customer> findById(Integer id);
	
	// confirmation is exit ??
	public boolean existsById(Integer id);
	
	// select * from T
	public Iterable<Customer> findAll();
	
	// search bulk object & also pass bulk Id object 
	public Iterable<Customer> findAllById(Iterable<Integer> ids);
	
	// select count(*) from T
	public long count();
	
   // single delete pass id as input
	public void deleteById(Integer id);
	
	// single delete pass object
	public void delete(Customer entity);
	
	// bulk delete pass input as Collection of ID
	public void deleteAllById(Iterable<Integer> ids);
	
	// bulk delete pass input as Collection of Customer object
	public void deleteAll(Iterable<Customer> entities);
	
	// delete from T
	public void deleteAll();
}
