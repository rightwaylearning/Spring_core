package right.way.learning.first.application;

public class Student {

	private Integer rollNumber;
	private String fullName;
	private String schoolName;
	
	
	public Student() {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
	}
	
	public Integer getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", fullName=" + fullName + ", schoolName=" + schoolName + "]";
	}
	
}
