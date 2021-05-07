package GamingShop.data.concretes;

import GamingShop.data.abstracts.CategoryDaoI;
import GamingShop.model.concretes.Category;

import java.util.List;

public class CategoryDao implements CategoryDaoI {
    @Override
    public void add(Category entity) {
        System.out.println("Connecting database... " + entity.getCategoryName() + " added.");

    }

    @Override
    public void update(Category entity) {
        System.out.println("Connecting database... " + entity.getCategoryName() + " updated.");

    }

    @Override
    public void delete(Category entity) {
        System.out.println("Connecting database... " + entity.getCategoryName() + " deleted.");

    }

    @Override
    public void deleteById(int id) {
        Category cp=new Category();
        cp.setId(id);
        System.out.println("Connecting database... " + cp.getCategoryName() + " deleted.");
    }

    @Override
    public Category getById(int id) {
        System.out.println("Connecting database...");
        Category cp=new Category();
        cp.setId(1);
        return cp;
    }

    @Override
    public List<Category> getAll() {
        return null;
    }
}
