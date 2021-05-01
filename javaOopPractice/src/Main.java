public class Main {

    public static void main(String[] args) {
        InstructorManager instructorMn = new InstructorManager();
        CourseManager courseMn = new CourseManager();
        CategoryManager categoryMn = new CategoryManager();

        Instructor ins1 = new Instructor(1, "Engin Demirog");

        instructorMn.addInstructor(ins1);

        Course course1 = new Course(1,
                "Yazilim Gelistirici Yetistirme Kampi (C# & Angular)",
                "2 ay surecek ucretsiz ve profesyonel bir programla, sifirdan yazilim gelistirme ogreniyoruz.",
                0);
        Course course2 = new Course(2,
                "Yazilim Gelistirici Yetistirme Kampi (JAVA & REACT)",
                "2 ay surecek ucretsiz ve profesyonel bir programla, sifirdan yazilim gelistirme ogreniyoruz.",
                0);
        Course course3 = new Course(3,
                "Programlamaya Giris Icin Temel Kurs",
                "PYTHON, JAVA, C# gibi tum programlama dilleri icin temel programlama mantigini anlasilir orneklerle ogrenin.",
                0);

        courseMn.addCourse(course1);
        courseMn.addCourse(course2);
        courseMn.addCourse(course3);

        Category category1 = new Category(1,"Programlama");

        categoryMn.addCategory(category1);

        Instructor[] instructors = {ins1};
        Course[] courses = {course1,course2,course3};
        Category[] categories = {category1};

        instructorMn.getInstructors(instructors);
        courseMn.getCourses(courses);
        categoryMn.getCategories(categories);

    }
}
