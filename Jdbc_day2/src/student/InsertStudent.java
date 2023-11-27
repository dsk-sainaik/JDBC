package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertStudent {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter id: ");
		int id=scan.nextInt();
		System.out.println("enter name: ");
		String name=scan.next();
		System.out.println("enter age:");
		int age=scan.nextInt();
		System.out.println("enter course:");
		String course=scan.next();
		System.out.println("enter qulification:");
		String qulification=scan.next();
		System.out.println("enter phone number:");
		long phno=scan.nextLong();
		System.out.println("enter address:");
		String address=scan.next();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
		Statement statement=connection.createStatement();
		statement.execute("insert into student values('"+id+"','"+name+"','"+age+"','"+course+"','"+qulification+"','"+phno+"','"+address+"')");
		
		statement.close();
		System.out.println("inserted sucessfully");
		
		
	}

}
