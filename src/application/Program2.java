package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		DepartmentDao departDao = DaoFactory.createDepartmentDao();
		System.out.println("**** TEST 1: Department findById ****");
		
		Department department = departDao.findById(2);
		System.out.println(department);

	}

}
