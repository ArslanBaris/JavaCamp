import java.util.ArrayList;
import java.util.List;

public class Student extends User {

    private int schoolNumber;
    private String school;
    private  List<String> takenCourses = new ArrayList<>();

    public Student(){

    };

    public Student(int id, String userName,String firstName, String lastName, String eMail, int schoolNumber,
                   String school,Course[] courses) {
        super(id,userName, firstName, lastName, eMail);
        this.schoolNumber = schoolNumber;
        this.school = school;
        for (Course course : courses){
            takenCourses.add(course.getCourseName());
        }

    }

    public int getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public List<String> getTakenCourses() {
        return takenCourses;
    }

    public void setTakenCourses(String course) {
        this.takenCourses.add(course);
    }

    public void setTakenCourses(Course[] courses) {
        for (Course course : courses){
            takenCourses.add(course.getCourseName());
        }
    }



}
