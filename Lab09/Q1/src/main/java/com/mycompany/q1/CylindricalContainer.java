package com.mycompany.q1;

public class CylindricalContainer extends Container
{
    private double height, radius;
    
    public CylindricalContainer(double height,double radius)
    {
        this.height=height;
        this.radius=radius;
    }
    
    @Override
    public void volume()
    {
        System.out.println("Volume: "+(Math.PI*radius*radius*height));
    }
    
    
}
