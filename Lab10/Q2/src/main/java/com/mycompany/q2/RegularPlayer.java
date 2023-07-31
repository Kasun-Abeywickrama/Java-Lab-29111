package com.mycompany.q2;

public class RegularPlayer extends Movements
{
    int sp;
    
    public RegularPlayer (int sp)
    {
        this.sp=sp;
    }
    
    @Override
    public void up()
    {
        System.out.println("Player moved up by "+sp+" space");
    }
    
    
    @Override
    public void down()
    {
        System.out.println("Player moved down by "+sp+" space");
    }
    
    
    @Override
    public void right()
    {
        System.out.println("Player moved right by "+sp+" space");
    }
    
    
    @Override
    public void left()
    {
        System.out.println("Player moved left by "+sp+" space");
    }
}
