package util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by sHIVAM on 9/10/2017.
 */
public class DBCon {
    private static Connection conn;

    public static void init() {
        try {
            InputStream inputStream = DBCon.class.getClassLoader()
                    .getResourceAsStream("db.properties");
            Properties properties = new Properties();
            if(properties != null) {
                properties.load(inputStream);

                String dbDriver = properties.getProperty("dbDriver");
                String connURL = properties.getProperty("connectionUrl");
                String uname = properties.getProperty("userName");
                String pwd = properties.getProperty("password");

                Class.forName(dbDriver).newInstance();
                conn = DriverManager.getConnection(connURL, uname, pwd);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        if(conn != null)
            return conn;
        init();
        return conn;
    }
}
