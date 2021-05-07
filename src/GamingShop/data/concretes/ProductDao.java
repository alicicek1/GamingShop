package GamingShop.data.concretes;

import GamingShop.data.abstracts.ProductDaoI;
import GamingShop.model.concretes.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDao implements ProductDaoI {
    @Override
    public void add(Product entity) {
        System.out.println("Connecting database... " + entity.getProductName() + " added.");

    }

    @Override
    public void update(Product entity) {
        System.out.println("Connecting database... " + entity.getProductName() + " updated.");

    }

    @Override
    public void delete(Product entity) {
        System.out.println("Connecting database... " + entity.getProductName() + " deleted.");
    }

    @Override
    public void deleteById(int id) {
        Product cp=new Product();
        cp.setId(id);
        System.out.println("Connecting database... " + cp.getProductName() + " deleted.");
    }

    @Override
    public Product getById(int id) {
        Product product=new Product();
        return product;
    }

    @Override
    public List<Product> getAll() {
        List<Product> prList=new ArrayList<>();
        return prList;
    }
}
