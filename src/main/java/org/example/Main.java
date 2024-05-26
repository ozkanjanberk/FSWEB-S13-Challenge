package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {

        Healthplan basicHealthplan = new Healthplan(1, "Standard Plan", Plan.BASIC);
        System.out.println(basicHealthplan);

        String[] healthPlansArray = new String[2];
        Employee employee = new Employee(101, "John Doe", "john.doe@gmail.com", "janberk", healthPlansArray);
        employee.addHealthPlan(0, "Basic Healthplan");
        employee.addHealthPlan(1, "Premium Healthplan");
        employee.addHealthPlan(0, "Attempt to add again to index 0");
        System.out.println(employee);

        String[] developerNamesArray = new String[3];
        Company company = new Company(1001, "Workintech", 500000.0, developerNamesArray);
        company.addEmployee(0, "John Doe");
        company.addEmployee(1, "Jane Doe");
        company.addEmployee(2, "Janberk Ozkan");
        company.addEmployee(1, "Attempt to add again to index 1");
        System.out.println(company);
    }
}
