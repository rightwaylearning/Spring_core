package com.customer.info.customercrudoperation.binding.classes;

import org.springframework.stereotype.Component;

@Component
public class CustomerModel {


	private Integer custometId;
	
	private String customerFirstName;
	
	private String customerLastName;
	
	private Long contactNumber;
	
	private String email;
	
	public CustomerModel() {}

	public Integer getCustometId() {
		return custometId;
	}

	public CustomerModel(Integer custometId, String customerFirstName, String customerLastName, Long contactNumber,
			String email) {
		super();
		this.custometId = custometId;
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.contactNumber = contactNumber;
		this.email = email;
	}

	public void setCustometId(Integer custometId) {
		this.custometId = custometId;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public Long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [custometId=" + custometId + ", customerFirstName=" + customerFirstName + ", customerLastName="
				+ customerLastName + ", contactNumber=" + contactNumber + ", email=" + email + "]";
	}
		
}
