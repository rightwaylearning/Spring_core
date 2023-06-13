package right.way.learning.third.application;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import right.way.learning.third.application.employee.Address;
import right.way.learning.third.application.employee.Employee;
import right.way.learning.third.application.employee.FamilyMember;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// there are 2 types of IOC container
		// 1] BeanFactory 2] ApplicationContext

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"right/way/learning/third/application/config/configuration.xml");

		Employee e = (Employee) context.getBean("emp");

		System.out.println(e.getName());
		System.out.println(e.getEmployeeId());

		Address adr = e.getAddress();
		System.out.println(adr);

		System.out.println(e.getJoiningDate());

		Long[] numbers = e.getMobilesNumber();

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		FamilyMember[] members = e.getMembers();

		for (FamilyMember m : members) {
			System.out.println(m);
		}

		List<Long>  list= e.getMobileNumberList();

		System.out.println(list);
		
		
		List<FamilyMember> members1 =e.getListOfMembers();
		System.out.println(members1);
		
		Set<Double> salaries = e.getLastThreeSalaries();
		System.out.println(salaries);

		Map<String, Double> map = e.getMonthWiseSalary();
		System.out.println(map);
		
		
		System.out.println(e.getProperties());
	}
}
