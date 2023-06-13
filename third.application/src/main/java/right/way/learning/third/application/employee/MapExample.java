package right.way.learning.third.application.employee;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class MapExample {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("s1", "Sandesh");
		map.put("s2", "Mahesh");
		
		
		System.out.println(map);
		
		
		Properties p = new Properties();
		p.setProperty("s1", "349873");
		p.setProperty("s2", "38898");
		
		System.out.println(p);
		
	}
}
