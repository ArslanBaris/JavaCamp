package DataAccess.Concretes;

import DataAccess.Abstracts.UserDao;
import Entities.Concrete.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HibernateUserDao implements UserDao {

    private ArrayList<User> users=new ArrayList<>();



    @Override
    public String add(User user) {
        users.add(user);
        return "User added."+user.getFirstName()+" "+user.getLastName()+
                "\n"+user.geteMail()+" adresinize mail gönderildi.";
    }

   @Override
    public User getUser(int id){
        for(User user:users){
            if(id == user.getId()){
                return  user;
            }else
                System.out.println("Eslesme saslanmadi.");

        }
        return  null;
    }

    @Override
    public List<User> getAllUser() {

        return users;
    }


}
