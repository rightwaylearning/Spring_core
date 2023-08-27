package rwl.com.applicationrestapi.api;

import org.springframework.stereotype.Component;

// binding class
@Component
public class Student {

	private String firstname;
	private String lastName;
	private Integer age;

	
	public Student() {}
	
	
	public Student(String firstname, String lastName, Integer age) {
		super();
		this.firstname = firstname;
		this.lastName = lastName;
		this.age = age;
	}


	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [firstname=" + firstname + ", lastName=" + lastName + ", age=" + age + "]";
	}
	
	

}
