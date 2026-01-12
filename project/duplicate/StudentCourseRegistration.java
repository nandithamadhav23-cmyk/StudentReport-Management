package duplicate;

import java.util.Scanner;

/*Main Class (Scanner + Loops + Conditional Statements Required)
In main():
1.	Use Scanner to take: 
o	Student name
o	ID
o	Choose a course: 
	1 → Java (Fee: 5000)
	2 → Python (Fee: 4500)
	3 → Web Development (Fee: 6000)
2.	Use if-else or switch case to assign course.
3.	Ask user for course duration
(e.g., 3 months, 6 months)
4.	Create objects using constructors.
5.	Use a loop (for or while) to allow the user to: 
o	Register again OR
o	Exit
6.	Finally print: 
o	Student details
o	Course name
o	Fee
o	Duration
 */
public class StudentCourseRegistration {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);int ch=0;
 System.out.println("___________STUDENT COURSE REGISTRATION___________");
 do
{
  System.out.println("Do You Want to Register a Course: ");
  System.out.println("1.YES\n2.NO");
   ch= sc.nextInt();
    
    if(ch==1)
    { int f=0;RegisteredCourse rc =null;
     do{System.out.println();
         System.out.println("Select a feature:");
          System.out.println("1.Course Registration\n2.Display Details\n3.Update\n4.exit");
          System.out.println();
          f=sc.nextInt();        
         switch (f)
         {
          case 1:
           {   System.out.println("___________COURSE REGISTRATION_________");
             System.out.println();
              rc= new RegisteredCourse(sc);
             System.out.println("_________________________________________");
             break;
           }
         case 2:
          {
             if(rc==null)
              { System.out.println("Sorry! You have not Registered any Course...");
                 System.out.println("Please! Register a course to Display Details");
                 System.out.println();
                  continue;
               }
              else
               { System.out.println("________REGISTERED COURSE DETAILS_______");
                  System.out.println();
                  rc.displayCourseDetails();
                  System.out.println("_________________________________________");
                }
             break;
           } 
         case 3:
          { if(rc==null)
              { System.out.println("Sorry! You have not Registered any Course...");
                 System.out.println("Please! Register a course to Display Details");
                 System.out.println();
                  continue;
               }
             else{System.out.println("___________UPDATING STUDENT REGISTRATION_________");
                  System.out.println();
                  UpdateStudentDetails(sc,rc);
                  System.out.println("_________________________________________");
                }
              break;
          } 
         case 4:
            {  System.out.println("THANKYOU! For Course Registration...");
               System.out.println();
             break;
            }
         default: System.out.println("Select a valid option..");
          break;
         }
       }while(f!=4);
    }
    else if(ch==2)
    {  System.out.println();
        System.out.println("LOGGING OUT!....");
       System.out.println("_____________________THE END__________________________");
    }     
}while(ch!=2);
 sc.close();
}  
public static void UpdateStudentDetails(Scanner sc, RegisteredCourse rc)
{ int ud=0;
    System.out.println("Select a data to be updated..");
    System.out.println("1.Course Registration\n2.Course Duration\n3.EXIT");
    ud=sc.nextInt();
    switch (ud) {
        case 1:
        {   rc.courseRegistration(sc);rc.courseDuration(sc);
                      break;
        }
        case 2: rc.courseDuration(sc);break;
        case 3: System.out.println("Returning to Home Page...");break;
        default: System.out.println("Select a valid Option");
            break;
    }

}  
}

