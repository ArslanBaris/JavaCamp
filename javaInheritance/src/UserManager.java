public class UserManager {

    public void addUser(User user){
        System.out.println(user.getFirstName()+" "+user.getLastName()+" isimli kullanici kaydedildi.");
    }

    public void removeUser(User user){
        System.out.println(user.getFirstName()+" "+user.getLastName()+" isimli kullanici silindi.");
    }

    public void updateUser(User user){
        System.out.println(user.getFirstName()+" "+user.getLastName()+" isimli kullanici güncellendi.");
    }
}
