package com.mycompany.q5;

public class GradeEvaluator 
{
    public void evaluateGrade (char grade)
    {
        switch(grade)
        {
            case 'A':
                System.out.println("Exellent!");
                break;
            case 'D':
                System.out.println("You passed");
                // No break here, so it will continue to the next case.
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
        }
           System.out.println("Your grade is "+grade); 
    }
}
