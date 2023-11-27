package person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertPerson {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/persondb","root","root");
		Statement statement=connection.createStatement();
		statement.execute("insert into person values(2,'sai kumar',23,'bangular',9849463522)");
		connection.close();
		System.out.println("imnserted");

	}

}
