package signUpWithGoogle;

import Business.Abstracts.AuthService;

public class GoogleManager  {


    public boolean register(String email, String password) {
        if(password.length()>10){
            System.out.println("Google ile kayıt olundu.");
            return true;
        }

        else{
            System.out.println("Google şifreniz 10 karakterden uzun olmalı.");
            return false;
        }

    }


    public boolean login(String email, String password) {
        if(password.equals("123456789")){
            System.out.println("Google ile giriş başarılı.");
            return  true;
        }

        else{
            System.out.println("Google şifreniz doğrulanamadı.");
            return  false;
        }

    }
}
