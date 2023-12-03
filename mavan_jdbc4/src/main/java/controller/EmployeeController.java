package controller;

import java.sql.SQLException;

import dao.EmployeeDao;
import dto.Employee;

public class EmployeeController {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	EmployeeDao dao=new EmployeeDao();
	dao.insert();
		
	}

}
