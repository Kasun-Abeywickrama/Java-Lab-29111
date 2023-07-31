
package com.mycompany.q1_ii;
import java.util.Scanner;

public class Q1_ii {

    public static void main(String[] args)
{
    int [] arr = new int [5];        
    Scanner sc =new Scanner(System.in);
    
    try
    {
       for(int i=0;i<6;i++)
       {
           System.out.print("Enter number "+(i+1)+": ");
           arr[i]=sc.nextInt();
       }
    }
    
       
    catch(ArrayIndexOutOfBoundsException e)
        {
             System.out.println(e.getMessage());  
        }
    
   
    finally
    {
        
        System.out.println("The array is :");
        
        for(int i=0;i<5;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}
}