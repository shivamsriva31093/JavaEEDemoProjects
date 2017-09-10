package repo;

import model.User;
import util.DBCon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by sHIVAM on 9/10/2017.
 */
public class UserDAO {
    private Connection dbConnection;

    public UserDAO() {
        dbConnection = DBCon.getConnection();
    }

    public boolean doesUserExist(String uname, String pwd) {
        try {
            String query = "Select * from test.auth_tb where username=?";
            PreparedStatement stmt = dbConnection.prepareStatement(query);
            stmt.setString(1, uname);

            ResultSet rs = stmt.executeQuery();
            if(rs != null) {
                if (rs.next())
                    return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public User findUserAfterAuthentication(String uname, String pwd) {
        try {
            String query = "Select password from test.auth_tb where username=?";
            PreparedStatement stmt = dbConnection.prepareStatement(query);
            stmt.setString(1, uname);

            ResultSet rs = stmt.executeQuery();
            if(rs != null) {
                while (rs.next()) {
                    if(rs.getString("password").equals(pwd)) {
                        User user = new User();
                        user.setUsername(uname);
                        user.setFname(rs.getString("fname"));
                        user.setMname(rs.getString("mname"));
                        user.setLname(rs.getString("lname"));
                        return user;
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
