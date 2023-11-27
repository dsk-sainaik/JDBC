package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import controller.DeleteAnimalControl;
import dto.Animal;

public class AnimalDao {
	public void insertAnimal(Animal animal) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/animaldb" ,"root","root");
		PreparedStatement preparedStatement=connection.prepareStatement("insert into animal values(?,?,?,?,?,?)");
		preparedStatement.setInt(1,animal.getAnimalId());
		preparedStatement.setString(2,animal.getAnimalName());
		preparedStatement.setString(3,animal.getAnimalColour());
		preparedStatement.setString(4,animal.getAnimalGender());
		preparedStatement.setString(5,animal.getAnimalType());
		preparedStatement.setDouble(6, animal.getAnimalWeight());
		
		preparedStatement.execute();
		
		connection.close();	
		
	}
	public void updateAnimal(Animal animal) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/animaldb","root","root");
		PreparedStatement preparedStatement=connection.prepareStatement("update animal set animalcolour=? where animalid=?");
		preparedStatement.setString(1,animal.getAnimalColour());
		preparedStatement.setInt(1,animal.getAnimalId());
		preparedStatement.execute();
		connection.close();
		
		
	}
	public void deleteAnimal(Animal animal) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/animaldb","root","root");
		PreparedStatement preparedStatement=connection.prepareStatement("delete from animal where animalid=?");
		preparedStatement.setInt(1,animal.getAnimalId());
		preparedStatement.execute();
		connection.close();
		
	}
	
	public void fetchAnileById(Animal animal) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/animaldb","root","root");
		PreparedStatement preparedStatement=connection.prepareStatement("select * from animal where animalid=?");
		preparedStatement.setInt(1,animal.getAnimalId());
		ResultSet resultset=preparedStatement.executeQuery();
		while(resultset.next())
		{
			System.out.println(resultset.getInt(1));
			System.out.println(resultset.getString(2));
			System.out.println(resultset.getString(3));
			System.out.println(resultset.getString(4));
			System.out.println(resultset.getString(5));
			System.out.println(resultset.getDouble(6));
		}
		
		connection.close();
		
	}
	
	
	
	public void fetchAnileByName(Animal animal) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/animaldb","root","root");
		PreparedStatement preparedStatement=connection.prepareStatement("select * from animal where animalname=?");
		preparedStatement.setString(1,animal.getAnimalName());
		ResultSet resultset=preparedStatement.executeQuery();
		while(resultset.next())
		{
			System.out.println(resultset.getInt(1));
			System.out.println(resultset.getString(2));
			System.out.println(resultset.getString(3));
			System.out.println(resultset.getString(4));
			System.out.println(resultset.getString(5));
			System.out.println(resultset.getDouble(6));
		}
		
		connection.close();
		
	}
	
	
	
	

}
