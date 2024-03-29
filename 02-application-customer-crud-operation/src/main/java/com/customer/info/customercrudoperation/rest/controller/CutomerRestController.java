package com.customer.info.customercrudoperation.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.customer.info.customercrudoperation.binding.classes.CustomerModel;
import com.customer.info.customercrudoperation.entity.Customer;
import com.customer.info.customercrudoperation.service.CustomerServices;
import com.customer.info.customercrudoperation.utility.ObjectConvertor;

@RestController
@RequestMapping("/api")
public class CutomerRestController {

	@Autowired
	private CustomerServices customerServices;
	// http://localhost:8080/api/save + post	
	
	//  http://localhost:8080/api/save
	@PostMapping(value = "/save", consumes = "application/json")
    public Object saveCustomer(@RequestBody CustomerModel customerMOdel){
		Customer cust = ObjectConvertor.covertorCustModeltoCutomer(customerMOdel);
		Customer customer = customerServices.save(cust);
		return null;
	}
	 //http://localhost:8080/api/saveall
	@PostMapping(value = "/saveall", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Iterable<Customer>> saveAllCustomer(@RequestBody List<CustomerModel> customerMOdel){
		Iterable<Customer> cust  = ObjectConvertor.covertorCustModeltoCutomer(customerMOdel);
		Iterable<Customer> customer = customerServices.saveAll(cust);
		return new ResponseEntity<Iterable<Customer>>(customer, HttpStatus.OK);
	}
	
	BasicErrorController b= null;
	 //  http://localhost:8080/api/customers
	@GetMapping("/customers")
	public ResponseEntity<Iterable<Customer>> getAllCustomer(){
		Iterable<Customer> customers = customerServices.findAll();
		return new ResponseEntity<Iterable<Customer>>(customers,HttpStatus.OK);
	} 
		
//  http://localhost:8080/api/customer/1234
	@GetMapping("/customer/{customerId}")
	public ResponseEntity<Customer> getCustomer(@PathVariable Integer customerId){
		Optional<Customer> customer = customerServices.findById(customerId);
		if(customer.isPresent()) {
			return new ResponseEntity<Customer>(customer.get(),HttpStatus.OK);
		}else {
			return new ResponseEntity<Customer>(new Customer(),HttpStatus.OK);
		}
	} 
	
	// public boolean existsById(Integer id);
	
	@GetMapping(value = "/isexist")
	public ResponseEntity<Boolean> checkCustometIsExist(@RequestParam("customerId") Integer customerId){
		return new ResponseEntity<Boolean>(this.customerServices.existsById(customerId),HttpStatus.OK);
	}
	
	// public long count();
	
	@GetMapping(value = "/count")
	public ResponseEntity<Long> getCount(){
		return new ResponseEntity<Long>(this.customerServices.count(),HttpStatus.OK);
	}

	@DeleteMapping(value = "/delete")
	public ResponseEntity<Boolean> deleteById(@RequestParam("customerId") Integer customerId){
		this.customerServices.deleteById(customerId);
		return new ResponseEntity<Boolean>(!this.customerServices.existsById(customerId),HttpStatus.OK);
	}
	
	@PutMapping(value = "/delete")
	public ResponseEntity<Boolean> deleteById(@RequestBody CustomerModel customer){
		this.customerServices.delete(ObjectConvertor.covertorCustModeltoCutomer(customer));
		return new ResponseEntity<Boolean>(!this.customerServices.existsById(customer.getCustometId()),HttpStatus.OK);
	}
	
	@GetMapping("/codeondemand")
	public String getCode() {
		return "<a href='https://www.google.com/maps/@18.552169,73.9313543,15z?entry=ttu'>My Current Location</a>";
	}
	
}







