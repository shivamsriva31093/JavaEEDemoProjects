package util.services;

import model.User;
import repo.UserDAO;

/**
 * Created by sHIVAM on 9/10/2017.
 */
public class UserAuthService {
    public User validateUser(String uname, String pwd) {
        UserDAO dao = new UserDAO();
        return dao.findUserAfterAuthentication(uname, pwd);
    }
}
