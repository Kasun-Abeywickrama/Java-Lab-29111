

package com.mycompany.q3;


public class Q3 {

    public static void main(String[] args)
    {
        Lecturer l1= new Lecturer("Kamal",1234,"computer science");
        Student s1= new Student("Nimal",2341,"software engineering");
        
        System.out.println("Student Id: "+s1.getId());
        System.out.println("Student name: "+s1.getName());
        System.out.println("Course: "+s1.getCourse());
        
        System.out.println("Lecturer Id: "+l1.getId());
        System.out.println("Lecturer name: "+l1.getName());
        System.out.println("Programme: "+l1.getProgramme());

       
    }
}
