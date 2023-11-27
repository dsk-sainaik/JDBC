package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class FatchStudent {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter id to fetch: ");
		int id=scanner.nextInt();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
		Statement statement=connection.createStatement();
		
		ResultSet resultset=statement.executeQuery("select * from student where studentid='"+id+"' ");
		while(resultset.next())
		{
			System.out.println(resultset.getInt(1));
			System.out.println(resultset.getString(2));
			System.out.println(resultset.getInt(3));
			System.out.println(resultset.getString(4));
			System.out.println(resultset.getString(5));
			System.out.println(resultset.getLong(6));
			System.out.println(resultset.getString(7));
			
			
		}
		statement.close();
		System.out.println("fetched sucessfully");
		

	}

}
