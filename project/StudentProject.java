
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentProject {
  public static void courseInfo(String sname, String sid,Scanner sc,Display dis)
  { 
     int ch; int fee=0; String cName="";
   
     do{
         System.out.println("Choose a Course (1/2/3):\n1.Java\n2.Python\n3.Web Development");
         ch=sc.nextInt();
         switch (ch) {
           case 1: cName="Java"; fee=5000; System.out.println("CourseFee(3months): "+fee+"\nCourseFee(6months): "+(fee+3000));
             break;
           case 2: cName="Python";fee=4500;System.out.println("CourseFee(3months): "+fee+"\nCourseFee(6months): "+(fee+3000));
             break;
           case 3: cName="Web Development";fee=6000;System.out.println("CourseFee(3months): "+fee+"\nCourseFee(6months): "+(fee+3000));
             break;
           default: System.out.println("choose a valid option....");
             break;
          }
        }while (ch<1||ch>3);   

     int months;     
     System.out.println("enter the course duration(3 Months /6 Months): ");
     do
     {   months=sc.nextInt();
       if(months!=3&&months!=6)
          System.out.println(months+" Months Invalid Duration..\n Enter the valid duration 3 months / 6 months:");   
     }while(months!=3&&months!=6);
     if(months==6)
     {
        fee+=3000;
     }
             RegisteredCourse rc = new RegisteredCourse(sname,sid,cName,fee,months);
             dis.addCourse(new RegisteredCourse(cName, fee, months));
         System.out.println("Registered "+cName.toUpperCase()+" Course Successfully!!!!");
         System.out.println();
         System.out.println("=======Details of Student=======");
           rc.displayCourseDetails();// rc.displayCourseDetails(sname);
         System.out.println("=================================");

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int reg;
    int dc;
     List<Display> stcourse = new ArrayList<>();
    do {
      System.out.println("-------Registration of Student Course-------");
      System.out.println("enter Student Name: ");
      String sname = sc.next();
      System.out.println("Enter Student ID: ");
      String sid = sc.next();

      Display dis = new Display(sname, sid);
  
      courseInfo(sname, sid, sc,dis);
      do{
      System.out.println("Do you want to register a different course :\n 1.Yes \n 2.No \n choose an option from above:");
      dc = sc.nextInt();
      if (dc == 1)
       courseInfo(sname, sid, sc,dis);
      else if (dc == 2)
        System.out.println(">>>..");
    } while(dc != 2);
      stcourse.add(dis);
      System.out.println("Are you a new Student...\n1.YES\n2.NO(EXIT)");
      reg = sc.nextInt();
      if (reg == 2) {
       { System.out.println("THANKYOU! For Course Registration...");}
        System.out.println("========================================================");
        int c =0;
        for (Display d : stcourse) {
          c++;
          System.out.println("_______________________STUDENT"+c+"__________________   ");
          d.displaySummary();
        }
        System.out.println(" HAVE A GOOD DAY (^_^)...");
      }
    } while (reg == 1);
    sc.close();
  }
}
