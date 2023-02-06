package backend;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentQuery {
	static Statement statement = connector.getStatement(); 
	public static ResultSet getStudentName(String StudentID) {
		String query = "SELECT `Name` FROM `studentdetails` WHERE StudentID = '"+StudentID+"'";
		ResultSet result = null;
		try {
			result = statement.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
