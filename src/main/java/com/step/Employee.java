package com.step;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Employee {
    String name;
    Date birthdate;
    String id;
    double salary;
    Gender gender;
    enum Gender {
        MALE,
        FEMALE
    }

    public Employee(String name, Date birthdate, String id, double salary, Gender gender) {
        this.name = name;
        this.birthdate = birthdate;
        this.id = id;
        this.salary = salary;
        this.gender = gender;
    }

    public Employee() {
        this.name = null;
        this.birthdate = null;
        this.id = null;
        this.salary = 0.0;
        this.gender = null;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String date) throws ParseException {
        this.birthdate = new SimpleDateFormat("dd/MM/yyyy").parse(date);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<Employee> getMales (List<Employee> employees) {
        List<Employee> employeeList = new ArrayList<>();
        for(Employee employee: employees) {
            if(employee.getGender() == Gender.MALE) {
                employeeList.add(employee);
            }
        }
        return employeeList;
    }

    public List<String> getNames (List<Employee> employees) {
        List<String> employeeList = new ArrayList<>();
        for(Employee employee: employees) {
            employeeList.add(employee.getName());
        }
        return employeeList;
    }

    public HashSet<String> getUniqueDays (List<Employee> employees) {
        List<String> employeeList = new ArrayList<>();
        Calendar c = Calendar.getInstance();
        for(Employee employee: employees) {
            c.setTime(employee.getBirthdate());
            employeeList.add(String.valueOf(c.get(Calendar.DAY_OF_MONTH)));
        }
        HashSet<String> days = new HashSet<>(employeeList);
        return days;
    }

    public List<Employee> getEmployeeByName (List<Employee> employees, String name) {
        List<Employee> employeeList = new ArrayList<>();
        for(Employee employee: employees) {
            if (Objects.equals(employee.getName(), name)) {
                employeeList.add(employee);
            }
        }
        return employeeList;
    }

    public double getAverageSalary (List<Employee> employees) {
        double[] Salary = new double[employees.size()];
        double averageSalary = 0.0;
        int i = 0;
        for (Employee employee: employees) {
            Salary[i] = employee.getSalary();
            i++;
        }
        for (int j=0; j<Salary.length; j++) {
            averageSalary += Salary[j];
        }
        return (averageSalary / Salary.length);
    }
}
