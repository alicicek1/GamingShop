package GamingShop.business.abstracts;

import GamingShop.core.abstracts.BaseService;
import GamingShop.model.concretes.User;

public interface UserService extends BaseService<User> {
    boolean login(User user);
}
