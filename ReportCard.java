package project4;

public class ReportCard extends Course {
    ReportCard()
    {
        uploadStudent();
        uploadCourse();
        calavg();
        calgrade();
    }
    public void displayStudentRecord()
    {
        display();      
    }

    public void displayreportCard()
    {   
        
        System.out.println("`_______________________________________________________________________");
        System.out.println("|_____________KAKATIYA INSTITUTE OF TECHNOLOGY AND SCIENCE______________|");
        System.out.println("|                                                                       |");
        System.out.println("|  H.T.N.O             : "+getRno().toUpperCase());
        System.out.println("|  Candidate's Name    : "+getSname().toUpperCase());
        System.out.println("|  Programme           : "+cname.toUpperCase()+"."+branch.toUpperCase());
        System.out.println("|                                                                       |");
        System.out.println("|                        Grade Sheet                                    |");
        System.out.println("|  --------------------------------------------------------             |");
        System.out.println("|  |S.NO |            Subject Name           |Grade|Result|             |");
        System.out.println("|  --------------------------------------------------------             |");
        for(int i=0;i<sub.length;i++)
        {
           System.out.printf("|  |  %d  |%-35s|  %c  | %s |             |\n",(i+1),sub[i],grade[i],sr[i]); 
        }
        System.out.println("|   -------------------------------------------------------             |");
        System.out.println("|  Total Marks      : "+total+"                                               |");
        System.out.printf("|  Average          : %.2f                                             |\n",avg);
        System.out.println("|                                                                       |");
         int res=1;
        for(String s: sr)
        { 
            if(s=="FAIL")
            {
                res=0;
                break;
            }
            else
                res=1;
        }
        if(res!=0&&avg>40)
        {
            System.out.println("|  "+getSname().toUpperCase()+" PASSED  in Examinations..");
        }
        else if(res==0||avg<=40)
        {
            System.out.println("|  "+getSname().toUpperCase()+" FAILED in Examinations..");
        }
        System.out.println("|_______________________________________________________________________|");
    }
}
