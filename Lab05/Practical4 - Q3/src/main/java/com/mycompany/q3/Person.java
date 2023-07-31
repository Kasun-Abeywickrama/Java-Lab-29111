
package com.mycompany.q3;


public class Person
{
    private String name;
    private int Id;
    
    public Person (String name,int Id )
    {
        this.Id=Id;
        this.name=name;
    }
    
    public void setName(String name)
    {
        this.name=name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setId(int Id)
    {
        this.Id=Id;
    }
    
    public int getId()
    {
        return Id;
    }
}
