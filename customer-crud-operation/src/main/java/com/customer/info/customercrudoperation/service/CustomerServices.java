package com.customer.info.customercrudoperation.service;

import com.customer.info.customercrudoperation.entity.Customer;

public interface CustomerServices {

	public Customer customerSave(Customer customer);
	public Iterable<Customer> saveBulkObjects(Iterable<Customer> lsit);
}
