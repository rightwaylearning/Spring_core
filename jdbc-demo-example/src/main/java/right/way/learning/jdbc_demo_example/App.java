package right.way.learning.jdbc_demo_example;

import right.way.learning.jdbc_demo_example.insert.DBoperations;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		try {
			new DBoperations().saveEmployeeData();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
