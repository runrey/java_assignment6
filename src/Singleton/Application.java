package Singleton;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Application {
	public static void main(String args[]) throws ClassNotFoundException, SQLException 
	{
		Database foo = Database.getInstance();
		ResultSet rs = foo.query("SELECT * FROM users");
		while(rs.next())  
			System.out.println(rs.getInt("user_id")+"  "+rs.getString("username")+"  "+rs.getString("email"));  
		
		System.out.println("------------------------------------------");
			
		Database bar = Database.getInstance();
		ResultSet rs2 = bar.query("SELECT * FROM users");
		while(rs2.next())  
			System.out.println(rs2.getInt("user_id")+"  "+rs2.getString("username")+"  "+rs2.getString("email"));    
		
		foo.closeCon();
		bar.closeCon();
	}
}
