package right.way.learning.jdbc_demo_example.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBoperations {

	public void saveEmployeeData() throws Exception{
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mine?useSSL=false", "root", "root");

		//System.out.println(con.getClass().getName());
				
		PreparedStatement statement = con.prepareStatement("insert into employee values(1005,'mahesh','shinde','maheshshinde@gmail.com','male',7890)");
		
		int i = statement.executeUpdate();
		
		System.out.println(">>>>>>>>>>>>"+i);
		
		con.close();
	}
}
