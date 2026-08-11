package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        DepartmentDao dp = DaoFactory.createDepartmentDao();
        Scanner input = new Scanner(System.in);

        System.out.println("=== TESTE 1: seller findById ===");
        Department dep = dp.findById(7);
        System.out.println(dep);
/*
        System.out.println("\n=== TESTE 2: department insert ===");
        Department newdepartment = new Department(7, "kallel");
        dp.insert(newSeller);
        System.out.println("Inserted! new id = " + newSeller.getId());*/

        System.out.println("\n=== TESTE 3: department Update ===");
        dep = dp.findById(7);
        dep.setName("beatriz");
        dp.update(dep);
        System.out.println("Update Completed!");

        System.out.println("\n=== TESTE 6: department Delete ===");
        System.out.print("Enter id for deleste test: ");
        int id = input.nextInt();
        input.nextLine();
        dp.deleteById(id);
        System.out.println("Delete Completed!");

    }
}
