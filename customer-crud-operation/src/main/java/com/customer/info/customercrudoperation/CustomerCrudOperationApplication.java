package com.customer.info.customercrudoperation;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.customer.info.customercrudoperation.entity.Customer;
import com.customer.info.customercrudoperation.service.CustomerServices;

@SpringBootApplication
public class CustomerCrudOperationApplication implements ApplicationRunner{
	
	@Autowired
	private CustomerServices customerServices;

	public static void main(String[] args) {
		SpringApplication.run(CustomerCrudOperationApplication.class, args);
	}

	
	@Override
	public void run(ApplicationArguments args) throws Exception {
	
		// single object save
//		Customer cust = new Customer(103,"radhu","nandan",9845673890L,"raghunandan@gmail.com");
//	    Customer saveObj=customerServices.customerSave(cust);
//	    System.out.println(saveObj);
	
		
		ArrayList<Customer> list = new ArrayList<>();
		list.add(new Customer(107,"A","B",6253763L,"ab@gmail.com"));
		list.add(new Customer(108,"AA","BB",6253763L,"abb@gmail.com"));
		list.add(new Customer(109,"AAA","BBB",6253763L,"abbb@gmail.com"));
		
		Iterable<Customer> savedList= customerServices.saveBulkObjects(list);
		System.out.println(savedList);
	}

}
