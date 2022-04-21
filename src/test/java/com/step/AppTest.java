package com.step;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class AppTest {

    @Test
    public void testGetMales() throws ParseException {
        Employee service = new Employee();
        List<Employee> testData = new ArrayList<>();
        Employee male = new Employee("Marcoci Marius", new SimpleDateFormat("dd/MM/yyyy").parse("26/09/2004"), "0000000000000", 25000, Employee.Gender.MALE);
        testData.add(male);
        List<Employee> males = service.getMales(testData);
        Assertions.assertNull(males);
    }

    @Test
    public void testGetNames() throws ParseException {
        Employee service = new Employee();
        List<Employee> testData = new ArrayList<>();
        Employee employee = new Employee("Marcoci Marius", new SimpleDateFormat("dd/MM/yyyy").parse("26/09/2004"), "0000000000000", 25000, Employee.Gender.MALE);
        testData.add(employee);
        List<String> names = service.getNames(testData);
        Assertions.assertNull(names);
    }

    @Test
    public void testGetUniqueDays() throws ParseException {
        Employee service = new Employee();
        List<Employee> testData = new ArrayList<>();
        Employee employee = new Employee("Marcoci Marius", new SimpleDateFormat("dd/MM/yyyy").parse("26/09/2004"), "0000000000000", 25000, Employee.Gender.MALE);
        testData.add(employee);
        HashSet<String> dates = service.getUniqueDays(testData);
        Assertions.assertNull(dates);
    }

    @Test
    public void testGetEmployeeByName() throws ParseException {
        Employee service = new Employee();
        List<Employee> testData = new ArrayList<>();
        Employee employee = new Employee("Marcoci Marius", new SimpleDateFormat("dd/MM/yyyy").parse("26/09/2004"), "0000000000000", 25000, Employee.Gender.MALE);
        testData.add(employee);
        String name = "Marcoci Marius";
        List<Employee> employeeByName = service.getEmployeeByName(testData, name);
        Assertions.assertNull(employeeByName);
    }

    @Test
    public void testAverageSalary() throws ParseException {
        Employee service = new Employee();
        List<Employee> testData = new ArrayList<>();
        Employee employee = new Employee("Marcoci Marius", new SimpleDateFormat("dd/MM/yyyy").parse("26/09/2004"), "0000000000000", 25000, Employee.Gender.MALE);
        Employee employee2 = new Employee("Marcoci Marius", new SimpleDateFormat("dd/MM/yyyy").parse("26/09/2004"), "0000000000000", 55000, Employee.Gender.MALE);
        testData.add(employee);
        testData.add(employee2);
        double averageSalary = service.getAverageSalary(testData);
        Assertions.assertNull(averageSalary);
    }
}
