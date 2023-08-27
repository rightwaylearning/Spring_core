package com.customer.info.customercrudoperation.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.info.customercrudoperation.dao.CustomreDao;
import com.customer.info.customercrudoperation.entity.Customer;

@Service
public class CustomerServicesImpl implements CustomerServices{

	@Autowired
	private CustomreDao customreDao;

	@Override
	public Customer save(Customer customer) {
		return customreDao.save(customer);
	}

	@Override
	public Iterable<Customer> saveAll(Iterable<Customer> list) {
		return customreDao.saveAll(list);
	}

	@Override
	public Optional<Customer> findById(Integer id) {
		Optional<Customer> optional =  this.customreDao.findById(id);
		return optional;
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return this.customreDao.existsById(id);
	}

	@Override
	public Iterable<Customer> findAll() {
		return this.customreDao.findAll();
	}

	@Override
	public Iterable<Customer> findAllById(Iterable<Integer> ids) {
		return this.customreDao.findAllById(ids);
	}

	@Override
	public long count() {
		return this.customreDao.count();
	}

	@Override
	public void deleteById(Integer id) {
		this.customreDao.deleteById(id);
		
	}

	@Override
	public void delete(Customer entity) {
		this.customreDao.delete(entity);
		
	}

	@Override
	public void deleteAllById(Iterable<Integer> ids) {
		this.customreDao.deleteAllById(ids);
	}

	@Override
	public void deleteAll(Iterable<Customer> entities) {
		this.customreDao.deleteAll(entities);
		
	}

	@Override
	public void deleteAll() {
		this.customreDao.deleteAll();		
	}
}
