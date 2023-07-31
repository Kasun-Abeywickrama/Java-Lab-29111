
package com.mycompany.q1_i;
import java.util.Scanner;

public class Q1_i {

    public static void main(String[] args)
    {
        Scanner sc= new Scanner (System.in);
        
        try
            {
                int num1,num2;
                float ans;
                
                System.out.print("Enter number 1:");
                num1=sc.nextInt();
                
                System.out.print("Enter number 2:");
                num2=sc.nextInt();
                
                ans=(float)num1/num2;
                System.out.println("Division of numbers is "+ans);
            }
        
        catch(ArithmeticException e)
                {
                    System.out.println("Error: Division by zero is not allowed.");
                }
    }
}
