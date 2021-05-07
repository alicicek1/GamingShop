package GamingShop.business.concretes;

import GamingShop.business.abstracts.CampaignService;
import GamingShop.model.concretes.Campaign;

import java.util.List;

public class CampaignManager implements CampaignService {
    @Override
    public void add(Campaign entity) {
        if (entity.getCampaignName().length()<=2){
            System.out.println("Campaign name must be at least three characters.");
        }
        System.out.println("Success..");
    }

    @Override
    public void update(Campaign entity) {
        System.out.println("Success..");
    }

    @Override
    public void delete(Campaign entity) {
        System.out.println("Success..");
    }

    @Override
    public Campaign get(int id) {
        return null;
    }

    @Override
    public List<Campaign> getAll() {
        return null;
    }
}
