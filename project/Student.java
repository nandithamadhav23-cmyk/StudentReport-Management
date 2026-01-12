
class Student
{   private String studentName;
    private String studentId;
    Student()
    {}
    Student(String name, String id)
    {
       studentId=id;
       studentName=name;
    }
    public String getStudentName() {
        return studentName;
    }
    public String getStudentId() {
        return studentId;
    }
}
