/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapp;

/**
 *
 * @author mafim
 */
public class Employee {
    private String name;
    private String id;
    private String employeeNumber;
    private String gender;
    private double salary;

    public Employee(String name, String id, String employeeNumber, String gender, double salary) {
        this.name = name;
        this.id = id;
        this.employeeNumber = employeeNumber;
        this.gender = gender;
        this.salary = salary;
    }

    public Employee(String employeeNumber) {
        this.employeeNumber = employeeNumber;
        this.name = "john Doe";
        this.id = "00-0000000v00";
        this.gender = "bi";
        this.salary = 500;
    }
    
    @Override
    public String toString(){
        String string = "";
        string += "Name----------------------------------"+name;
        string += "\nSalary-----------------------------"+salary;
        string += "\nID---------------------------------"+id;
        string += "\nEmployeee Nu-----------------------"+employeeNumber;
        string += "\nGender------------------------------"+gender;
        return string;
    }
    
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
    
}
