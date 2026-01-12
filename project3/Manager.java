package project3;

import java.util.Scanner;

public class Manager extends User {
       int sal=35000;
    int incent=0;
    
Manager(Scanner sc)
   {
     super(sc);//calls the parent constructor i.e User class
   } 
  
// upload employee details by manager case1 and returns the address of created employee array 
  
 public static Employee [] uploadEmpDetails(Scanner sc, int n)
   {  //It is static method so no need to create Manager obj 
      // can call this method using className
     Employee e[]=new Employee[n]; 
      for(int i=0;i<n;i++)
        { System.out.println("--------------------------------------");
           e[i]=new Employee(sc);// uploading n no of employess
           System.out.println("-------------------------------------");
        } 
        return e; 
   }

// display emp category based on performance and gives incentives and update the salary based on performance
   
  public void empPerformance()
   {
     switch (perf) {
        case 1:
         { System.out.println("Not Satisfied with Your performance...\n          Need to WorkHard..");
           incent= 0; 
         break;
         }   
        case 2:
         { System.out.println("Need to Be Improved..");
            incent=1000;
             break;
         } 
         case 3:
         { System.out.println("Stable Work");
            incent=1500;
            break;
         } 
         case 4:
         { System.out.println("Outstanding Performance..");
           incent=2000;
             break;
         } 
     }
   }

//display employee performance Report because manage will create the employee reports
   public void empReport()
   {
       System.out.println("________Employee Performance Report_____");
       empDetails();//display employee details from employee class
       System.out.print("    Performance         : ");empPerformance();
       System.out.println("    Salary(Month)        : "+sal);
       System.out.println("    Incentive            : "+incent);
       System.out.println("________________________________________");
   }
}
