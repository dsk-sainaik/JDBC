package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDao {
	public void insert() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","root");
		Statement statement=connection.createStatement();
		statement.addBatch("insert into employee values(1,'sai',22,12,7702348182,74000,'Hyderabad')");
		statement.addBatch("insert into employee values(2,'ram',18,10,1234567890,72000,'banglure')");
		statement.addBatch("insert into employee values(3,'raju',25,14,9957412345,69000,'puna')");
		statement.addBatch("insert into employee values(4,'dinga',21,15,5432109876,54000,'Hyderabad')");
		statement.addBatch("insert into employee values(5,'donga',20,11,1234578907,57000,'maharasta')");
		statement.addBatch("insert into employee values(6,'dingie',22,12,9573322316,48000,'delhi')");
		statement.addBatch("insert into employee values(7,'uma',22,11,7702348185,34000,'Hyderabad')");
		
		
	statement.executeBatch();
	connection.close();
	System.out.println("inserted sucessfully");
	}

}
