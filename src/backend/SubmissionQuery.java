package backend;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class SubmissionQuery {
	
	static Statement statement = connector.getStatement(); 

	public static ResultSet getQuestion(String ID) {
		
			String getQuery = "SELECT Question FROM `assigment` WHERE AssignmentID = '"+ID+"'";
			
			ResultSet resultSet = null;
			try {
				resultSet = statement.executeQuery(getQuery);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			 
			return resultSet;
	}
		
public static void InsertQuery(HashMap<String , String> data) {
	
		
		String insertQuery = "INSERT INTO `stdsubmission`(`AssignmentID`, `Module`,`StudentID`,`UniID`, `StudentName`,`Question`,`Answer` ,`Marks`,`Published`) VALUES ('"+data.get("AssignmentID")+"','"+data.get("Module")+"','"+data.get("StudentID")+"','"+data.get("UniID")+"','"+data.get("StudentName")+"','"+data.get("Question")+"','"+data.get("Answer")+"','"+data.get("Marks")+"','false')";
		
		
		try {
			int insertSuccess = statement.executeUpdate(insertQuery);
			if(insertSuccess == 1) {
				System.out.println("Inserted");
			}else {
				System.out.println("No insert");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	

public static ResultSet SelectQuery() {
	String getQuery = "SELECT * FROM `stdsubmission`"; 
	
	ResultSet resultSet = null;
	try {
		resultSet = statement.executeQuery(getQuery);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	 
	return resultSet;
}
public static void UpdateMarksQuery(HashMap<String, String> updateData) {
	
	
	String insertQuery = "UPDATE `stdsubmission` SET `SubmissionID`='[value-1]',`AssignmentID`='[value-2]',`Module`='[value-3]',`StudentID`='[value-4]',`UniID`='[value-5]',`StudentName`='[value-6]',`Question`='[value-7]',`Answer`='[value-8]',`Marks`='[value-9]',`Published`='[value-10]' WHERE 1";
	
	
	try {
		int insertSuccess = statement.executeUpdate(insertQuery);
		if(insertSuccess == 1) {
			System.out.println("Inserted");
		}else {
			System.out.println("No insert");
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}	
}
