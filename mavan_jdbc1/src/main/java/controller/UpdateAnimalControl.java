package controller;

import java.sql.SQLException;
import java.util.Scanner;

import dao.AnimalDao;
import dto.Animal;

public class UpdateAnimalControl {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter colour to update ");
		String colour=scan.next();
		
		Animal animal=new Animal();
		animal.setAnimalColour(colour);
		AnimalDao animalDao=new AnimalDao();
		animalDao.updateAnimal(animal);
		System.out.println("update sucess");

	}

}
