package GamingShop.core.concretes;

import GamingShop.UserApprovalSystemService.UserApprovalManager;
import GamingShop.core.abstracts.UserApprovalService;

import java.util.Date;

public class UserApprovalManagerAdapter implements UserApprovalService {


    @Override
    public String checkUserExistence(String identityNo, String name, String surname, Date birthDate) {
        UserApprovalManager userApprovalManager = new UserApprovalManager();
        return userApprovalManager.checkUserExistence(identityNo, name, surname, birthDate);
    }
}
