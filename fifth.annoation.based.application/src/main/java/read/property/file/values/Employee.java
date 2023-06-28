package read.property.file.values;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
@PropertySource(value = "classpath:read/property/file/values/employee_property.properties")
public class Employee {

	@Value("${employee_name}")
	private String name;
	
	@Value("${employee_id}")
	private Integer employeeId;
	
	@Value("${employee_salary}")
	private Double salary;
	
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
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeId=" + employeeId + ", salary=" + salary + "]";
	}
	
}
