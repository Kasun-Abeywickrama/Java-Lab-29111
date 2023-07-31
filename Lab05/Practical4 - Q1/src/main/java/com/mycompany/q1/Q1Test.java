

package com.mycompany.q1;


public class Q1Test {

    public static void main(String[] args)
    {
        Employee e1=new Employee ();
        e1.setDetails(1234,"Mr.Bogdan","secretary");
        
        
        Employee e2=new Employee ();
        e2.setDetails(1235,"Ms.Bird","chairman");     
       
        
        System.out.println("Employee 1");
        System.out.println("ID: "+e1.getEmpId());
        System.out.println("Name: "+e1.getEmpName());
        System.out.println("Designation: "+e1.getEmpDesignation());
        System.out.println("\n");
        
        System.out.println("Employee 2");
        System.out.println("ID: "+e2.getEmpId());
        System.out.println("Name: "+e2.getEmpName());
        System.out.println("Designation: "+e2.getEmpDesignation());
    }
}
