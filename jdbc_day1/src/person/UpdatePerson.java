package person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdatePerson {
	
	
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	String driverName="com.mysql.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/persondb";
	String userName="root";	
	String password="root";
	String queary="update person set personname='xyz',personage=35,personloc='Telangana',personphno=9999900000 where personid=1  ";
	
	Class.forName(driverName);
	Connection connection= DriverManager.getConnection(url,userName,password);
	Statement statement	=connection.createStatement();
	statement.execute(queary);
	connection.close();
	System.out.println("sucessfully updated");

	}


}
