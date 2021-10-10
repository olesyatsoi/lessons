package com.example.domain;
public class Client extends Employee{
    public String deptName;
    
    public Client (int empId, String name, double salary, String deptName ) { 
    super(empId, name, salary);
    this.deptName = deptName; 
    
 } 
public String getDeptName() { 
 return deptName; 
 }
    
}
