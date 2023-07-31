
package com.mycompany.q1_iii;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q1_iii {

    public static void main(String[] args)
    {
        
   try
    {
        File file= new File("nonexisten.txt");
        Scanner sc =new Scanner(file);
        
        while(sc.hasNextLine())
        {
            String line=sc.nextLine();
            System.out.println(line);
        }
        sc.close();
    }
   
   catch(FileNotFoundException e)
   {
       System.out.println("Error: File not found.");
   }
}
}
