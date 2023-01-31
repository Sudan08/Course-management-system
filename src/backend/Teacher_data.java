package backend;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Teacher_data {
	private static ResultSet resultSet;
	
	List<Integer> Db_id = new ArrayList<>();
	List<String> Name = new ArrayList<>();
	List<String> DOB = new ArrayList<>();
	List<String> phoneNumber = new ArrayList<>();
	List<String> Address= new ArrayList<>();
	 List<String> EmailAddress = new ArrayList<>();
	 List<String> Module = new ArrayList<>();
	List<String> Qualification = new ArrayList<>();
	 List<String> Position = new ArrayList<>();
	 List<String> Gender = new ArrayList<>();
	 int counter =0;
	 

	 

	public int getCounter() {
		return counter;
	}



	public Integer getDb_id(int i) {
		return Db_id.get(i);
	}



	public String getName(int i) {
		return Name.get(i);
	}



	public String getDOB(int i) {
		return DOB.get(i);
	}



	public String getPhoneNumber(int i) {
		return phoneNumber.get(i);
	}



	public String getAddress(int i) {
		return Address.get(i);
	}



	public String getEmailAddress(int i) {
		return EmailAddress.get(i);
	}



	public String getModule(int i) {
		return Module.get(i);
	}



	public String getQualification(int i) {
		return Qualification.get(i);
	}



	public String getPosition(int i) {
		return Position.get(i);
	}



	public String getGender(int i) {
		return Gender.get(i);
	}



	public Teacher_data() throws SQLException {

	 
	 Statement statement = connector.getStatement();
		
		String getQuery = "SELECT * FROM `teacherdetails`"; 
		
		 resultSet = statement.executeQuery(getQuery);
		
		
		while (resultSet.next()) {
			counter = counter + 1;
			Db_id.add(resultSet.getInt("TeacherDetailsID"));
			Name.add(resultSet.getString("Name").trim());
			DOB.add(resultSet.getString("DOB").trim());
			phoneNumber.add(resultSet.getString("Phonenumber"));
			Address.add(resultSet.getString("Address").trim());
			EmailAddress.add(resultSet.getString("EmailAddress").trim());
			Module.add(resultSet.getString("Module").trim());
			Qualification.add(resultSet.getString("Qualification").trim());
			Position.add(resultSet.getString("Position").trim());
			Gender.add(resultSet.getString("Gender").trim());
		}
	}


}
