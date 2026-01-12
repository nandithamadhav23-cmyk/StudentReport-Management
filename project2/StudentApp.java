package project2;
import java.util.Scanner;
/*Create a class StudentApp (Main class)
Use:
•	Scanner for input
•	Loops (do-while or while)
•	switch case for menu options
Menu should be:
1. Enter Student Details 2. Show Report Card 3. Exit
•	Store only ONE student (because arrays not allowed)
•	Ensure user cannot print report before entering data
•	Use constructor call, method calls, inheritance, and abstraction properly
 */
public class StudentApp {
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  ReportCard rc =new ReportCard();
   int f;
   Result r=null;
    int ch=0;

   System.out.println("\n______________STUDENT APPLICATION_____________________");
   do{ System.out.println();
    System.out.println("Select a Feature...");
    System.out.println("1.Upload Student Details\n2.Display ReportCard\n3.EXIT");
    System.out.println();
    f=sc.nextInt();
    switch (f) {
      case 1:
      { System.out.println("__________Uploading Student Details___________");
        System.out.println();
        r=new Result(sc);  
        System.out.println();
        System.out.println("Successfully! Uploaded the Student Details...");      
        System.out.println("_______________________________________________");
        break;
      }
      case 2:
      { if(r==null)
        { System.out.println("SORRY! You have not Uploaded any Student Details");
          System.out.println("Please! Upload Student Detials..");
          //r= new Result(sc);
          System.out.println();
          continue;
        }
        else
       {   rc.generateReport(r);
           System.out.println("\nDo You want to update any student Details\n1.YES\n2.NO");
           System.out.println();
           ch=sc.nextInt();           
           if(ch==1)
           { System.out.println("_______Updating Student Details_______");
             updateDetails(r,sc);
             System.out.println("_______________________________________");
           } 
           else if(ch==2)
           { System.out.println("Returning to Home Page...");  
             System.out.println("--------------------------");
            continue;
           }   
        }        
       break;
      }
      case 3: 
      {
        System.out.println("Thankyou! for Using the App (^_^)..\nLOGGING OUT..."); 
        System.out.println("____________________THE END___________________");
        System.out.println();
        break;}
      default:{
        System.out.println("Please! Select a valid Feature...");   
        break;
      }
    }
   }while(f!=3);
 
}
public static void updateDetails(Result ud,Scanner sc)
{ 
   int d ;
   System.out.println("choose a Student data to be updated..");
   System.out.println("1.Student Name\n2.Student RollNo\n3.Subject 1 Marks\n4.Subject 2 Marks\n5.Subject 3 Marks");
   System.out.println();
   d = sc.nextInt();
   switch (d) {
    case 1:
    { System.out.println("Enter Student Name:");
      String sname = sc.next();
      ud.setSname(sname); 
      System.out.println("Successfully! Updated Student Name..");
      break;
    }
    case 2:
    { System.out.println("Enter Student rollno:");
      int sid = sc.nextInt();
      ud.setRollNo(sid);
      System.out.println("Successfully! Updated Student RollNo..");
      break;
    }  
    case 3:
    { System.out.println("Enter Subject 1 Marks:");
      int s1 = sc.nextInt();     
       while(s1>100){   System.out.println();
             System.out.println(s1+" Invalid marks..");
             System.out.println("please enter valid marks..");
             System.out.println("Enter Subject 1 Marks out of 100 Marks:");
             s1=sc.nextInt();
          } 
        ud.setSub1(s1);
        System.out.println("Successfully! Updated Subject 1 Marks..");
      break;
    }    
    case 4:
    { System.out.println("Enter Subject 2 Marks:");
      int s2 = sc.nextInt();
       while(s2>100){   System.out.println();
             System.out.println(s2+" Invalid marks..");
             System.out.println("please enter valid marks..");
             System.out.println("Enter Subject 2 Marks out of 100 Marks:");
             s2=sc.nextInt();
          } 
      ud.setSub2(s2);
      System.out.println("Successfully! Updated Subject 2 Marks..");
      break;
    }
    case 5:
    { System.out.println("Enter Subject 3 Marks:");
      int s3 = sc.nextInt();
       while(s3>100){   System.out.println();
             System.out.println(s3+" Invalid marks..");
             System.out.println("please enter valid marks..");
             System.out.println("Enter Subject 3 Marks out of 100 Marks:");
             s3=sc.nextInt();
          } 
      ud.setSub3(s3);
      System.out.println("Successfully! Updated Subject 3 Marks..");
      break;
    }        
    default: System.out.println("Enter a valid option");
      break;
   }
}
}
