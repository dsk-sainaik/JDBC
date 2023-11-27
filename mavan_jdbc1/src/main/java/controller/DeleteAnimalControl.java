package controller;

import java.sql.SQLException;
import java.util.Scanner;

import dao.AnimalDao;
import dto.Animal;

public class DeleteAnimalControl {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter which record to delete ");
	int record=scan.nextInt();
	
	Animal animal=new Animal();
animal.setAnimalId(record);
	AnimalDao animalDao=new AnimalDao();
	animalDao.deleteAnimal(animal);
	System.out.println("delete sucess");

	}

}
