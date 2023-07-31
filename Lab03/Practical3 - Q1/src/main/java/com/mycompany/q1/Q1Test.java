

package com.mycompany.q1;



public class Q1Test {

    public static void main(String[] args)
    {
        Employee e1=new Employee();
        e1.setName("Kasun");
        e1.setAge(20);
        e1.setSalary(150000.0f);
        e1.setBonus(2000.0f);
        
        System.out.println("Employee Name: "+e1.getName());
        System.out.println("Age: "+e1.getAge());
        System.out.println("Basic salary: "+e1.getSalary());
        System.out.println("Bonus: "+e1.getBonus());
        System.out.println("Bonus Amount: "+e1.getBonusAmount());
    }
}
