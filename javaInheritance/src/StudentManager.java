public class StudentManager extends UserManager {

    public void addUser(User user){
        System.out.println(user.getFirstName()+" "+user.getLastName()+" isimli ögrenci kaydedildi.");
    }

    public void removeUser(User user){
        System.out.println(user.getFirstName()+" "+user.getLastName()+" isimli ögrenci silindi.");
    }

    public void updateUser(User user){
        System.out.println(user.getFirstName()+" "+user.getLastName()+" isimli ögrenci güncellendi.");
    }

    public void listTakenCourses(Student student){
        System.out.println("Course List");
        student.getTakenCourses();
    }
}
