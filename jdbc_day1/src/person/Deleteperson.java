package person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Deleteperson {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/persondb","root","root");
	Statement statement	=connection.createStatement();
	statement.execute("delete from person where personid=1");
	connection.close();
	System.out.println("sucessfully deleted");

	}

}
