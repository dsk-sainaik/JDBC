package controller;

import java.sql.SQLException;
import java.util.Scanner;

import dao.BikeDao;
import dto.Bike;

public class InsertBikeController {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter bike id");
		int id= scanner.nextInt();
		System.out.println("enter bike name");
		String name=scanner.next();
		System.out.println("enter bike colour");
		String colour=scanner.next();
		System.out.println("enter bike type");
		String type=scanner.next();
		System.out.println("enter bike price");
		int price= scanner.nextInt();
		System.out.println("enter bike cc");
		int cc= scanner.nextInt();
		
		Bike bike=new Bike();
		bike.setBikeId(id);
		bike.setBikeName(name);
		bike.setColour(colour);
		bike.setBikeType(type);
		bike.setPrice(price);
		bike.setBikecc(cc);
		BikeDao bikeDao=new BikeDao();
		bikeDao.save(bike);
		
		
		

	}

}
