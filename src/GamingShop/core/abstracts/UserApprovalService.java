package GamingShop.core.abstracts;

import java.util.Date;

public interface UserApprovalService {
    public String checkUserExistence(String identityNo, String name, String surname, Date birthDate);
}
