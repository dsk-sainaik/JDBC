package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteStudent {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter id to delete");
		int id=scanner.nextInt();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
		Statement statement=connection.createStatement();
		statement.execute("delete from student where studentid='"+id+"'");
		statement.close();
		System.out.println("deleted sucessfully");
		

	}

}
