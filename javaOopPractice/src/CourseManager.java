public class CourseManager {
    public void addCourse(Course course){
        System.out.println(course.courseName+" isimli kurs eklenmistir.");
    };

    public void deleteCourse(Course course){
        System.out.println(course.courseName+" isimli kurs silinmistir..");
    };

    public void updateCourse(Course course){
        System.out.println(course.courseName+" isimli kurs guncellenmistir.");
    };

    public void getCourses(Course[] courses){
        System.out.println("\nCourse List");
        for (Course course : courses) {
            System.out.println(course.courseId+" "+ course.courseName);
        }
    };
}
