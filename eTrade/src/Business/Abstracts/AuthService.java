package Business.Abstracts;

import Entities.Concrete.User;

public interface AuthService {
    boolean validate(User user);
    boolean login(User user);

}
