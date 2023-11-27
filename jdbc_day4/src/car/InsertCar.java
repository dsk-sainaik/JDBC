package car;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertCar {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter carId: ");
		int id=scan.nextInt();
		System.out.println("enter carBrand: ");
		String brand=scan.next();
		System.out.println("enter carPrice: ");
		int price=scan.nextInt();
		System.out.println("enter carColour: ");
		String color=scan.next();
		System.out.println("enter carEngineType: ");
		String engineType=scan.next();
		System.out.println("enter carStrock: ");
		int strock=scan.nextInt();
		System.out.println("enter carSet: ");
		int set=scan.nextInt();	
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cardb","root","root");
			PreparedStatement preparedStatement= connection.prepareStatement("insert into car values(?,?,?,?,?,?,?)");
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, brand);
			preparedStatement.setInt(3, price);
			preparedStatement.setString(4,color);
			preparedStatement.setString(5,engineType);
			preparedStatement.setInt(6,strock);
			preparedStatement.setInt(7,set);
			preparedStatement.execute();
			connection.close();
			System.out.println("inserted sucess....");
		
	}

}
