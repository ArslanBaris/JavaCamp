package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManger implements CampaignService {

    @Override
    public void add(Campaign campaign) {
        System.out.println("Campaign has been added. " + campaign.getCampaignName() );
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println("Campaign has been updated." + campaign.getCampaignName() );
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println("Campaign has been deleted. " + campaign.getCampaignName() );
    }
}
