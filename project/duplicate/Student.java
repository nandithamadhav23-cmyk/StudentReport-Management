package duplicate;

import java.util.Scanner;

/*Class: Student (Encapsulation)
•	Private fields:
studentName, studentId
•	Constructor to set values
•	Getter methods only
•	No arrays allowed
 */
public class Student {
   private String sname;private String id;
    Student(Scanner sc)
    {
      System.out.println("Enter Student Name:");
       sname =sc.next();
       System.out.println("Enter Student Id:");
       id=sc.next();
    }
    public String getSname() {
        return sname;
    }
    public String getId() {
        return id;
    }
    public void studentDetails()
    {
        System.out.println("Student Name     :  "+this.sname);
        System.out.println("Student Id       :  "+this.id);
    }
}
