package com.mycompany.q5_iii;

public class GradeEvaluator
{
    public void EvaluateGrade(char grade)
    {
    {
       if(grade=='A')
            System.out.println("Exellent!");
       else if(grade=='D')
            System.out.println("You passed");
       else if(grade=='F')
            System.out.println("Better try again");
       else
            System.out.println("Invalid grade");

    }
    System.out.println("Your grade is "+grade); 
    }
}
