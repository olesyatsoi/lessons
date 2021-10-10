package com.example;

import com.example.domain.Employee;
import com.example.domain.Client;
import com.example.domain.Admin; 
import com.example.domain.Tester;
//import com.example.domain.Director; 
//import com.example.domain.Engineer; 
public class EmployeeTest {
    public static void main(String[] args) {
        //Engineer eng = new Engineer(101, "Jane Smith", "012-34-5678", 120_345.27); 
        Client mgr = new Client(207, "Barbara Johnson", 1000_10.9, "bhhbjkh"); 
        Admin adm = new Admin(304, "Bill Munroe", "108-23-2367", 75_002.34); 
        Tester tst = new Tester(112, "Vasya", 23-3.10);
        //Director dir = new Director(12, "Susan Wheeler", "099-45-2340", 120_567.36, "Global Marketing", 1_000_000.00); 
        
        //printEmployee(eng); 
        printEmployee(mgr); 
        printEmployee(adm); }
        //printEmployee(dir); }
          private static void printEmployee(Employee emp) { 
            System.out.println("Employee ID: " + emp.getEmpId()); 
            System.out.println("Employee Name: " + emp.getName()); 
            //System.out.println("Employee Soc Sec # " + emp.getSsn()); 
            System.out.println("Employee salary: " + emp.getSalary()); 
 } 

    }
    



