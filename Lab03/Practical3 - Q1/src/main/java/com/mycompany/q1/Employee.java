
package com.mycompany.q1;


public class Employee 
{
    private String name;
    private int age;
    private float salary,bonus;
    
    //setter method for name
    public void setName(String name)
    {
        this.name=name;
    }
    
    //getter method for name
    public String getName()
    {
        return name; 
    }
    
    //setter method for age
    public void setAge(int age)
    {
        this.age=age;
    }
    
    //getter method for age
    public int getAge()
    {
        return age; 
    }
    
    //setter method for salary
    public void setSalary(float salary)
    {
        this.salary=salary;
    }
    
    //getter method for salary
    public float getSalary()
    {
        return salary; 
    }
    
     //setter method for bonus
    public void setBonus(float bonus)
    {
        this.bonus=bonus;
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
