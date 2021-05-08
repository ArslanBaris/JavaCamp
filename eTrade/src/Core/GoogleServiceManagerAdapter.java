package Core;

import Business.Abstracts.AuthService;
import Entities.Concrete.User;
import signUpWithGoogle.GoogleManager;

public class GoogleServiceManagerAdapter implements AuthService {

    GoogleManager googleManager=new GoogleManager();
    boolean result=false;


    @Override
    public boolean validate(User user) {

            result = googleManager.register(user.geteMail(), user.getPassword());
            return result;


    }

    @Override
    public boolean login(User user) {
        result = googleManager.login(user.geteMail(), user.getPassword());
        return result;
    }


}
