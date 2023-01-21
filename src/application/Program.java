package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		Department obj = new Department(1, "Manufature");
		
		System.out.println(obj);
		
		
		Seller seller = new Seller(1, "Carmélia", "carmelia@gmail.com", new Date(), 4500.0, obj);
	
		System.out.println(seller);
		
	}

}
