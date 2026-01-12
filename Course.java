package project4;

public class Course extends StudentRecord {
    String branch;
    String sub[]=new String[5];
    int submarks[]=new int[5];
     int total;     
     float avg; 
     char grade[]=new char[5];   
     String sr[]=new String[5];
    public  void uploadCourse()
    {
        System.out.println("Select your branch:");
       System.out.println("1.ComputerScience\n2.EEE\n3.CIVIL\n4.ECE\n5.Mech");
       int b=sc.nextInt();
      switch (b) {
        case 1: 
         {  
            branch="Computer Science Engineering";
            sub[0]="Java";
            sub[1]="Operating System";
            sub[2]="Software Engineering";
            sub[3]="Computer Networks";
            sub[4]="Database Management Systems(DBMS)";
            for(int i=0;i<submarks.length;i++)
            {
                System.out.print("Enter '"+sub[i]+"' Marks: ");
                submarks[i]=sc.nextInt();
            }
             break;
         }   
           
        case 2: 
        {
             branch="Electrical and Electronics Engineering";
              sub[0]="Power Systems";
            sub[1]="Electrical Machines";
            sub[2]="Control Systems";
            sub[3]="Analog & Digital Electronics";
            sub[4]="Measurements & Instrumentation";
            for(int i=0;i<submarks.length;i++)
            {
                System.out.print("Enter '"+sub[i]+"' Marks: ");
                submarks[i]=sc.nextInt();
            }
             break;
        }
        case 3: 
        {
             branch="Civil Engineering";
            sub[0]="Structural Analysis";
            sub[1]="Geotechnical Engineering";
            sub[2]="Transportation Engineering";
            sub[3]="Environmental Engineering";
            sub[4]="Construction Planning & Management";
            for(int i=0;i<submarks.length;i++)
            {
                System.out.print("Enter '"+sub[i]+"' Marks: ");
                submarks[i]=sc.nextInt();
            }
             break;
        }
         case 4: 
        {
             branch="Electronic and Communication Engineering";
              sub[0]="Digital Signal Processing";
             sub[1]="Analog & Digital Communication";
             sub[2]="Microprocessors & Microcontrollers";
             sub[3]="VLSI Design";
             sub[4]="Electromagnetic Fields";
            for(int i=0;i<submarks.length;i++)
            {
                System.out.print("Enter '"+sub[i]+"' Marks: ");
                submarks[i]=sc.nextInt();
            }
             break;
        }
         case 5: 
        {
             branch="Mechanical Engineering";
             sub[0]="Thermodynamics";
             sub[1]="Fluid Mechanics";
             sub[2]="Machine Design";
             sub[3]="Heat Transfer";
             sub[4]="Manufacturing Technology";
            for(int i=0;i<submarks.length;i++)
            {
                System.out.print("Enter '"+sub[i]+"' Marks: ");
                submarks[i]=sc.nextInt();
            }
             break;
        }
        default: System.out.println("Select a valid branch");
         break;
      }

    }

    public void calavg()
    {
       
       for(int m: submarks)
       {
         total+=m;
       }
       avg=((float)total/sub.length);
    }

    public void calgrade()
    {
        for(int i=0;i<sub.length;i++)
        {
            if(submarks[i]>90)
            {
                grade[i]='S';
            }
            else if(submarks[i]>80 && submarks[i]<=90)
            {
                grade[i]='A';
            }
            else if(submarks[i]>70 && submarks[i]<=80)
            {
                grade[i]='B';
            }
            else if(submarks[i]>60 && submarks[i]<=70)
            {
                grade[i]='C';
            }
            else if(submarks[i]>50 && submarks[i]<=60)
            {
                grade[i]='D';
            }
            else if(submarks[i]>40 && submarks[i]<=50)
            {
                grade[i]='E';
            }
            else if(submarks[i]<=40)
            {   grade[i]='f';
            }
          ///////////////////////////
            if(submarks[i]>40)
            {
                sr[i]="PASS";
            }
            else if(submarks[i]<=40)
            {
                sr[i]="FAIL";
            }

        }      
       
    }
    public void display()
    {
        super.display();
        System.out.println("| Branch        : "+branch);
    }
    public void display(String rno)
    {
        super.display();
        System.out.println("| Branch        : "+branch);
        System.out.println("|  --------------------------------------------------");
        System.out.println("|  |S.NO |            Subject Name           |Marks |");
        System.out.println("|  --------------------------------------------------");
        for(int i=0;i<sub.length;i++)
        {
           System.out.printf("|  |  %d  |%-35s|  %-2d  |\n",(i+1),sub[i],submarks[i]); 
        }
        System.out.println("|   --------------------------------------------------");
    }

}
