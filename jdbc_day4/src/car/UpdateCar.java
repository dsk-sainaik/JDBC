package car;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateCar {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter updated car price :");
		int updatedPrice=scan.nextInt();
		System.out.println("enter updated car colour :");
		String updatedcarColor=scan.next();
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cardb","root","root");
		PreparedStatement preparedStatement= connection.prepareStatement("update car set carprice=?,carcolor=? where carcolor='blue' ");
		preparedStatement.setInt(1, updatedPrice);
		preparedStatement.setString(2,updatedcarColor);
		preparedStatement.execute();
		connection.close();
		System.out.println("update sucess....");

	}

}
