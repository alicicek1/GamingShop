package GamingShop.data.concretes;

import GamingShop.data.abstracts.CampaignDaoI;
import GamingShop.data.abstracts.CartDaoI;
import GamingShop.model.concretes.Campaign;
import GamingShop.model.concretes.Cart;

import java.util.List;

public class CartDao implements CartDaoI {

    @Override
    public void add(Cart entity) {
        System.out.println("Connecting database... " + entity.getProductCount() + "product added.");

    }

    @Override
    public void update(Cart entity) {
        System.out.println("Connecting database... " + entity.getProductCount() + "product updated.");

    }

    @Override
    public void delete(Cart entity) {
        System.out.println("Connecting database... " + entity.getProductCount() + "product deleted.");

    }

    @Override
    public void deleteById(int id) {
        Cart c=new Cart();
        c.setId(1);
        System.out.println("Connecting database... " + c.getProductCount() + "product deleted.");
   }

    @Override
    public Cart getById(int id) {
        return null;
    }

    @Override
    public List<Cart> getAll() {
        return null;
    }
}
