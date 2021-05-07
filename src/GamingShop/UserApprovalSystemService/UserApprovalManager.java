package GamingShop.UserApprovalSystemService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserApprovalManager {
    public String checkUserExistence(String identityNo, String name, String surname, Date birthDate) {
        if (identityNo != "123123123") {
            return "Check your identity no.";
        }
        if (name != "Ali") {
            return "Check your name.";
        }
        if (surname != "Cicek") {
            return "Check your surname.";
        }
        if (compareDates(birthDate, new Date(2000, 1, 1))) {
            return "Check your birthdate.";
        }
        return "Success.";
    }

    public static boolean compareDates(Date psDate1, Date psDate2) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = psDate1;
        Date date2 = psDate2;
        if (date2.after(date1)) {
            return true;
        } else
            return false;
    }
}

