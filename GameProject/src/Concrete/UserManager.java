package Concrete;

import Abstract.UserCheckService;
import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService {
    private UserCheckService userCheckService;

    public UserManager(UserCheckService userCheckService) {
        this.userCheckService = userCheckService;
    }

    @Override
    public void add(User user) {
        if(userCheckService.CheckIfRealPerson(user)){
            System.out.println("User has been added. " +user.getFirstName()+" "+user.getLastName() );

        }
        else{
            System.out.println("Not a valid person.");
        }

    }

    @Override
    public void update(User user) {
        System.out.println("User has been updated. " +user.getFirstName()+" "+user.getLastName() );
    }

    @Override
    public void delete(User user) {
        System.out.println("User has been deleted. " +user.getFirstName() +" "+user.getLastName());
    }
}
