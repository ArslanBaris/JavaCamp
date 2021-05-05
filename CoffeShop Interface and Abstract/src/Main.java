import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;
import MernisService.PBBKPSPublicSoap;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
        customerManager.save(new Customer(1,"Barış","Arslan",
                new Date(2000, 03, 19),"12345678912"));


    }
}
