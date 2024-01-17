package com.teranet.rps.javatraining.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SampleData {
    private static List<Employee> trvEmployees = Arrays.asList(
            new Employee("Ramesh","ramesh@something.com",Department.HR,new BigDecimal("1.50")),
            new Employee("Anjali", "anjali.sharma@company.com", Department.IT,new BigDecimal("3.50")),
            new Employee("Rohan", "rohan.khanna@company.com", Department.RPS,new BigDecimal("0.50")),
            new Employee("Priya", "priya.gupta@company.com", Department.MARKETING,new BigDecimal("7")),
            new Employee("Vikram", "vikram.singh@company.com", Department.FINANCE,new BigDecimal("4")),
            new Employee("Neha", "neha.patel@company.com", Department.OPERATIONS,new BigDecimal("2")),
            new Employee("Mahesh", "mahesh.nair@company.com", Department.ADMIN,new BigDecimal("3.8")),
            new Employee("Shreya", "shreya.rao@company.com", Department.RPS,new BigDecimal("7.1")),
            new Employee("Ajay", "ajay.verma@company.com", Department.LEGAL,new BigDecimal("3.2")),
            new Employee("Sonia", "sonia.bakshi@company.com", Department.ACCOUNTING,new BigDecimal("2.8")),
            new Employee("Karan", "karan.malik@company.com", Department.CMS,new BigDecimal("5.5")),

            
            new Employee("Emily", "emily.johnson@company.com", Department.IT,new BigDecimal("7.8")),
            new Employee("Noah", "noah.williams@company.com", Department.RPS,new BigDecimal("5.8")),
            new Employee("Olivia", "olivia.brown@company.com", Department.MARKETING,new BigDecimal("7")),
            new Employee("Liam", "liam.jones@company.com", Department.FINANCE,new BigDecimal("8")),
            new Employee("Ava", "ava.miller@company.com", Department.OPERATIONS,new BigDecimal("9.9")),
            new Employee("William", "william.davis@company.com", Department.ADMIN,new BigDecimal("10")),
            new Employee("Isabella", "isabella.garcia@company.com", Department.RPS,new BigDecimal("4.1")),
            new Employee("Oliver", "oliver.rodriguez@company.com", Department.LEGAL,new BigDecimal("6.3")),
            new Employee("Charlotte", "charlotte.wilson@company.com", Department.ACCOUNTING,new BigDecimal("7.2")),
            new Employee("Benjamin", "benjamin.martinez@company.com", Department.CMS,new BigDecimal("8.1")),

            new Employee("Maya", "maya.singh@company.com", Department.IT,new BigDecimal("4.1")),
            new Employee("Sophia", "sophia.patel@company.com", Department.RPS,new BigDecimal("5.2")),
            new Employee("Logan", "logan.rao@company.com", Department.MARKETING,new BigDecimal("4.2")),
            new Employee("Amelia", "amelia.verma@company.com", Department.FINANCE,new BigDecimal("3.3")),
            new Employee("Lucas", "lucas.bakshi@company.com", Department.OPERATIONS,new BigDecimal("6")),
            new Employee("Mia", "mia.malik@company.com", Department.ADMIN,new BigDecimal("7")),
            new Employee("Mason", "mason.nair@company.com", Department.RPS,new BigDecimal("1")),
            new Employee("Ethan", "ethan.sharma@company.com", Department.LEGAL,new BigDecimal("0.8")),
            new Employee("Harper", "harper.khanna@company.com", Department.ACCOUNTING,new BigDecimal("2")),
            new Employee("Evelyn", "evelyn.gupta@company.com", Department.CMS,new BigDecimal("4.3"))
    );
    public static List<Employee> getEmployees(){
        return new ArrayList<>(trvEmployees);
    }
}
