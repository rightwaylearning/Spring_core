package right.way.learning.third.application.employee;

public class FamilyMember {

	private String name;
	private Integer age;
	private String relationShip;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getRelationShip() {
		return relationShip;
	}

	public void setRelationShip(String relationShip) {
		this.relationShip = relationShip;
	}

	@Override
	public String toString() {
		return "FamilyMember [name=" + name + ", age=" + age + ", relationShip=" + relationShip + "]";
	}

}
