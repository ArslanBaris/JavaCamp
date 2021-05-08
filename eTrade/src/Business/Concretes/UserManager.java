package Business.Concretes;

import Business.Abstracts.AuthService;
import Business.Abstracts.UserService;
import DataAccess.Abstracts.UserDao;
import Entities.Concrete.User;

import java.util.Scanner;

public class UserManager implements UserService {


    private  UserDao userDao;
    private String sonuc=null;
    private AuthService authService;


    public UserManager(UserDao userDao,AuthService authService) {
        this.userDao = userDao;
        this.authService=authService;

    }

    @Override
    public void add(User user) {
        if(authService.validate(user) && isExists(user.geteMail())){

                sonuc=userDao.add(user);
                System.out.println(user.getFirstName()+" "+user.getLastName()+" sisteme eklendi.");
                System.out.println(sonuc);


        }else{
            System.out.println("Kullanıcı bilgilerini konrol et.");
        }
    }
    public boolean isExists(String email){
        for (User user:userDao.getAllUser()){
            if(email.equals(user.geteMail())){
                System.out.println("Kullanıcı maili kullanımda.");
                return false;
            }
        }
        return  true;
    }


}
