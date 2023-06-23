package right.way.learning.third.application.lookup.method.injection;

public class Student {
	
	private String name;
	private Long cellNumber;
	
	public Student() {
		System.out.println("I am Student class Constructor");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getCellNumber() {
		return cellNumber;
	}
	public void setCellNumber(Long cellNumber) {
		this.cellNumber = cellNumber;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", cellNumber=" + cellNumber + "]";
	}
	
}
