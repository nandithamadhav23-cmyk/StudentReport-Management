
class RegisteredCourse extends Course
{
    int duration;
    RegisteredCourse(String sname,String sid,String cname, int fee, int duration)
    { 
        super(sname, sid, cname, fee);
        this.duration=duration;
    }
     RegisteredCourse(String cname, int fee, int duration)
    { 
        super(cname, fee);
        this.duration=duration;
    }
    public void displayCourseDetails(){
        System.out.println("Student Name: "+getStudentName());
        System.out.println("Student Id: "+getStudentId());
       System.out.println("CourseName: "+getCourseName());
       System.out.println("CourseFee: "+getCourseFee());
        System.out.println("Duration: "+duration+" months");
    }

    public void displayCourseDetails(String studentName)
    {  
    //   System.out.println("Student Name: "+getStudentName());
    //    System.out.println("Student Id: "+getStudentId());
      super.displayCourseDetails();
      System.out.println("Duration: "+duration+" months");
    }
}

