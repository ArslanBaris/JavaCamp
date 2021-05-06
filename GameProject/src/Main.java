import Adapter.MernicServiceAdapter;
import Concrete.*;
import Entities.Campaign;
import Entities.Game;
import Entities.Sale;
import Entities.User;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        User user1 = new User(1,"Barış","Arslan","123456789",new Date(2000,01,01));
        User user2 = new User(2,"Mehmet","Arslan","123456789",new Date(1968,01,01));

        UserManager userManager = new UserManager(new MernicServiceAdapter());
        userManager.add(user1);
        userManager.add(user2);

        System.out.println("");

        Game game = new Game(1,"Call of Duty 4","Askeri Savas Oyunu",100);

        GameManager gameManager = new GameManager();
        gameManager.add(game);

        System.out.println("");

        Campaign campaign1 = new Campaign(1, "%20 discount ",20);
        Campaign campaign2 = new Campaign(2, "%50 discount ",50);
        Campaign campaign3 = new Campaign(3, "%75 discount ",75);

        CampaignManger campaignManger = new CampaignManger();
        campaignManger.add(campaign1);
        campaignManger.add(campaign2);
        campaignManger.add(campaign3);

        System.out.println("\nSale Detail\n");

        Sale sale1 = new Sale(1,game,user1,user2,campaign2);

        SaleManager saleManager = new SaleManager();
        saleManager.sales(sale1);









    }
}
