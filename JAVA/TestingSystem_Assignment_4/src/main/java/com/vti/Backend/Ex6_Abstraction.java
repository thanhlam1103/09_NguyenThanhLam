package com.vti.Backend;

import com.vti.Backend.Ex6_Abstraction;
import com.vti.entity.Abstraction.Question1.VietnamesePhone;
import com.vti.entity.Abstraction.Question2_3.Employee;
import com.vti.entity.Abstraction.Question2_3.Manager;
import com.vti.entity.Abstraction.Question2_3.Waiter;

import java.util.Scanner;

public class Ex6_Abstraction {
    public void question1 (){
        VietnamesePhone phone = new VietnamesePhone();

        phone.insertContact("John", "123456");
        phone.insertContact("Jane", "789012");

        phone.searchContact("John");
        phone.searchContact("Jane");

        phone.updateContact("John", "111111");
        phone.searchContact("John");

        phone.removeContact("Jane");
        phone.searchContact("Jane");
    }


    public void question2_3 (){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String employeeName = scanner.nextLine();
        System.out.print("Enter salary ratio: ");
        double employeeSalaryRatio = scanner.nextDouble();

        System.out.print("Enter manager name: ");
        scanner.nextLine(); // Clear newline character
        String managerName = scanner.nextLine();
        System.out.print("Enter salary ratio: ");
        double managerSalaryRatio = scanner.nextDouble();

        System.out.print("Enter waiter name: ");
        scanner.nextLine(); // Clear newline character
        String waiterName = scanner.nextLine();
        System.out.print("Enter salary ratio: ");
        double waiterSalaryRatio = scanner.nextDouble();

        Employee employee = new Employee(employeeName, employeeSalaryRatio);
        Manager manager = new Manager(managerName, managerSalaryRatio);
        Waiter waiter = new Waiter(waiterName, waiterSalaryRatio);

        employee.displayInfo();
        manager.displayInfo();
        waiter.displayInfo();

        scanner.close();


    }

}
