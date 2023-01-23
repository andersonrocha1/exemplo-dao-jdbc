package application;

import java.util.List;
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
		
		
		System.out.println("**** TEST 2: Department findAll****");
		List<Department> list = departDao.findAll();
		
		 for(Department depart : list) {
			 System.out.println(depart);
		 }
		 
		 
		 System.out.println("\n**** TEST 3: Department Insert ****");
		 Department newDepartment = new Department(null, "Music");
		 departDao.insert(newDepartment);
		 System.out.println("Inserted! New Id = " + newDepartment.getId());
		
		 sc.close();
	}

}
