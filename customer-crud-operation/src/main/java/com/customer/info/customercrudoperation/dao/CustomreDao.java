package com.customer.info.customercrudoperation.dao;

import org.springframework.data.repository.CrudRepository;

import com.customer.info.customercrudoperation.entity.Customer;


public interface CustomreDao extends CrudRepository<Customer,Integer> {

}
