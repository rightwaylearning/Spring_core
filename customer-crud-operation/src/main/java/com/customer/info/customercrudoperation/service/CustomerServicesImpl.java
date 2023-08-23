package com.customer.info.customercrudoperation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.info.customercrudoperation.dao.CustomreDao;
import com.customer.info.customercrudoperation.entity.Customer;

@Service
public class CustomerServicesImpl implements CustomerServices{

	@Autowired
	private CustomreDao customreDao;

	@Override
	public Customer customerSave(Customer customer) {
		return customreDao.save(customer);
	}

	@Override
	public Iterable<Customer> saveBulkObjects(Iterable<Customer> list) {
		return customreDao.saveAll(list);
	}
}
