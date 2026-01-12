
class Course extends Student{
    private String courseName;
    private int courseFee;
     Course(String sname, String sid, String cName, int cFee)
    {   super(sname, sid);
        courseFee= cFee;
        courseName=cName;
    }
    Course(String cName, int cFee)
    {   
        courseFee= cFee;
        courseName=cName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public void setCourseFee(int courseFee) {
        this.courseFee = courseFee;
    }
    
    public String getCourseName() {
        return courseName;
    }
    public int getCourseFee() {
        return courseFee;
    }
    public void displayCourseDetails()
    {  
        System.out.println("CourseName: "+this.courseName+"\nCourseFee: "+this.courseFee);
    }
}