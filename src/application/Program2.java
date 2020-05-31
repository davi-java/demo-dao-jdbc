package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("Teste 1 Department Insert");
		Department department = new Department(null, "Cosmetico");
		departmentDao.insert(department);
		System.out.println("Id new Insert: "+department.getId());

		System.out.println("Teste 2 Department Update");
		department.setName("New Cosmetico!");
		departmentDao.update(department);
		System.out.println("Update Completed!");
	}

}
