package GamingShop.business.concretes;

import GamingShop.business.abstracts.CartService;
import GamingShop.model.concretes.Cart;

import java.util.List;

public class CartManager implements CartService {
    @Override
    public void add(Cart entity) {
        System.out.println("Products added to the basket.");
    }

    @Override
    public void update(Cart entity) {
        System.out.println("Products updated in the basket.");
    }

    @Override
    public void delete(Cart entity) {
        System.out.println("Products deleted in the basket.");
    }

    @Override
    public Cart get(int id) {
        return null;
    }

    @Override
    public List<Cart> getAll() {
        return null;
    }
}
