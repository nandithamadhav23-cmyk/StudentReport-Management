package project3;
import java.util.Scanner;

public class EmployeePerformanceTracking {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager m=null;
        int ch=0;
        Employee[] emp=null;
        System.out.println("_________________Employee Performance Tracking System_______________");
        while(ch!=4)
        { System.out.println();
            System.out.println("----------------Home Page-----------------");
            System.out.println("1.Upload Employee Details(ONLY MANAGERS)\n2.Upload Employee Performance(FOR USERS)\n3.Employee Performance Report(EMPLOYEES)\n4.EXIT");
             System.out.println("-----------------------------------------");
             System.out.println();
            ch=sc.nextInt();
            switch (ch) {
                case 1: //upload employee details
                {   System.out.print("How many employee details to be Uploaded : "); 
                   int n=sc.nextInt();
                    emp=Manager.uploadEmpDetails(sc,n);
                    break;

                }
                case 2: { //upload employee performance
                    if(emp!=null)
                     { //works only if manager upload employee details
                        for(int i=0;i<emp.length;i++)
                        { 
                         System.out.println("---------------------------------------------");
                            emp[i].empDetails();
                         System.out.println("------------------------------------------");
                        }
                     }
                    System.out.println("___________Upload Employee Performance_________");
                      m=new Manager(sc);//upload employee details along with performance
                     System.out.println("__________Uploaded Employee Performance________");
                    break;
                }
                case 3: {  // Employee performance Report  
                         if(m==null)
                        { //if user not uploaded any employee performance data,
                          //  can't display employee Performce Report
                          System.out.println("No Employee Details to Display..");
                          System.out.println("Please! Upload Employee Performance..");
                          break;//loop stops and starts again..
                        }
                       else
                        {
                           m.empReport();//display Employee Performance Report
                        }
                        break;                       
                    }
                case 4:System.out.println("Logging Out...");
                        System.out.println("____________________________The End__________________________");
                        break;
                default:
                    System.out.println("Select a valid feature...");
               
            }
            if(ch!=4)
                System.out.println("\nReturning to Home Page...");
        }
        sc.close();
    }
}
