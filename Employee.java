/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.domain;
public class Employee {
    
    public int empId; 
    public String name; 
    public double salary;
    
    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }
    public Employee(){
    }
    public int getEmpId() {
       return empId;
    }
   
    public String getName() {
       return name;
    }
    public void setName(String name) {
       this.name=name;
    }
    
     public double getSalary() {
       return salary;
    }
      public void setSalary(double salary) {
       this.salary=salary;
    }
    
}
