public class Main {

    public static void main(String[] args) {

        Course course1 = new Course(1,"C# & Angular");
        Course course2 = new Course(2,"JAVA & REACT");
        Course course3 = new Course(3,"Temel Kurs");

        Course[] courses1 = {course1};
        Course[] courses2 = {course1,course2};
        Course[] courses3 = {course2,course3};
        Course[] courses4 = {course1,course3};
        Course[] courses5 = {course1,course2,course3};

        CourseManager courseManager = new CourseManager();
        courseManager.addCourse(course1);
        courseManager.addCourse(course2);
        courseManager.addCourse(course3);

        System.out.println("\n");

        Instructor instructor1 = new Instructor(1,"user159","Engin","Demirog",
                "deneme@gmail.com","Software",courses1);
        UserUI user1 = new UserUI(new InstructorManager());
        user1.addUser(instructor1);

        instructor1.setGivenCourses(course2.getCourseName());
        instructor1.setGivenCourses(course3.getCourseName());

        user1.updateUser(instructor1);

        System.out.println("\n");

        Student student1 = new Student(1,"user123","Baris","Arslan",
                "deneme@gmail.com",125,"CBU",courses1);

        Student student2 = new Student(2,"user456","Mehmet","Arslan",
                "deneme@gmail.com",329,"KTU",courses3);

        Student student3 = new Student();
        student3.setId(3);
        student3.setUserName("user789");
        student3.setFirstName("Ahmet");
        student3.setLastName("Bardak");
        student3.seteMail("deneme@gmail.com");
        student3.setSchoolNumber(820);
        student3.setSchool("ODTU");
        student3.setTakenCourses(courses4);

        UserUI user2 = new UserUI(new StudentManager());
        user2.addUser(student1);

        UserUI user3 = new UserUI(new StudentManager());
        user3.addUser(student2);

        UserUI user4 = new UserUI(new StudentManager());
        user4.addUser(student3);

        user4.removeUser(student3);


    }
}
