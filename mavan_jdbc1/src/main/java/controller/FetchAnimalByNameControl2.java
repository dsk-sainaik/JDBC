package controller;

import java.sql.SQLException;
import java.util.Scanner;

import dao.AnimalDao;
import dto.Animal;

public class FetchAnimalByNameControl2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter name to fetch");
		String name=scan.next();
		System.out.println("------------------------------------------");
		Animal animal=new Animal();
		animal.setAnimalName(name);
		AnimalDao animalDao=new AnimalDao();
		animalDao.fetchAnileByName(animal);
		System.out.println("feteched.....");
	}

}
