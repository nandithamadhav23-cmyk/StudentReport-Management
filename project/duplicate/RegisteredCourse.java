package duplicate;
/*. Class: RegisteredCourse (Inheritance + Constructor Chaining)
•	Extend the Course class
•	Add an extra field: duration (in months)
•	Constructor must use super()
 */

import java.util.Scanner;

/*. Method Overloading (ONLY Overloading allowed)
Create overloaded methods in RegisteredCourse:
•	displayCourseDetails()
•	displayCourseDetails(String studentName)
 */
/*Method Overriding (ONLY Overriding allowed)
Override displayCourseDetails() in RegisteredCourse to include:
•	Duration
•	Student details
 */
public class RegisteredCourse extends Course {
    int duration;
    RegisteredCourse(Scanner sc)
    {
        super(sc);
        courseDuration(sc);
        System.out.println("\nSucessfully! Registered '"+getcName().toUpperCase()+"' Course.");
    }
    public void courseDuration(Scanner sc)
    {   do{ System.out.println();
          System.out.println("Select a Course Duration (3 Months/6 Months): ");
          duration=sc.nextInt(); 
          if(duration!=3 && duration!=6)
             System.out.println("Select valid duration(3 months/6 months)");
        } while(duration!=3 && duration!=6);
        if(duration==6)
        { int cFee= getcFee()+3000;
            setcFee(cFee);
        }
    }
    public void  displayCourseDetails()
    {   studentDetails();
        System.out.println("Course Name      :  "+getcName());
        System.out.println("Course Fee       :  "+getcFee());
        System.out.println("Course Duration  :  "+duration);
    }
    public void displayCourseDetails(String sname)
    {
        studentDetails();
        displayCourseDetails();
        System.out.println("Course Duration  :  "+duration);
    }
}
