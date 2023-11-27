package person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class FetchPerson {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/persondb","root","root");
	Statement statement=connection.createStatement();
	ResultSet resultset=statement.executeQuery("select * from person where personid=1");
	while(resultset.next())
	{
		System.out.println(resultset.getInt(1));
		System.out.println(resultset.getString(2));
		System.out.println(resultset.getInt(3));
		System.out.println(resultset.getString(4));
		System.out.println(resultset.getFloat(5));
		
		
	}
	}
}
