package Singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
	private static Database instance;
	private static Statement stmt;
	private static Connection con;
	
	private Database() throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");  
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/site","root","");
		stmt = con.createStatement();
	}
	
	public static Database getInstance() throws ClassNotFoundException, SQLException {
		if(instance == null) {
			instance = new Database();
		}
		
		return instance;
	}
	
	public ResultSet query(String q) throws SQLException {
		ResultSet rs = stmt.executeQuery(q);  
		return rs;
	}
	
	public void closeCon() throws SQLException {
		con.close();
	}
}
