/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package date;

/**
 *
 * @author Leandro
 */
public class Employee {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;
    
    public Employee(String first, String last, Date dateOfBirth, Date dateOfHire){
        firstName = first;
        lastName = last;
        birthDate = dateOfBirth;
        hireDate = dateOfHire;
    }
    public String toString(){
        return String.format("%s, %s Hired: %s BirthDay: %s", lastName, firstName, hireDate, birthDate);
    }
}
