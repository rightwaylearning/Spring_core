package com.customer.info.customercrudoperation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.customer.info.customercrudoperation.entity.Customer;
import com.customer.info.customercrudoperation.service.CustomerServices;

@EnableWebMvc
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
//	    Customer saveObj=customerServices.save(cust);
//	    System.out.println(saveObj);
	
		
//		ArrayList<Customer> list = new ArrayList<>();
//		list.add(new Customer(107,"A","B",6253763L,"ab@gmail.com"));
//		list.add(new Customer(108,"AA","BB",6253763L,"abb@gmail.com"));
//		list.add(new Customer(109,"AAA","BBB",6253763L,"abbb@gmail.com"));
//		
//		Iterable<Customer> savedList= customerServices.saveAll(list);
//		System.out.println(savedList);
		
//		Optional<Customer> optional =  this.customerServices.findById(102);   
//		
//		if(optional.isPresent()) {
//			Customer c = optional.get();
//			System.out.println(c);
//		}
//		
//		List<Integer> list = new ArrayList<>();
//		list.add(102); list.add(103); list.add(14);
//		
//		 Iterable<Customer> customers = this.customerServices.findAllById(list);
//		
//		 System.out.println(customers);
		
//		
//		long count = this.customerServices.count();
//		System.out.println(count);
		
		
//		 Page<Customer> page= customerServices.findMypage(PageRequest.of(1, 3, Sort.by("customerFirstName")));
//		 page.get().forEach(System.out::println);
//		
		List<Order> list = new ArrayList<>();
		list.add(Order.by("customerFirstName"));
		list.add(Order.by("customerLastName"));
		
		Iterable<Customer> data = customerServices.findAllByMyOrder(Sort.by(list));
	
	     data.forEach(System.out::println);
	}

}
