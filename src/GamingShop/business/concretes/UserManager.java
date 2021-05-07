package GamingShop.business.concretes;

import GamingShop.business.abstracts.UserService;
import GamingShop.core.abstracts.UserApprovalService;
import GamingShop.model.concretes.User;

import java.util.List;

public class UserManager implements UserService {

    private UserApprovalService userApprovalService;

    public UserManager(UserApprovalService userApprovalService) {
        this.userApprovalService = userApprovalService;
    }

    @Override
    public void add(User entity) {
        if (entity.getUserName().length() <= 2) {
            System.out.println("User name must be at least three characters.");
        }
        System.out.println(this.userApprovalService.checkUserExistence(entity.getIdentityNo(), entity.getUserName(), entity.getLastName(), entity.getDateOfBirth()));
    }

    @Override
    public void update(User entity) {

    }

    @Override
    public void delete(User entity) {

    }

    @Override
    public User get(int id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public boolean login(User user) {
        User loginUser=new User();
        loginUser.setUserName("user");
        loginUser.setPassword("123");
        if(user.getUserName()=="user"&&user.getPassword()=="123"){
            return true;
        }
        return false;
    }
}
