

package com.mycompany.q2test;



public class Q2Test {

    public static void main(String[] args)
    {
        Employee e1=new Employee("Kasun",22,120000.0f,20000.0f);

        System.out.println("Employee Name: "+e1.getName());
        System.out.println("Age: "+e1.getAge());
        System.out.println("Basic salary: "+e1.getSalary());
        System.out.println("Bonus: "+e1.getBonus());
        System.out.println("Bonus Amount: "+e1.getBonusAmount());    }
}
