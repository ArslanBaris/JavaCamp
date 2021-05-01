import java.util.ArrayList;
import java.util.List;

public class Instructor extends User {

    private String department;
    private List<String> givenCourses = new ArrayList<>();

    public Instructor(){

    };

    public Instructor(int id,String userName, String firstName, String lastName, String eMail,
                      String department,Course[] courses) {
        super(id,userName, firstName, lastName, eMail);
        this.department = department;
        for (Course course : courses){
            givenCourses.add(course.getCourseName());
        }
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<String> getGivenCourses() {
        return givenCourses;
    }

    public void setGivenCourses(String course) {
        this.givenCourses.add(course);
    }

    public void setGivenCourses(Course[] courses) {
        for (Course course : courses){
            givenCourses.add(course.getCourseName());
        }
    }

}
