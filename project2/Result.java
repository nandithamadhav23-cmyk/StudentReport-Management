package project2;

import java.util.Scanner;

/*Create a child class Result that extends Student
•	Add method getGrade()
Use if-else to return grade based on percentage: 
o	≥ 90 → A
o	≥ 75 → B
o	≥ 60 → C
o	≥ 40 → D
o	else → Fail
•	Add method isPass() returning true/false.
 */
public class Result extends Student {
    char g; boolean status;
    Result(Scanner s)
    {
      super(s);
    }
    public char getGrade()
    {
        if(calPercentage()>=90 && calPercentage()<=100)
        {
            g='A';
        }
        else if(calPercentage()>=75 && calPercentage()<90)
        {
            g='B';
        }
        else if(calPercentage()>=60 && calPercentage()<75)
        {
            g='C';
        }
        else if(calPercentage()>=40 && calPercentage()<60)
        {
            g='D';
        }
        else{
               g='F';
        }
        return g;
    }
    public boolean is_pass()
    {   
        if(calPercentage()<40)
         status= false;
        else if(calPercentage()>=40)
            status= true;
        return status;
    }
    
}
