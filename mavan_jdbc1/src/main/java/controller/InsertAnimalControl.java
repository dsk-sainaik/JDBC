package controller;

import java.sql.SQLException;

import dao.AnimalDao;
import dto.Animal;

public class InsertAnimalControl {

	public static void main(String[] args) {
		Animal animal=new Animal();
		animal.setAnimalId(3);
		animal.setAnimalName("got");
		animal.setAnimalColour("black");
		animal.setAnimalGender("male");
		animal.setAnimalType("harberoues");
		animal.setAnimalWeight(42);
		AnimalDao animalDao=new AnimalDao();
		try {
			animalDao.insertAnimal(animal);
			
			
			System.out.println("inserted sucess");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
