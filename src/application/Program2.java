package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        DepartmentDao dp = DaoFactory.createDepartmentDao();
        Scanner input = new Scanner(System.in);

        System.out.println("=== TESTE 1: seller findById ===");
        Department dep = dp.findById(7);
        System.out.println(dep);

        System.out.println("\n=== TESTE 2: department insert ===");
        Department newdepartment = new Department(7, "kallel");
        dp.insert(newdepartment);
        System.out.println("Inserted! new id = " + newdepartment.getId());

        System.out.println("\n=== TESTE 3: department Update ===");
        dep = dp.findById(7);
        dep.setName("Beatriz");
        dp.update(dep);
        System.out.println("Update Completed!");

        System.out.println("\n=== TESTE 4: department Delete ===");
        System.out.print("Enter id for deleste test: ");
        int id = input.nextInt();
        input.nextLine();
        dp.deleteById(id);
        System.out.println("Delete Completed!");

        System.out.println("\n=== TESTE 5: seller findAll ===");
        List<Department> list = dp.findAll();
        for (Department obj : list) {
            System.out.println(obj);
        }

    }
}
