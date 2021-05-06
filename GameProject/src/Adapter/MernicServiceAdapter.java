package Adapter;

import Abstract.UserCheckService;
import Entities.User;
import MernisService.ANQKPSPublicSoap;

public class MernicServiceAdapter implements UserCheckService {
    @Override
    public boolean CheckIfRealPerson(User user) {
        ANQKPSPublicSoap client = new ANQKPSPublicSoap();
        boolean result=false;

        try {
            result = client.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()),user.getFirstName().toUpperCase(),
                    user.getLastName().toUpperCase(),user.getDateOfBirth().getYear());
        } catch (Exception e) {
        e.printStackTrace();
    }
        return result;

    }
}
