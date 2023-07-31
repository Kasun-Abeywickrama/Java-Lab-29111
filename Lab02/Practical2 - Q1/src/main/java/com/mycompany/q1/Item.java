
package com.mycompany.q1;


public class Item
{
    private int location;
    private String description;
    
    public Item (int l,String d)
    {
         location=l;
         description=d;
    }
    
    //setter method for location
    public void setLocation (int l)
    {
        location=l;
    }
    
    //getter method for location
    public int getLocation ()
    {
        return location;
    }
    
    //setter method for description
    public void setDescription (String d)
    {
        description =d;
    }
    
    //getter method for description
    public String getDescription ()
    {
        return description;
    }
}
