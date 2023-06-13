package right.way.learning.third.application.employee;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {

	private String name;
	private Integer employeeId;
	private Address address;
	private Date joiningDate;
	private Long[]  mobilesNumber;
	private FamilyMember[] members;
	private List<Long> mobileNumberList;
	private List<FamilyMember> listOfMembers;
	private Set<Double> lastThreeSalaries;
	private Set<FamilyMember> mobileNumberSet;
	private Map<String, Double>  monthWiseSalary;
	private Properties properties;
	
	
	public Properties getProperties() {
		return properties;
	}
	
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	
	public Map<String, Double> getMonthWiseSalary() {
		return monthWiseSalary;
	}
	
	public void setMonthWiseSalary(Map<String, Double> monthWiseSalary) {
		this.monthWiseSalary = monthWiseSalary;
	}
	
	public Set<FamilyMember> getMobileNumberSet() {
		return mobileNumberSet;
	}
	
	public void setMobileNumberSet(Set<FamilyMember> mobileNumberSet) {
		this.mobileNumberSet = mobileNumberSet;
	}
	
	public void setLastThreeSalaries(Set<Double> lastThreeSalaries) {
		this.lastThreeSalaries = lastThreeSalaries;
	}
	
	public Set<Double> getLastThreeSalaries() {
		return lastThreeSalaries;
	}
	
	public List<FamilyMember> getListOfMembers() {
		return listOfMembers;
	}
	
	public void setListOfMembers(List<FamilyMember> listOfMembers) {
		this.listOfMembers = listOfMembers;
	}
	
	public List<Long> getMobileNumberList() {
		return mobileNumberList;
	}
	
	public void setMobileNumberList(List<Long> mobileNumberList) {
		this.mobileNumberList = mobileNumberList;
	}
	
	public FamilyMember[] getMembers() {
		return members;
	}
	
	public void setMembers(FamilyMember[] members) {
		this.members = members;
	}
	
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
