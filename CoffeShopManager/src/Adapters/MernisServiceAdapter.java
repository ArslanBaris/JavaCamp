package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import MernisService.WDCKPSPublicSoap;
import MernisService.WDCKPSPublicSoap;

import java.util.Locale;

public class MernisServiceAdapter implements CustomerCheckService {

    @Override
    public boolean CheckIfRealPerson(Customer customer) {

        WDCKPSPublicSoap client = new WDCKPSPublicSoap();
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
