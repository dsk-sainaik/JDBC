package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
		Statement statement=connection.createStatement();
		statement.execute("create table student(studentId int,studentName varchar(20),studentAge int,studentCource varchar(25),studentQulification varchar(30),studentPhno bigint(10),studentAddress varchar(30))");
		
		statement.close();
		System.out.println("table created");

	}

}
