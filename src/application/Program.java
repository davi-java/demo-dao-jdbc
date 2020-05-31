package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("==== Teste 1: Seller findById ====");
		Seller seller = sellerDao.findById(3);	
		System.out.println(seller);
		
		System.out.println("\n==== Teste 2: Seller findByDepartment ====");
		Department department = new Department(2,null);
		List<Seller> list = new ArrayList<>();
		list = sellerDao.findByDepartment(department);
		list.forEach(System.out :: println);
		
		System.out.println("\n==== Teste 3: Seller findAll ====");
		list = sellerDao.findAll();
		list.forEach(System.out :: println);
		
		System.out.println("\n==== Teste 4: Seller insert ====");
		Seller newSeller = new Seller( 
				null, "Cleide Silva", "cleidesilva@gmail.com",
				new Date(), 5000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Id new insert: "+newSeller.getId());
		
		System.out.println("\n==== Teste 5: Seller update ====");
		seller = sellerDao.findById(1);
		seller.setName("Caique");
		seller.setEmail("caique@gmail.com");
		sellerDao.update(seller);
		System.out.println("Update Completed!");
		
	}

}
