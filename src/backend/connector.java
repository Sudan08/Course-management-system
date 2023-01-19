package backend;

import java.sql.DriverManager;
import java.sql.SQLException;

public class connector {

	public static void main(String[] args) throws SQLException {
		DriverManager.getConnection("jdbc:mysql://localhost:3307/","root","");
	}

}
