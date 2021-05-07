package GamingShop.business.concretes;

import GamingShop.business.abstracts.CategoryService;
import GamingShop.model.concretes.Category;

import java.util.List;

public class CategoryManager implements CategoryService {
    @Override
    public void add(Category entity) {
        if (entity.getCategoryName().length()<=2){
            System.out.println("Category name must be at least three characters.");
        }
        System.out.println("Success..");
    }

    @Override
    public void update(Category entity) {
        System.out.println("Success..");

    }

    @Override
    public void delete(Category entity) {
        System.out.println("Success..");

    }

    @Override
    public Category get(int id) {
        return null;
    }

    @Override
    public List<Category> getAll() {
        return null;
    }
}
