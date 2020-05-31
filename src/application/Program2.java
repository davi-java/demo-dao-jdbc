package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("Teste 1 Department Insert");
		Department department = new Department(null, "Musica");
		departmentDao.insert(department);
		System.out.println("Id new Insert: "+department.getId());

	}

}
