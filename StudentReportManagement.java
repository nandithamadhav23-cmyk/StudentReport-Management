package project4;
import java.util.Scanner;
/*4.	The program must provide a menu-driven interface that allows the user to: 
o	Add a new student record
o	Display all student records
o	Search a student by roll number
o	Display grade report for a student
o	Exit the application
 */
public class StudentReportManagement {
    public static void main(String[] args) {
        
         ReportCard[] st=null;
        Scanner sc= new Scanner(System.in);
        int f=0;
        System.out.println("-------------------STUDENT RECORD MANAGEMENT----------------");
        while (f!=5)
       {            
         System.out.println("1.Upload New Student Record\n2.Display all Student Records\n3.Search Student by RollNumber\n4.Display Grade Report of Student\n5.EXIT");
         System.out.println();
         f=sc.nextInt();
          switch (f)
          {
             case 1://Upload
             {  System.out.println("How many Student Records do You Want to Upload?");
                int n=sc.nextInt();
                
                 st= new ReportCard[n];
                 for(int i=0;i<st.length;i++)
                 {  System.out.println();
                    System.out.println("--------------Uploading Student"+(i+1)+" Records-----------");
                    st[i]=new ReportCard();
                    System.out.println("---------------Uploaded Student"+(i+1)+" Records-------------");
                 }
                 
                  break;
             } 
             case 2: //display
             {   if(st==null)
                 {
                    System.out.println("No Student Records...");
                    System.out.println("Please Upload student Records");
                 }
                 else{
                     System.out.println("----------------Displaying Student Records-------------------");
                      for(int i=0;i<st.length;i++)
                      { 
                        System.out.println();
                        System.out.println("|------------------Student"+(i+1)+" Information--------------|");
                        st[i].displayStudentRecord();
                     System.out.println("|------------------------------------------------------------|");
                      }
                      System.out.println("-------------------------------------------------------------");
                 }                
                  break;
             } 
             case 3://search
                {
                     if(st==null)
                    {
                        System.out.println("No Student Records...");
                        System.out.println("Please Upload student Records");
                    }
                    else{
                            System.out.print("Enter the rollno: ");
                            String rno=sc.next();
                            boolean flag= false;
                            for(int i=0;i<st.length;i++)
                            {
                                if(st[i].getRno().equalsIgnoreCase(rno))
                                {   flag=true;
                                    System.out.println("|------------------Student Information--------------|");
                                    st[i].display(rno);
                                    System.out.println("|----------------------------------------------------|");
                                    break;
                                }
                                
                            }
                            if(flag==false)
                            {
                                System.out.println("No Student Record with '"+rno+"'");
                                    System.out.println("Please,Enter valid RollNO....");
                            }
                    }
                   
                    break;
                }
             case 4:
                {
                     if(st==null)
                    {
                        System.out.println("No Student Records...");
                        System.out.println("Please Upload student Records");
                    }
                    else{
                            System.out.print("Enter the Candidate rollno to display GradeSheet : ");
                            String rno=sc.next();
                            boolean flag= false;
                            for(int i=0;i<st.length;i++)
                            {
                                if(st[i].getRno().equalsIgnoreCase(rno))
                                {
                                    flag=true;
                                    st[i].displayreportCard();
                                    break;
                                }                       
                            }
                            if(flag==false)
                            {
                                System.out.println("No Student Record with '"+rno+"'");
                                    System.out.println("Please,Enter valid RollNO....");
                            }
                    }
                    break;
                }             
               case 5:
                {
                    System.out.println("Thankyou, Have a Great Day..(^_^) ! ");
                    System.out.println("LOGGING OUT.....");
                    break;
                }
             default: 
                {
                    System.out.println("Please, Choose a valid feature!");
                 break;
                }               
            }
            if(f!=5)
            {   System.out.println();
                System.out.println("Returning to Home Page...");
                System.out.println();
            }
        }
        sc.close();
    }
}
