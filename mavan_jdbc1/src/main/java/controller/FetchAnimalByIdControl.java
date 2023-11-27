package controller;

import java.sql.SQLException;
import java.util.Scanner;

import dao.AnimalDao;
import dto.Animal;

public class FetchAnimalByIdControl {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter id to fetch");
		int id=scan.nextInt();
		System.out.println("------------------------------------------");
		Animal animal=new Animal();
		animal.setAnimalId(id);
		AnimalDao animalDao=new AnimalDao();
		animalDao.fetchAnileById(animal);
		System.out.println("feteched.....");
	}

}
