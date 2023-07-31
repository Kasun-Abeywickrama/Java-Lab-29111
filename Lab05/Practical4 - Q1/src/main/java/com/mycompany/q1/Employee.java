
package com.mycompany.q1;


public class Employee
{
    private int empID;
    private String empName,empDesignation;
    
    //setter method for Details
    public void setDetails(int empID, String empName, String empDesignation)
    {
        this.empID=empID;
        this.empName=empName;
        this.empDesignation=empDesignation;
    }
    
    //getter method for Employee ID
    public int getEmpId()
    {
        return empID;
    }
    
    //getter method for Employee Name
    public String getEmpName()
    {
        return empName;
    }
    
    //getter method for Employee Designation
    public String getEmpDesignation()
    {
        return empDesignation;
    }
}
