package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database_reader {

	public static String retrieve_data(String anyColumn) throws Throwable {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
	
		String url ="jdbc:mysql://localhost:3306/alain_data";
		String sqlName ="root";
		String sqlPassword ="Kigalirw@1";
		String querry ="select *from login_data";
		
		Connection conect = DriverManager.getConnection(url,sqlName, sqlPassword);
		Statement statment = conect.createStatement();
		ResultSet result = statment.executeQuery(querry);
		
		while (result.next())
		{
			return result.getString(anyColumn);
			
			
		}
		
		
		
		
		return anyColumn;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
