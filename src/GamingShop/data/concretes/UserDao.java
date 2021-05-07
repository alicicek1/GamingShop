package GamingShop.data.concretes;

import GamingShop.data.abstracts.UserDaoI;
import GamingShop.model.concretes.User;

import java.util.List;

public class UserDao implements UserDaoI {
    @Override
    public void add(User entity) {
        System.out.println("Connecting database... " + entity.getUserName() + " added.");

    }

    @Override
    public void update(User entity) {
        System.out.println("Connecting database... " + entity.getUserName() + " updated.");

    }

    @Override
    public void delete(User entity) {
        System.out.println("Connecting database... " + entity.getUserName() + " deleted.");

    }

    @Override
    public void deleteById(int id) {
        User cp=new User();
        cp.setId(id);
        System.out.println("Connecting database... " + cp.getUserName() + " deleted.");
    }

    @Override
    public User getById(int id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
