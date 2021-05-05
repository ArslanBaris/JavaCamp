package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import MernisService.PBBKPSPublicSoap;

import java.util.Locale;

public class MernisServiceAdapter implements CustomerCheckService {

    @Override
    public boolean CheckIfRealPerson(Customer customer) {

        PBBKPSPublicSoap client = new PBBKPSPublicSoap();
        boolean result = false;
        try {
            result =  client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName().toUpperCase(),
                    customer.getLastName().toUpperCase(),customer.getDateOfBirth().getYear());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
