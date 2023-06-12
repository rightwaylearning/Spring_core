package right.way.learning.third.application.employee;

import java.util.Date;

public class Employee {

	private String name;
	private Integer employeeId;
	private  Address address;
	private Date joiningDate;
	private Long[]  mobilesNumber;
	
	
	public void setMobilesNumber(Long[] mobilesNumber) {
		this.mobilesNumber = mobilesNumber;
	}
	
	public Long[] getMobilesNumber() {
		return mobilesNumber;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	
	public Date getJoiningDate() {
		return joiningDate;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Address getAddress() {
		return address;
	}

}
