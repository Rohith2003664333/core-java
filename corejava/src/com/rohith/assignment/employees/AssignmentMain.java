package com.rohith.assignment.employees;
import com.rohith.assignment.employees.Manager;
import com.rohith.assignment.employees.Developer;
import com.rohith.assignment.utilities.EmployeeUtilities;
public class AssignmentMain {
	public static void main(String[] args) {
        // Creating a Manager instance
        Manager manager = new Manager();
        manager.setName("Rohith H");
        manager.setEmployeeId(072);
        manager.setSalary(95000);
        manager.setDepartment("Sales");

        // Creating a Developer instance
        Developer developer = new Developer();
        developer.setName("ram");
        developer.setEmployeeId(002);
        developer.setSalary(85000);
        developer.setProgrammingLanguage("Java");

        // Using EmployeeUtilities methods or functions
        EmployeeUtilities.increaseSalary(manager, 10);  // Increasing salary by 10%
        EmployeeUtilities.increaseSalary(developer, 15);  // Increasing salary by 15%

        // Printing employee details by passing manager or developer instance 
        EmployeeUtilities.printEmployeeDetails(manager);
        EmployeeUtilities.printEmployeeDetails(developer);
    }
}


