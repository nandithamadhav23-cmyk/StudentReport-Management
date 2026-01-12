import java.util.ArrayList;
import java.util.List;

public class Display {
    String sname; String sid;
   Display(String sname, String sid)
   {
      this.sname=sname;
      this.sid=sid;
   } 
   List<RegisteredCourse> courses= new ArrayList<>();

  void addCourse(RegisteredCourse rc) {
        courses.add(rc);
    }

    void displaySummary() {
        System.out.println("          Student Name: " + this.sname);
        System.out.println("          Student ID: " +this.sid);
        System.out.println("Courses Registered:");
        System.out.println("--------------------------------");
        for (RegisteredCourse rc : courses) {
            rc.displayCourseDetails(sname);
            System.out.println("_________________________________________");
        }
        System.out.println("========================================================");
    }

}
