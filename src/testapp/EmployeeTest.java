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
public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("123456");
        System.out.println(employee);
        Faculty faculty = new Faculty("123456","654321");
        System.out.println(faculty);
        
        System.out.println(faculty.getPAYE());
    }
}
