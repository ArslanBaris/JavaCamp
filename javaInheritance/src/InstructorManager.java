public class InstructorManager extends UserManager {

    public void addUser(User user){
        System.out.println(user.getFirstName()+" "+user.getLastName()+" isimli egitmen eklendi.");
    }

    public void removeUser(User user){
        System.out.println(user.getFirstName()+" "+user.getLastName()+" isimli egitmen silindi.");
    }

    public void updateUser(User user){
        System.out.println(user.getFirstName()+" "+user.getLastName()+" isimli egitmen güncellendi.");
    }
}
