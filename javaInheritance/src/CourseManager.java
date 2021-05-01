public class CourseManager {

    public void addCourse(Course course){
        System.out.println(course.getCourseName()+" isimli kurs eklenmistir.");
    };

    public void deleteCourse(Course course){
        System.out.println(course.getCourseName()+" isimli kurs  silinmistir.");
    };

    public void updateCourse(Course course){
        System.out.println(course.getCourseName()+" isimli kurs  güncellenmistir.");
    };
}
