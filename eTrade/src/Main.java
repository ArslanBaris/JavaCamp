import Business.Abstracts.AuthService;
import Business.Abstracts.UserService;
import Business.Concretes.AuthManager;
import Business.Concretes.UserManager;
import Core.GoogleServiceManagerAdapter;
import DataAccess.Abstracts.UserDao;
import DataAccess.Concretes.HibernateUserDao;
import Entities.Concrete.User;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        User user1 = new User(1,"Barış","Arslan","arslan1881outlook.com","12345678910");
        User user2 = new User(2,"Mehmet","asdas","arslan@hotmail.com","12345600");
        UserService userService = new UserManager(new HibernateUserDao(), new AuthManager());
        userService.add(user1);
        userService.add(user2);

        AuthService authService = new AuthManager();
        if(authService.login(user1))
            System.out.println("Giris basarili");
        else
            System.out.println("Basarisiz");



    }
}
