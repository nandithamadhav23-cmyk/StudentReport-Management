package project4;
/*2.Each student record must contain: 
o	Student name (String)
o	Roll number (String)
o	Course name (String)
o	Marks in three subjects
3.	The program must calculate: 
o	Total marks
o	Average marks
o	Grade based on average
 */

import java.util.Scanner;

public class StudentRecord {
    private String sname;
    private String rno;
    static String cname;    
     Scanner sc = new Scanner(System.in);
    static
    {
       cname="b.tech";
    }
   public void uploadStudent()
   {
     System.out.print("Enter Student Name: ");
     sname=sc.next();
     System.out.print("Enter rollno: ");
     rno=sc.next(); 
   }

   public String getSname() {
    return sname;
   }

   public String getRno() {
    return rno;
   } 
   public void display()
   {
      System.out.println("| Student Name  : "+sname);
      System.out.println("| RollNo        : "+rno);
      System.out.println("| CourseName    : "+cname);
   }
   
}
