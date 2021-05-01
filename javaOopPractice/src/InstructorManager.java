public class InstructorManager {

    public void addInstructor(Instructor instructor){
        System.out.println(instructor.insName+" isimli egitmen eklenmitir.");
    };

    public void deleteInstructor(Instructor instructor){
        System.out.println(instructor.insName+" isimli egitmen  silinmistir.");
    };

    public void updateInstructor(Instructor instructor){
        System.out.println(instructor.insName+" isimli egitmen guncellenmistir.");
    };

    public void getInstructors(Instructor[] instructors){
        System.out.println("\nCourse List");
        for (Instructor instructor : instructors) {
            System.out.println(instructor.insId+" "+ instructor.insName);
        }

    };
}
