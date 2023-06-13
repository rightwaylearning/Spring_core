package right.way.learning.second.application.constructor;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {

	private String name;
	private Integer age;
	private Address adr;
	private Integer[] mobiles;
	private List<Long> numbers;
	private Set<Long> setValues;
	private Map<String, Integer> map;
	private Properties p;
	
	
	public Student(String name, Integer age, Address adr,Integer[] mobiles,List<Long> numbers,Set<Long> setValues,Map<String, Integer> map,Properties p) {
		super();
		this.name = name;
		this.age = age;
		this.adr = adr;
		this.mobiles = mobiles;
		this.numbers = numbers;
		this.setValues = setValues;
		this.map = map;
		this.p = p;
	}
	
	public Map<String, Integer> getMap() {
		return map;
	}
	
	public Set<Long> getSetValues() {
		return setValues;
	}
	public Properties getP() {
		return p;
	}
	
	public List<Long> getNumbers() {
		return numbers;
	}
	
	public Student() {
		System.out.println("hello....I am default");
	}
	
	
	public Integer getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	
	public Integer[] getMobiles() {
		return mobiles;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", adr=" + adr + "]";
	}

	
}
