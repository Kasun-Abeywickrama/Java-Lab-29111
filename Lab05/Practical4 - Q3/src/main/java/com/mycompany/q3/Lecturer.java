
package com.mycompany.q3;


public class Lecturer extends Person
{
    private String programme;
    
    
    public Lecturer(String name, int Id ,String programme)
    {   
        super(name,Id);
        this.programme=programme;
    }
    
    public void setProgramme(String programme)
    {   
    
        this.programme=programme;
    }
    
    public String getProgramme()
    {
        return programme;
    }
    
    
}
