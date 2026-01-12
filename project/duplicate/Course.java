package duplicate;

import java.util.Scanner;

/*Class: Course
•	Private fields:
courseName, courseFee
•	Constructor to initialize values
•	Encapsulation must be used
 */
public class Course extends Student {
   private String cName; private int cFee;
    Course(Scanner sc)
    {
      super(sc); 
      courseRegistration(sc);
    }
    public void courseRegistration(Scanner sc)
    {
      System.out.println("Select a course: ");
      System.out.println("1.Java\n2.Python\n3.Web Development");
      int c;
      c= sc.nextInt();
      switch (c) {
        case 1:
        { cName="Java"; cFee=5000;
         System.out.println("Course Fee(3months): "+cFee+"\nCourse Fee(6months): "+(cFee+3000));
           break;
        }   
        case 2:
        { cName="Python"; cFee=7500;
           System.out.println("Course Fee(3months): "+cFee+"\nCourse Fee(6months): "+(cFee+3000));
           break;
        }    
        case 3:
        { cName="Web Development"; cFee=8500;
          System.out.println("Course Fee(3months): "+cFee+"\nCourse Fee(6months): "+(cFee+3000));
           break;
        }
        default: System.out.println("Choose a Valid Course..");
            break;
      }
    }
    public String getcName() {
        return cName;
    }
    public void setcName(String cName) {
        this.cName = cName;
    }
    public int getcFee() {
        return cFee;
    }
    public void setcFee(int cFee) {
        this.cFee = cFee;
    }
    public void displayCourseDetails()
    {
        System.out.println("Course Name      :  "+cName);
        System.out.println("Course Fee       :  "+cFee);
    }
    
}
