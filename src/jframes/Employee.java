/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jframes;

/**
 *
 * @author Pavan Kumar
 */
public class Employee {
    
    private int id;
    private String name;
    private String emailAddress;
    private String type;
    private int salary;
    
    public Employee(int ID, String name, String emailAddress,String type,int salary)
    {
        this.id = ID;
        this.name = name;
        this.emailAddress = emailAddress;
        this.type = type;
        this.salary = salary;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getEmail()
    {
        return emailAddress;
    }
    public String getType()
    {
        return type;
    }
    
    public int getSalary()
    {
        return salary;
    }
}

