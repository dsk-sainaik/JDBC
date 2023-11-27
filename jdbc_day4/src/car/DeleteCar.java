package car;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteCar {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("enter which car stroke to delete:");
		int stroke=scan.nextInt();
		
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cardb","root","root");
		PreparedStatement preparedStatement= connection.prepareStatement("delete from car where carstroks=?");
		
		
		preparedStatement.setInt(1,stroke);
		preparedStatement.execute();
		
		PreparedStatement preparedStatement1= connection.prepareStatement("select count(*) from car");
		ResultSet r=preparedStatement1.executeQuery();
		if(r.next())
		{
			int c=r.getInt(1);
			System.out.println("deleted count is "+c);
		}
		
	
		
		connection.close();
		System.out.println();

	}

}
