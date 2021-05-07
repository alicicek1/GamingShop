package GamingShop.business.concretes;

import GamingShop.business.abstracts.ProductService;
import GamingShop.model.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {
    @Override
    public void add(Product entity) {
        if (entity.getProductName().length()<=2){
            System.out.println("Product name must be at least three characters.");
        }
        System.out.println("Success..");
    }

    @Override
    public void update(Product entity) {
        System.out.println("Success..");

    }

    @Override
    public void delete(Product entity) {
        System.out.println("Success..");

    }

    @Override
    public Product get(int id) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
