package com.customer.info.customercrudoperation.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.customer.info.customercrudoperation.entity.Customer;

                                       // 12                          +                    2
public interface CustomreDao extends CrudRepository<Customer,Integer>, PagingAndSortingRepository<Customer, Integer> {
}
