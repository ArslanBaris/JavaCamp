package Business.Concretes;

import Business.Abstracts.AuthService;
import DataAccess.Abstracts.UserDao;
import Entities.Concrete.User;

import java.util.regex.Pattern;

public class AuthManager implements AuthService {



    public boolean validate(User user) {
        if(user.getPassword().length()>6 &&
                user.getFirstName().length()>2 &&
                user.getLastName().length()>2 &&
                isValidEmail(user.geteMail()))
        {
            return true;
        }else
            return false;
    }

    @Override
    public boolean login(User user) {
        if(!(user.geteMail()==null)&& !(user.getPassword()==null)){
            return true;
        }else
            return false;
    }

    public boolean isValidEmail(String email) {
        String emailRegex = "\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{3}\\b";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
}
