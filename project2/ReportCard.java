package project2;
/*Create a class ReportCard that extends Report
•	Implement generateReport()
•	Print: 
o	Name
o	Roll Number
o	Total
o	Percentage
o	Grade
o	Pass/Fail
 */
public class ReportCard extends Report {
    ReportCard(){super();}
    
    public  void generateReport(Result obj)
    {
      
       System.out.println("___________________REPORT CARD____________________");
       System.out.println("Student Name          :  "+obj.getSname());
       System.out.println("Student RollNo        :  "+obj.getRollNo());
       System.out.println("-----------Marks Scored------------");
       System.out.println("Subject 1 Marks       :  "+obj.getSub1());
       System.out.println("Subject 2 Marks       :  "+obj.getSub2());
       System.out.println("Subject 3 Marks       :  "+obj.getSub3());
       System.out.println("-------------------------------------");
       System.out.println("Total Marks Scored    :  "+obj.calTotal()+"/300");
       System.out.printf("Percentage Obtained   :  %.2f",obj.calPercentage());
       System.out.println(" %");
       System.out.println("Grade                 :  "+obj.getGrade());
       System.out.println();
     if(obj.is_pass()==false)
     {
       System.out.println("     ---------"+(obj.getSname()).toUpperCase()+" Failed!------");
       System.out.println("        ....Better Luck NextTime!..");
       System.out.println("        ........ALL THE BEST !!!.....");
     }
     else if(obj.is_pass()==true)
     {
       System.out.println("     ---------"+(obj.getSname()).toUpperCase()+" Passed!------");
       System.out.println("        ~~~~~~~CONGRATULATIONS~~~~~~~~");
       System.out.println("           ......ALL THE BEST !!!.....");
     }
       System.err.println("_____________________________________________________________");
    }
    
}
