package com.customer.info.customercrudoperation.utility;

import java.util.ArrayList;
import java.util.List;

import com.customer.info.customercrudoperation.binding.classes.CustomerModel;
import com.customer.info.customercrudoperation.entity.Customer;

public class ObjectConvertor {

	public static Customer covertorCustModeltoCutomer(CustomerModel model) {
	  return new Customer(model.getCustometId(), model.getCustomerFirstName(), model.getCustomerLastName(), model.getContactNumber(), model.getEmail());
	}
	
	public static Iterable<Customer> covertorCustModeltoCutomer(List<CustomerModel> models) {
		  List<Customer> list = new ArrayList<>();

		  for(CustomerModel model:models) {
			  list.add(covertorCustModeltoCutomer(model));
		  }
		  return list;
	
	}
	
	public static Iterable<CustomerModel> covertorCutomerToCustModel(Iterable<Customer> customer) {
		  List<CustomerModel> list = new ArrayList<>();

		  for(Customer model:customer) {
			  list.add(new CustomerModel(model.getCustometId(), model.getCustomerFirstName(), model.getCustomerLastName(), model.getContactNumber(), model.getEmail()));
		  }
		  return list;
	
	}
	
	public static CustomerModel covertorCutomertoCustomerModle(Customer model) {
		  return new CustomerModel(model.getCustometId(), model.getCustomerFirstName(), model.getCustomerLastName(), model.getContactNumber(), model.getEmail());
		}
}
