package com.step;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        List <Employee> Employees = new ArrayList<>();

        while (true) {
            Employee employees = new Employee();

            System.out.println("Enter the name: ");
            String name = scanner.nextLine();
            employees.setName(name);

            System.out.println("Enter birthdate (dd/mm/yyyy): ");
            String date = scanner.nextLine();
            employees.setBirthdate(date);

            System.out.println("Enter id(13 figures): ");
            String id = scanner.nextLine();
            employees.setId(id);

            System.out.println("Enter salary(double): ");
            double salary = scanner.nextDouble();
            employees.setSalary(salary);

            System.out.println("Enter gender (1 for male, 0 for female): ");
            int gender = scanner.nextInt();
            switch (gender) {
                case 0: employees.setGender(Employee.Gender.FEMALE); break;
                case 1: employees.setGender(Employee.Gender.MALE); break;
            }

            Employees.add(employees);

            System.out.println("Enter another employee: (1 for yes, 0 for no) ");
            int move = scanner.nextInt();
            scanner.nextLine();
            if(move == 0) {
                break;
            }
        }

//        System.out.println("All employees: ");
//        for(Employee employee: Employees) {
//            System.out.println(employee.getName());
//            System.out.println(employee.getBirthdate());
//            System.out.println(employee.getSalary());
//            System.out.println(employee.getId());
//            System.out.println(employee.getGender());
//            System.out.println();
//        }

        Employee emp = new Employee();

        System.out.println();
        System.out.println("Males only: ");
        List <Employee> males;
        males = emp.getMales(Employees);
        for(Employee employee: males) {
            System.out.println(employee.getName());
            System.out.println(employee.getBirthdate());
            System.out.println(employee.getSalary());
            System.out.println(employee.getId());
            System.out.println(employee.getGender());
            System.out.println();
        }

        System.out.println("Names only: ");
        List <String> names;
        names = emp.getNames(Employees);
        for(String name: names) {
            System.out.println(name);
        }
        System.out.println();

        System.out.println("Unique days list: ");
        HashSet<String> uniqueDays;
        uniqueDays = emp.getUniqueDays(Employees);
        for(String uniqueDay: uniqueDays) {
            System.out.println(uniqueDay);
        }
        System.out.println();

        System.out.println("Employee by name: ");
        List <Employee> empsByName;
        empsByName = emp.getEmployeeByName(Employees, "Marcoci Marius");
        for(Employee empByName: empsByName) {
            System.out.println(empByName.getName());
            System.out.println(empByName.getBirthdate());
            System.out.println(empByName.getSalary());
            System.out.println(empByName.getId());
            System.out.println(empByName.getGender());
            System.out.println();
        }

        double averageSalary = emp.getAverageSalary(Employees);
        System.out.println("Average salary = " + averageSalary);
    }
}
