public class UserUI {
    private UserManager userManager;

    public UserUI(UserManager userManager){
        this.userManager=userManager;

    }

    public void addUser(User user){
        this.userManager.addUser(user);
    }

    public void removeUser(User user){
        this.userManager.removeUser(user);
    }

    public void updateUser(User user){
        this.userManager.updateUser(user);
    }
}
