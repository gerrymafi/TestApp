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
public class Faculty extends Employee{
    private String ecNumber;
    private final double accomodationAllowance = 40.0;

    public Faculty(String ecNumber, String name, String id, String employeeNumber, String gender, double salary) {
        super(name, id, employeeNumber, gender, salary);
        this.ecNumber = ecNumber;
    }
    
    public Faculty(String employeeNumber, String ecNumber){
        super(employeeNumber);
        this.ecNumber = ecNumber;
    }

    public String getEcNumber() {
        return ecNumber;
    }

    public void setEcNumber(String ecNumber) {
        this.ecNumber = ecNumber;
    }
    
    @Override
    public double getSalary(){
        return super.getSalary()+accomodationAllowance;
    }
    
    @Override
    public String toString(){
        String string = "";
        string += super.toString();
        string += "\nEC Number------------------------------"+ecNumber;
        return string;
    }
    
    public double getPAYE(){
        return 0.1*this.getSalary();
    }
    
}
