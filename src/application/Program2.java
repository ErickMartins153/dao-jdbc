package application;

import db.DB;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.creeateDepartmentDao();

        System.out.println("=== TEST 1: department findById ===");
        Department department = departmentDao.findById(3);
        System.out.println(department);

        System.out.println("\n=== TEST 2: department findAll ===");
        List<Department> departments = departmentDao.findAll();

        for (Department dep: departments) {
            System.out.println(dep);
        }

        System.out.println("\n=== TEST 3: department insert ===");
        Department newDepartment = new Department(null, "Paper");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id: " + newDepartment.getId());

        System.out.println("\n=== TEST 4: department update ===");
        Department updateDep= departmentDao.findById(7);
        updateDep.setName("Trash");
        departmentDao.update(updateDep);
        System.out.println("Update completed");

        System.out.println("\n=== TEST 5: department delete ===");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed");

        sc.close();
    }

}
