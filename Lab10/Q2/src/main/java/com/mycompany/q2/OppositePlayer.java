package com.mycompany.q2;

public class OppositePlayer extends Movements
{
    int sp;
    public OppositePlayer(int sp)
    {
        this.sp=sp;
    }
    
    @Override
    public void up()
    {
        System.out.println("Player moved down by "+sp+" spaces");
    }
    
    
    @Override
    public void down()
    {
        System.out.println("Player moved up by "+sp+" spaces");
    }
    
    
    @Override
    public void right()
    {
        System.out.println("Player moved left by "+sp+" spaces");
    }
    
    
    @Override
    public void left()
    {
        System.out.println("Player moved right by "+sp+" spaces");
    }
}
