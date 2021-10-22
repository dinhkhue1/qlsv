package com.mycompany.poly.app.helper;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Admin
 */
public class Dattabasehelper {
    public static Connection openConnection() throws Exception{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
        String connectionUrl = "jdbc:sqlserver://localhost;database=PolyApp;";  
        String dbusername = "sa";
        String password = "123456";
        Connection con = DriverManager.getConnection(connectionUrl, dbusername , password);
        return con;
    }
}
