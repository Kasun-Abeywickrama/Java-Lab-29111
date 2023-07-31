
package com.mycompany.q3;


public class Student extends Person
{
    private String course;
    
    public Student(String name, int Id, String course )
    {
        super(name,Id);
        this.course=course;
  
    }
    public void setCourse(String course)
    {
        this.course=course;
    }
    
    public String getCourse()
    {
        return course;
    }
    
    
}   



