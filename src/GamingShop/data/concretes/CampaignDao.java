package GamingShop.data.concretes;

import GamingShop.data.abstracts.CampaignDaoI;
import GamingShop.model.concretes.Campaign;

import java.util.List;

public class CampaignDao implements CampaignDaoI {
    @Override
    public void add(Campaign entity) {
        System.out.println("Connecting database... " + entity.getCampaignName() + " added.");
    }

    @Override
    public void update(Campaign entity) {
        System.out.println("Connecting database... " + entity.getCampaignName() + " updated.");
    }

    @Override
    public void delete(Campaign entity) {
        System.out.println("Connecting database... " + entity.getCampaignName() + " deleted.");
    }

    @Override
    public void deleteById(int id) {
        Campaign cp=new Campaign();
        cp.setId(id);
        System.out.println("Connecting database... " + cp.getCampaignName() + " deleted.");
    }

    @Override
    public Campaign getById(int id) {
        System.out.println("Connecting database...");
        Campaign cp=new Campaign();
        cp.setId(1);
        return cp;
    }

    @Override
    public List<Campaign> getAll() {
        System.out.println("Connecting database... Getting all campaigns.");
        return null;
    }
}
