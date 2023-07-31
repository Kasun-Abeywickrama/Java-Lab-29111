
package com.mycompany.q2;


public class Q2 {

    public static void main(String[] args) 
    {
        RegularPlayer r1 = new RegularPlayer(1);
        r1.up();
        r1.down();
        r1.left();
        r1.right();
        
        OppositePlayer o1 = new OppositePlayer(2);
        o1.up();
        o1.down();
        o1.left();
        o1.right();
        
        JumpingPlayer j1 = new JumpingPlayer(5);
        j1.up();
        j1.down();
        j1.left();
        j1.right();
        j1.crounchUp();
        j1.crounchDown();
    }
}
