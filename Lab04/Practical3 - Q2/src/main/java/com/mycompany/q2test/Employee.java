
package com.mycompany.q2test;



public class Employee 
{
    private String name;
    private int age;
    private float salary,bonus;
    
    //constructor method for details
    public Employee (String name, int age, float salary, float bonus)
    {
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.bonus=bonus;
    }
           
    //getter method for name
    public String getName()
    {
        return name; 
    }
    
    //getter method for age
    public int getAge()
    {
        return age; 
    }
    
    //getter method for salary
    public float getSalary()
    {
        return salary; 
    }
    
    //getter method for bonus
    public float getBonus()
    {
        return bonus; 
    }
    
     //getter method for bonus amount
    public float getBonusAmount()
    {
        return salary+bonus; 
    }
    
            
}
