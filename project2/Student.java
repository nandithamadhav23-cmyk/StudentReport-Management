package project2;

import java.util.Scanner;

/*•	Use encapsulation (private variables).
•	Variables: name, rollNo, subject1, subject2, subject3
•	Use a constructor to initialize all fields.
•	Create getter and setter methods.
•	Create methods: 
o	calculateTotal()
o	calculatePercentage()*/
public class Student {
   private String sname;
    private int rollNo; private int sub1, sub2,sub3; 
    int total; float per;
    Student(Scanner sc)
    {
        System.out.println("Enter Student Name:");
        sname=sc.next();
        System.out.println("Enter rollNo: ");
        rollNo=sc.nextInt();
        System.out.println("Enter Subject 1 Marks out of 100 Marks:");
        sub1=sc.nextInt();
        System.out.println("Enter Subject 2 Marks out of 100 Marks:");
        sub2=sc.nextInt();
         System.out.println("Enter Subject 3 Marks out of 100 Marks:");
        sub3=sc.nextInt();
        
        while (sub1>100||sub2>100||sub3>100)
        {  if(sub1>100)
           {System.out.println();
             System.out.println(sub1+" Invalid marks..");
             System.out.println("please enter valid marks..");
             System.out.println("Enter Subject 1 Marks out of 100 Marks:");
             sub1=sc.nextInt();            
           }
           else if(sub2>100)
           {System.out.println();
              System.out.println(sub2+" Invalid marks..");
             System.out.println("please enter valid marks..");
             System.out.println("Enter Subject 2 Marks out of 100 Marks:");
             sub2=sc.nextInt();
           }
            else if(sub3>100)
            {System.out.println();
             System.out.println(sub3+" Invalid marks..");
             System.out.println("please enter valid marks..");
             System.out.println("Enter Subject 3 Marks out of 100 Marks:");
             sub3=sc.nextInt();
            }            
        }
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getSub1() {
        return sub1;
    }

    public void setSub1(int sub1) {
        this.sub1 = sub1;
    }

    public int getSub2() {
        return sub2;
    }

    public void setSub2(int sub2) {
        this.sub2 = sub2;
    }

    public int getSub3() {
        return sub3;
    }

    public void setSub3(int sub3) {
        this.sub3 = sub3;
    }
    public int calTotal()
    {
        total=sub1+sub2+sub3;
        return total;
    }
    public float calPercentage()
    {
     per = ((float)total/300)*100;
        return per;
    }
}
