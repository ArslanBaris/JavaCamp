package DataAccess.Abstracts;

import Entities.Concrete.User;

import java.util.List;

public interface UserDao {
    String add(User user);
    User getUser(int id);
    List<User> getAllUser();

}
