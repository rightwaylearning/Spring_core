package right.way.learning.jdbc_demo_example.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public static Connection getConnection() throws Exception {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mine?useSSL=false", "root", "root");
		return  con;
	}
	
	
}
