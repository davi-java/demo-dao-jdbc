package application;

import java.util.ArrayList;
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
		
	}

}
