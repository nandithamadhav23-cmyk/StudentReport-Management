package project3;
import java.util.*;
public class Employee {
    private String ename;
    private String eid;
    private String dept;
    // upload the detatils of emp by constructor
    Employee(Scanner sc)
    {
      System.out.print("Enter Employee Name: ");
      ename = sc.next();
      System.out.print("Enter Employee id: ");
      eid = sc.next();
      System.out.print("Enter Employee dept: ");
      dept = sc.next();
    }

    public void empDetails()
    {
        System.out.println("    Employee Name       : "+ename);
        System.out.println("    Employee id         : "+eid);
        System.out.println("    Employee Department : "+dept);
    }
}
