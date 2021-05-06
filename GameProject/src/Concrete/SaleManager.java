package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Sale;
import Entities.User;

public class SaleManager implements SaleService {

    @Override
    public void sales(Sale sale) {
        System.out.println("Seller: "+sale.getSeller().getFirstName()+" "+sale.getSeller().getLastName());
        System.out.println("Customer: "+sale.getCustomer().getFirstName()+" "+sale.getCustomer().getLastName());
        System.out.println("Product: "+sale.getGame().getName());
        System.out.println("Product Unit Price: "+sale.getGame().getUnitPrice());
        System.out.println("Campaign: "+sale.getCampaign().getCampaignName());
        System.out.println("Discount: "+sale.getCampaign().getDiscount());
        System.out.println("Product Sale Price: "+sale.getSalePrice());

    }
}
