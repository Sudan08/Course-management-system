package backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class connector {

	public connector() {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/cms","root","");
			Statement statement = connection.createStatement();
			String sqlSelectQuery = "SELECT * FROM `landlord`"; 
			ResultSet select = statement.executeQuery(sqlSelectQuery);
			select.next();
			System.out.println(select.getString("Name"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new connector();
	}

}
