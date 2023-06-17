package right.way.learning.fourth.application;

public class School {

	private Building building;
	private Student student;
	
	public School() {
		System.out.println("I am default construtor");
	}
	
	public School(Building building, Student student) {
		super();
		System.out.println("Hi I am param constructor");
		this.building = building;
		this.student = student;
	}


	public Building getBuilding() {
		return building;
	}


	public Student getStudent() {
		return student;
	}
	
}
