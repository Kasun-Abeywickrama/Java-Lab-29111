

package com.mycompany.q4_ii;


public class Q4_ii {

    public static void main(String[] args) 
    {
     int [] numbers={10,20,30,40,50};
     for(int x:numbers)
     {
         if(x==30)
         {
             continue;
         }
         System.out.println(x);
         System.out.println("\n");
     }
        System.out.println("I'm out of the loop now"); 
    }    
}
